package com.example.aulaswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch switchSenha;
    private ToggleButton toggleButtonLigado;
    private TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchSenha = findViewById(R.id.switchSenha);
        toggleButtonLigado = findViewById(R.id.toggleButtonLigado);
        resposta = findViewById(R.id.resposta);
        CarregarListener();
    }
    public void CarregarListener(){ // metodo para checar todo instante e da para fazer a mesma coisa com o toggleButton
        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    resposta.setText("Switch Ligado");
                }else{
                    resposta.setText("Switch Desligado");
                }

            }
        });// fecha o setOnCheckedChangeListener
    }
    public void Enviar(View view){ // metodo para usar em um botão

        if (switchSenha.isChecked()){ // mesma coisa para o toggleButton
            resposta.setText("Switch Ligado");
        }else{
            resposta.setText("Switch Desligado");
        }
    }


}
