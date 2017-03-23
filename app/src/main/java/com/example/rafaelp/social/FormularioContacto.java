package com.example.rafaelp.social;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rafaelp.social.R;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class FormularioContacto extends AppCompatActivity {
    private ImageView imagenAtras,imagenestrella;
    private Intent intento;
    private TextView mensaje,correo;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_contacto);
        enviar=(Button)findViewById(R.id.enviar);
        mensaje=(TextView)findViewById(R.id.mensaje);
        correo=(TextView) findViewById(R.id.correo);
        imagenAtras=(ImageView) findViewById(R.id.imagenAtras);
        imagenestrella=(ImageView) findViewById(R.id.imagenestrella);
        imagenAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intento=new Intent(getBaseContext(),MainActivity.class);
                startActivity(intento);
            }
        });
        imagenestrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intento=new Intent(getBaseContext(),Favoritos.class);
                startActivity(intento);
            }
        });
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Properties props = new Properties();
                props.put("mail.smtp.host", "smtp.gmail.com");
                props.put("mail.smtp.socketFactory.port", "465");
                props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                props.put("mail.smtp.auth", "true");
                props.put("mail.smtp.port", "465");
                Session session = Session.getInstance(props, null);

                try {
                    MimeMessage msg = new MimeMessage(session);
                    msg.setFrom(correo.getText().toString());
                    msg.setRecipients(Message.RecipientType.TO,
                            "barboza.rafael.p@gmail.com");
                    msg.setSubject("Comentario Aplicacion");
                    msg.setSentDate(new Date());
                    msg.setText(mensaje.getText().toString());
                    Transport.send(msg, "me@example.com", "my-password");
                } catch (MessagingException mex) {
                    Snackbar.make(v,"Error al enviar mensaje",Snackbar.LENGTH_SHORT).show();
                }
            }
        });
    }
}
