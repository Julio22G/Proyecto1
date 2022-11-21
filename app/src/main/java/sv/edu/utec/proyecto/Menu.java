package sv.edu.utec.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {

    ImageButton btncamisas,btnPantalones,btnshort,btnzapatos;
    Button btnSalir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btncamisas = findViewById(R.id.btnCamisas);
        btnshort = findViewById(R.id.btnShort);
        btnzapatos = findViewById(R.id.btnZapatos);
        btnPantalones = findViewById(R.id.btnPantalones);
        btnSalir = findViewById(R.id.btnSalir);

        btncamisas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent men = new Intent(getApplicationContext(),camisas.class);
                startActivity(men);
            }
        });

        btnshort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent men = new Intent(getApplicationContext(),shorts.class);
                startActivity(men);
            }
        });

        btnzapatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent men = new Intent(getApplicationContext(),Zapatos.class);
                startActivity(men);
            }
        });

        btnPantalones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent men = new Intent(getApplicationContext(),pantalones.class);
                startActivity(men);
            }
        });
        btnSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent men = new Intent(getApplicationContext(),Main_login.class);
                startActivity(men);
            }
        });
    }
}