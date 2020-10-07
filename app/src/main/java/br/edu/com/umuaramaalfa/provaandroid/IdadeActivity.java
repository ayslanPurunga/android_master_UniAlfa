package br.edu.com.umuaramaalfa.provaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class IdadeActivity extends AppCompatActivity {

    TextView lblNome, edtIdade;
    Button btnVoltar, btnIdade;
    Funcoes funcoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idade);

        funcoes = new Funcoes();
        lblNome = findViewById(R.id.lblNome);
        btnVoltar = findViewById(R.id.btnVoltar);
        btnIdade = findViewById(R.id.btnIdade);
        edtIdade = findViewById(R.id.edtIdade);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Intent tela = getIntent();

        if (tela != null) {
            Bundle parametros = tela.getExtras();

            if (parametros != null) {
                edtIdade.setText("Olá " + parametros.getString("nome"));

            }
        }

        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIdade.getText().toString().isEmpty()) {
                    funcoes.mostrarMensagem(IdadeActivity.this, "Atenção", "Sua Idade é obrigatório!");
                    return;
                }


                double valorIdade = 1;


                try {
                    valorIdade = Double.parseDouble(edtIdade.getText().toString());
                }
                catch (Exception ex) {
                    funcoes.mostrarMensagem(IdadeActivity.this, "Atenção", "Sua Idade está inválida!");
                    return;
                }

                if (valorIdade >= 18) {
                    Toast.makeText(IdadeActivity.this, "Atenção", Toast.LENGTH_LONG).show();
                    funcoes.mostrarMensagem(IdadeActivity.this, "Resultado", "Você é Maior de Idade!");
                }
                else if(valorIdade < 18) {
                    Toast.makeText(IdadeActivity.this, "Atenção", Toast.LENGTH_LONG).show();
                    funcoes.mostrarMensagem(IdadeActivity.this, "Resultado", "Você é Menor de Idade!");
                }
            }
        });



    }
}