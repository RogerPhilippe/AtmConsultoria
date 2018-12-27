package br.com.philippesis.atmconsultoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ServicoActivity extends AppCompatActivity {

    private TextView tvConsultenos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servico);

        tvConsultenos = (TextView) findViewById(R.id.idtvConsultenos);

        tvConsultenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String subject = "Cotação de Serviços";
                String body = "Gostaria que entrassem em contato comigo para saber sobre sua prestação de serviço. Desde já agradeço.";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri uri = Uri.parse("mailto:comercial@atm.com?subject="+subject+"&body="+body);
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
