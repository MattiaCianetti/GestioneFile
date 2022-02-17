package com.example.gestionefile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnScrivi;
    Button btnLeggi;
    TextView txtTesto;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLeggi=(Button) findViewById(R.id.btnLeggi);
        btnScrivi=(Button) findViewById(R.id.btnScrivi);
        txtTesto=(TextView) findViewById(R.id.txtTesto);
        editText=(EditText) findViewById(R.id.editText);

    }

}