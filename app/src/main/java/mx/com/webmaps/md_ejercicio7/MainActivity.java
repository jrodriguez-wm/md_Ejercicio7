package mx.com.webmaps.md_ejercicio7;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.activy_main);

        snackbar = Snackbar.make(view, "Hello SnackBar", Snackbar.LENGTH_INDEFINITE);

        snackbar.setDuration(5000);

        snackbar.show();

        //snackbar.dismiss();

        //Snackbar.make(view,"Hello Snackbar",Snackbar.LENGTH_SHORT).show();
    }
}
