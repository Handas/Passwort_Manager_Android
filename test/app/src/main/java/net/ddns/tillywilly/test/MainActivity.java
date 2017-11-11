package net.ddns.tillywilly.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DB_CONN con = new DB_CONN();
        con.Connect();
        Toast.makeText(getApplicationContext(), con.err, Toast.LENGTH_LONG).show();
    }
}
