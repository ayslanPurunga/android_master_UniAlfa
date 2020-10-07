package br.edu.com.umuaramaalfa.provaandroid;

import android.content.Context;

import androidx.appcompat.app.AlertDialog;

public class Funcoes {
    public void mostrarMensagem(Context context, String sTitulo, String sMensagem) {
        androidx.appcompat.app.AlertDialog.Builder alerta = new AlertDialog.Builder(context);
        alerta.setTitle(sTitulo);
        alerta.setMessage(sMensagem);
        alerta.setNeutralButton("OK", null);
        alerta.show();
    }
}
