package com.example.testgita;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button przycisk = findViewById(R.id.przycisk);
        EditText email = findViewById(R.id.email);
        EditText haslo = findViewById(R.id.haslo);
        EditText powtorzHaslo = findViewById(R.id.powtorzHaslo);
        TextView poleWynik = findViewById(R.id.wynik);
        poleWynik.setText("Autor: 2137");
        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_s = email.getText().toString();
                String haslo_s = haslo.getText().toString();
                String powtorzHaslo_s = powtorzHaslo.getText().toString();
                if(!email_s.contains("@")) poleWynik.setText("e-mail jest niepoprawny" + haslo_s);
                else if(!(haslo_s.equals(powtorzHaslo_s))) poleWynik.setText("hasła się różnią!");
                else poleWynik.setText("Witaj "+email_s);
            }
        });
    }
}