package sv.edu.utec.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class shorts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shorts);
    }
    public void boo(View v) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}