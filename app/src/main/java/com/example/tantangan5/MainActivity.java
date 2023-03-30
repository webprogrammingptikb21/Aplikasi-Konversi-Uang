package com.example.tantangan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextRupiah, editTextHasil;
    private Button buttonKonversi;
    private RadioGroup radioGroup;
    private RadioButton radioButtonDollar, radioButtonYen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "On Create", Toast.LENGTH_LONG).show();
        editTextRupiah = findViewById(R.id.editTextRupiah);
        editTextHasil = findViewById(R.id.editTextHasil);
        buttonKonversi = findViewById(R.id.buttonKonversi);
        radioGroup = findViewById(R.id.radioGroup);
        radioButtonDollar = findViewById(R.id.radioButtonDollar);
        radioButtonYen = findViewById(R.id.radioButtonYen);

        buttonKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strRupiah = editTextRupiah.getText().toString();
                if (!strRupiah.isEmpty()){
                    double rupiah = Double.parseDouble(strRupiah);
                    double hasil;
                    if (radioButtonDollar.isChecked()){
                        hasil = rupiah / 14500;
                        editTextHasil.setText(String.format("$ %.2f", hasil));
                    } else if (radioButtonYen.isChecked()) {
                        hasil = rupiah / 135;
                        editTextHasil.setText(String.format("¥ %.2f", hasil));
                    } else {
                        Toast.makeText(getApplicationContext(), "Silahkan pilih jenis mata uang yang akan dikonversi", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getApplicationContext(), "Silahkan masukkan nilai rupiah yang akan dikonversi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_LONG).show();
    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restart", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "OnDeystroy", Toast.LENGTH_LONG).show();
    }
}