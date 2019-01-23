package com.idn.avocadocode.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtPhi;
    private EditText edtJariJari;
    private EditText edtTinggi;
    private Button btnOke;
    private TextView txtHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penjalanTampilan();
        penjalanPerhitungan();
    }

    private void penjalanTampilan() {
        edtPhi = findViewById(R.id.editTextPhi);
        edtJariJari = findViewById(R.id.editTextJariJari);
        edtTinggi = findViewById(R.id.editTextTinggi);
        txtHasil = findViewById(R.id.textViewHasil);
        btnOke = findViewById(R.id.buttonOke);

    }

    private void penjalanPerhitungan() {
        btnOke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitung();
            }
        });

    }

    private void hitung() {

        double phi = Double.parseDouble(edtPhi.getText().toString());
        double jari = Double.parseDouble(edtJariJari.getText().toString());
        double tinggi = Double.parseDouble(edtTinggi.getText().toString());
        double hasil = phi * jari * jari * tinggi;
        txtHasil.setText(hasil + " adalah volume tabung");

    }
}
