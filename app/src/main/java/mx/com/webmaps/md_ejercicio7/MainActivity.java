package mx.com.webmaps.md_ejercicio7;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.activy_main);

        Snackbar.make(view,"Hello Snackbar",Snackbar.LENGTH_SHORT).show();
    }
}
