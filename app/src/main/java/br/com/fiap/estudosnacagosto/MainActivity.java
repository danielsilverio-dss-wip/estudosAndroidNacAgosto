package br.com.fiap.estudosnacagosto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtValor1;
    private EditText edtValor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtValor1 = (EditText) findViewById(R.id.edtValor1);
        edtValor2 = (EditText) findViewById(R.id.edtValor2);

    }

    public void calcular(View v){
        int valor1 = Integer.parseInt(edtValor1.getText().toString());
        int valor2 = Integer.parseInt(edtValor2.getText().toString());

        int resultado = valor1 + valor2;

        Intent intent = new Intent(this, ResultadoActivity.class);
        intent.putExtra("resultado", resultado);

        startActivity(intent);

    }
}
