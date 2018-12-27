package br.com.philippesis.atmconsultoria;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ContatoActivity extends AppCompatActivity {

    private TextView tvContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        tvContato = (TextView) findViewById(R.id.idtvContato);

        tvContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = "Contato";
                String body = "Gostaria que entrassem em contato comigo o quanto antes possível. Desde já agradeço.";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("mailto:contato@atm.com?subject="+subject+"&body="+body);
                intent.setData(uri);
                try {
                    startActivity(intent);
                } catch (Exception e) {
                    Log.e("Error: ", e.toString());
                }
            }
        });
    }
}
