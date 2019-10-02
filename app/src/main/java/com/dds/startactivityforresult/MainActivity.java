package com.dds.startactivityforresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final int REQUEST_RESULTADO = 14521452;

    private Button btnSomar;
    private Button btnSubtrair;
    private Button btnMultiplicação;
    private Button btnDivisão;
    private TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSomar = findViewById(R.id.btnSomar);
        btnSubtrair = findViewById(R.id.btnSubtrair);
        btnMultiplicação = findViewById(R.id.btnMultiplicação);
        btnDivisão = findViewById(R.id.btnDivisão);
        txtResultado = findViewById(R.id.txtResultado);

    }

    public void somar(View v) {

        Intent i = new Intent();
        i.setClass( MainActivity. this, ResultadoActivity.class);
        i.putExtra( "operacão", "somar");
        startActivityForResult(i, REQUEST_RESULTADO);

    }

    public void subtrair(View v) {

        Intent i = new Intent();
        i.setClass( MainActivity. this, ResultadoActivity.class);
        i.putExtra( "operacão", "subtrair");
        startActivityForResult(i, REQUEST_RESULTADO);
    }

    public void multiplicação(View v) {

        Intent i = new Intent();
        i.setClass( MainActivity. this, ResultadoActivity.class);
        i.putExtra( "operacão", "multiplicação");
        startActivityForResult(i, REQUEST_RESULTADO);
    }

    public void divisão(View v) {

        Intent i = new Intent();
        i.setClass( MainActivity. this, ResultadoActivity.class);
        i.putExtra( "operacão", "divisão");
        startActivityForResult(i, REQUEST_RESULTADO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if ( requestCode == REQUEST_RESULTADO && resultCode == RESULT_OK){
            txtResultado.setText(String.valueOf(data.getDoubleExtra("resultado", 0)));
        }
    }
}
