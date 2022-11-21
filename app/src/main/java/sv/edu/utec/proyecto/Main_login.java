package sv.edu.utec.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main_login extends AppCompatActivity {

    EditText edtPass, edtUser;
    Button btnIngresar,btnRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);

        edtUser = findViewById(R.id.edtUser);
        edtPass = findViewById(R.id.edtPass);

        btnIngresar = findViewById(R.id.btnLogin);
        btnRegistrar = findViewById(R.id.btnRegistrase);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast mensaje;
                String user,pass;
                Intent men = new Intent(getApplicationContext(),Menu.class);
                user = edtUser.getText().toString();
                pass = edtPass.getText().toString();
                if (user.equals("Julio")){
                    if(pass.equals("123")){
                        mensaje = Toast.makeText(getApplicationContext(),"Bienvenidos",Toast.LENGTH_LONG);
                        startActivity(men);
                    }
                    else{
                        mensaje = Toast.makeText(getApplicationContext(),"Usuario y contraseñas invalidados",Toast.LENGTH_LONG);
                    }
                }
                else{
                    mensaje = Toast.makeText(getApplicationContext(),"Usuario  invalidado",Toast.LENGTH_LONG);
                }
                mensaje.show();
            }
        });

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent men = new Intent(getApplicationContext(),Registro.class);
                startActivity(men);
            }
        });


    }
}