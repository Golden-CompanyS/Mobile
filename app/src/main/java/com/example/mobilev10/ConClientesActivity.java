package com.example.mobilev10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConClientesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_clientes);
    }

    // NAVEGAÇÃO

    public void abrirHomeActivity(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        this.overridePendingTransition(0, 0);
        finish();
    }

    public void abrirUserActivity(View view){
        Intent intent = new Intent(this, UserActivity.class);
        startActivity(intent);
        this.overridePendingTransition(0, 0);
        finish();
    }

    public void abrirAcoesActivity(View view){
        Intent intent = new Intent(this, AcoesActivity.class);
        startActivity(intent);
        this.overridePendingTransition(0, 0);
        finish();
    }

    public void abrirClientesActivity(View view){
        Intent intent = new Intent(this, ClientesActivity.class);
        startActivity(intent);
        this.overridePendingTransition(0, 0);
    }
}