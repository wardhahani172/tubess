package dimas.com.coursearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }


    public void pindahawal(View view) {
        Intent pindahawal = new Intent(homeActivity.this, MainActivity.class);
        startActivity(pindahawal);

    }

    public void pindahPrograming(View view) {
        Intent pindahPrograming = new Intent(homeActivity.this, programingActivity.class);
        startActivity(pindahPrograming);

    }
}