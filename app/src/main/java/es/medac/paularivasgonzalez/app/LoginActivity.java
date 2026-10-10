package es.medac.paularivasgonzalez.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Vincula la lógica Java con el layout del Login
        setContentView(R.layout.activity_login);

        //Busca el boton de login por su ID en el Layout
        Button btnLogin = findViewById(R.id.btnLogin);

        //Le asignamos la accion al boton
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creamos el Intent para navegar desde la pantalla Login a la pantalla principal
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        });
    }
}