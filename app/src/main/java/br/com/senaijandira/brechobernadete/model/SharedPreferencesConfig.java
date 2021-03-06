package br.com.senaijandira.brechobernadete.model;

import android.content.Context;
import android.content.SharedPreferences;

import br.com.senaijandira.brechobernadete.R;

public class SharedPreferencesConfig {

    //declarando atributos necessarios
    private SharedPreferences sharedPreferences;
    private Context context;

//    MÉTODO QUE CRIAO SHARED
    public SharedPreferencesConfig(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.login_preferences), Context.MODE_PRIVATE);
    }

//    MÉTODO QUE GRAVA O STATUS DO LOGIN
    public void writeLoginStatus(boolean status){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.login_status), status);
        editor.commit();
    }

//    MÉTODO QUE LÊ O NOME DO USUÁRIO
    public boolean readLoginStatus(){
        boolean status = false;
        status = sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status), false);
        return status;
    }

//    MÉTODO QUE GRAVA O NOME DO USUÁRIO
    public void writeUsuarioNome(String nome){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getResources().getString(R.string.usuario_nome), nome);
        editor.commit();
    }

//    MÉTODO QUE LÊ O NOME DO USUÁRIO
    public String readUsuarioNome(){
        String nome = "";
        nome = sharedPreferences.getString(context.getResources().getString(R.string.usuario_nome), "");
        return nome;
    }

//    MÉTODO QUE GRAVA O E-MAIL DO USUARIO
    public void writeUsuarioEmail(String email){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getResources().getString(R.string.usuario_email), email);
        editor.commit();
    }

//    MÉTODO QUE LÊ O E-MAIL DO USUÁRIO
    public String readUsuarioEmail(){
        String email = "";
        email = sharedPreferences.getString(context.getResources().getString(R.string.usuario_email), "");
        return email;
    }

    //    MÉTODO QUE GRAVA O ID DO USUARIO
    public void writeUsuarioId(int id){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(context.getResources().getString(R.string.usuario_id), id);
        editor.commit();
    }

    //    MÉTODO QUE LÊ O ID DO USUÁRIO
    public int readUsuarioId(){
        int id = 0;
        id = sharedPreferences.getInt(context.getResources().getString(R.string.usuario_id), 0);
        return id;
    }

    //    MÉTODO QUE GRAVA O TIPO DE USUARIO
    public void writeUsuarioTipo(String tipo){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getResources().getString(R.string.usuario_tipo), tipo);
        editor.commit();
    }

    //    MÉTODO QUE LÊ O TIPO DE USUÁRIO
    public String readUsuarioTipo(){
        String tipo= "";
        tipo = sharedPreferences.getString(context.getResources().getString(R.string.usuario_tipo), "");
        return tipo;
    }
}
