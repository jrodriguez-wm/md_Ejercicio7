package mx.com.webmaps.md_ejercicio7;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = (FloatingActionButton) findViewById(R.id.fab_id);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar = Snackbar.make(v, "Message Sent", Snackbar.LENGTH_INDEFINITE);

                snackbar.setDuration(4000);
                snackbar.show();
            }
        });




        /*snackbar = Snackbar.make(view, "Hello SnackBar", Snackbar.LENGTH_INDEFINITE);

        snackbar.setDuration(5000);

        snackbar.show();

        //snackbar.dismiss();

        //Snackbar.make(view,"Hello Snackbar",Snackbar.LENGTH_SHORT).show();
        */
    }
}
