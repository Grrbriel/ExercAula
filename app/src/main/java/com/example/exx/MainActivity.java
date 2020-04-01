package com.example.exx;

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

    public void ex31click(View view) {
        startActivity(new Intent(this, ex31Activity.class));
    }

    public void ex32click(View view) {
        startActivity(new Intent(this, ex32Activity.class));
    }

    public void ex33click(View view) {
        startActivity(new Intent(this, ex33Activity.class));
    }

    public void ex34click(View view) {
        startActivity(new Intent(this, ex34Activity.class));
    }
}
