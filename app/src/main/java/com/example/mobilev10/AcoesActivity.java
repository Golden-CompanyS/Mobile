package com.example.mobilev10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcoesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acoes);
    }

    public void abrirSociosActivity(View view){
        Intent intent = new Intent(this, SociosActivity.class);
        startActivity(intent);
    }

    public void abrirServicosActivity(View view){
        Intent intent = new Intent(this, ClientesActivity.class);
        startActivity(intent);
    }

    public void abrirClientesActivity(View view){
        Intent intent = new Intent(this, ClientesActivity.class);
        startActivity(intent);
    }

    public void abrirAtividadesActivity(View view){
        Intent intent = new Intent(this, AtividadesActivity.class);
        startActivity(intent);
    }


    // NAVEGAÇÃO

    public void abrirHomeActivity(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void abrirUserActivity(View view){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
    }

    public void abrirAcoesActivity(View view){
        Intent intent = new Intent(this, AcoesActivity.class);
        startActivity(intent);
    }

}