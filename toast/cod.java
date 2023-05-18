package com.example.aulatoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View View){

        // fazer com imagem ou texo
        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.btn_star); // para fazer com uma imagem baixada use R.drawable.nome_arq

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.color.teal_200); // muda a cor de fundo do texto
        textView.setTextSize(60);
        textView.setText("Olá Mundo");

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setView(imagem);
        toast.setView(textView);
        toast.show();

          // fazer com texto
//        Toast.makeText(
//                getApplicationContext(),
//                "NARAMENTOOOOOOOSSSSSSSSSS",
//                Toast.LENGTH_LONG
//        ).show();

    }
}
