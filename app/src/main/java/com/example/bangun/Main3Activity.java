package com.example.bangun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Main3Activity extends AppCompatActivity {
    private EditText pelukis, jari;
    private Button btn_hasil;
    private TextView tv_hasil;

    DecimalFormat df = new DecimalFormat("###.##");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        pelukis = findViewById(R.id.pelukis);
        jari = findViewById(R.id.jari);
        btn_hasil = findViewById(R.id.btn_hasil);
        tv_hasil = findViewById(R.id.tv_hasil);
        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dpelukis = Double.parseDouble(pelukis.getText().toString());
                    double djari = Double.parseDouble(jari.getText().toString());
                    double luas = 3.14 * djari *(djari + dpelukis);
                    tv_hasil.setText(df.format(luas) + "  cm");
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Ada Yang Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
