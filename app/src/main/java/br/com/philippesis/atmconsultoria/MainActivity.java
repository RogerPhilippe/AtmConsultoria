package br.com.philippesis.atmconsultoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView ivEmpresa;
    private ImageView ivServicos;
    private ImageView ivClientes;
    private ImageView ivContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivEmpresa = (ImageView) findViewById(R.id.idivEmpresa);
        ivServicos = (ImageView) findViewById(R.id.idivServicos);
        ivClientes = (ImageView) findViewById(R.id.idivClientes);
        ivContatos = (ImageView) findViewById(R.id.idivContato);

        ivEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, EmpresaActivity.class));
            }
        });

        ivServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ServicoActivity.class));
            }
        });

        ivClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ClientesActivity.class));
            }
        });

        ivContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ContatoActivity.class));
            }
        });

    }
}
