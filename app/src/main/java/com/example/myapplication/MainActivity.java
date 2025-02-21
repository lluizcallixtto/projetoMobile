package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        Carro c1 = new Carro("Ford", "Fiestra", "Vermelha", "Gasolina");

        Log.i("Carro:", "Marca: " + c1.getMarca());
        Log.i("Carro:", "Modelo: " + c1.getModelo());
        Log.i("Carro:", "Cor: " + c1.getCor());
        Log.i("Carro:", "Combustível: " + c1.getCombustivel());

//        Pessoa professor = new Pessoa();
//        professor.setIdade(35);
//        professor.setNome("Dioaódenes Carvsalho Matiias");


//        Log.i("Professor:", "Nome: " + professor.getNome());
//        Log.i("Professor:", "Idade: " + professor.getIdade());

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
    }
}