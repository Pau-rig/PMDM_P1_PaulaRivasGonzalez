package es.medac.paularivasgonzalez.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Vincula la lógica Java con el layout del Login
        setContentView(R.layout.activity_login);
    }
}