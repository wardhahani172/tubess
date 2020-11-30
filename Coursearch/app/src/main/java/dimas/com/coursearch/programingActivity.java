package dimas.com.coursearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class programingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programing);
    }

    public void balik(View view) {
        Intent balik = new Intent(programingActivity.this, homeActivity.class);
        startActivity(balik);

    }
}