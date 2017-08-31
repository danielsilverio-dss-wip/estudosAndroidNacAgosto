package br.com.fiap.estudosnacagosto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = (TextView) findViewById(R.id.txtResultado);

        Bundle bundle = getIntent().getExtras();

        int resultado = bundle.getInt("resultado");

        txtResultado.setText(Integer.toString(resultado));

    }



}
