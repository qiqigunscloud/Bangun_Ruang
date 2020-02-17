package com.example.bangun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Main2Activity extends AppCompatActivity {
    private EditText etPanjang, etLebar, etTinggi;
    private Button btn_hasil, kerucut;
    private TextView tv_hasil;

    DecimalFormat df = new DecimalFormat("###.##");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btn_hasil = findViewById(R.id.btn_hasil);
        tv_hasil = findViewById(R.id.tv_hasil);
        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double dPanjang = Double.parseDouble(etPanjang.getText().toString());
                    double dLebar = Double.parseDouble(etLebar.getText().toString());
                    double dTinggi = Double.parseDouble(etTinggi.getText().toString());
                    double volume = dPanjang * dLebar / 2 * dTinggi / 3 ;
                    tv_hasil.setText(df.format(volume) + "  cm3");
                } catch (NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak Boleh Ada Yang Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
