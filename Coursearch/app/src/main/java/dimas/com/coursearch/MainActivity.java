package dimas.com.coursearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahHome(View view) {
        Intent pindahhome = new Intent(MainActivity.this, homeActivity.class);
        startActivity(pindahhome);

    }
}