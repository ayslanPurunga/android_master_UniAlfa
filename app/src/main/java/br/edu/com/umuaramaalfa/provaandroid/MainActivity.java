package br.edu.com.umuaramaalfa.provaandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView lblNome, lblRA;
    EditText edtNome, edtRA;
    Button btnGravar, btnTela, btnWeb;
    ImageView imagem;
    Funcoes funcoes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funcoes = new Funcoes();
        lblNome = findViewById(R.id.lblNome);
        lblRA = findViewById(R.id.lblRA);
        edtNome = findViewById(R.id.edtNome);
        edtRA = findViewById(R.id.edtRA);
        btnGravar = findViewById(R.id.btnGravar);
        btnTela = findViewById(R.id.btnTela);
        btnWeb = findViewById(R.id.btnWeb);
        imagem = findViewById(R.id.imagem);


        btnGravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (edtNome.getText().toString().isEmpty()) {
                   funcoes.mostrarMensagem(MainActivity.this, "Atenção", "Seu Nome está vazio!");
                   return;

               }
               if (edtRA.getText().toString().isEmpty()) {
                   funcoes.mostrarMensagem(MainActivity.this, "Atenção", "Seu RA é obrigatório!");
                   return;
               }
                funcoes.mostrarMensagem(MainActivity.this, "Atenção", "Nome e RA enviados com sucesso!");
                return;
            }

        });
                btnTela.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent tela = new Intent(MainActivity.this, IdadeActivity.class);
                        Bundle parametros = new Bundle();
                        parametros.putString("nome", edtNome.getText().toString());
                        tela.putExtras(parametros);
                        startActivity(tela);
                    }
                });

                btnWeb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent tela = new Intent(MainActivity.this, SiteActivity.class);
                        startActivity(tela);
                    }
                });
    }
}