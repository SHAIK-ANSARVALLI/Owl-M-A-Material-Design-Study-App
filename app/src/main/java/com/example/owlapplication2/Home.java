package com.example.owlapplication2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4;

    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv4 = findViewById(R.id.cv4);

        logout = findViewById(R.id.logout);

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCourse1();
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCourse2();
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCourse3();
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toCourse4();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toLogin();
                finish();
            }
        });

    }
    private void toCourse1() {
        Intent intent = new Intent(this,Course1.class);
        startActivity(intent);
    }
    private void toCourse2() {
        Intent intent = new Intent(this,Course2.class);
        startActivity(intent);
    }
    private void toCourse3() {
        Intent intent = new Intent(this,Course3.class);
        startActivity(intent);
    }
    private void toCourse4() {
        Intent intent = new Intent(this,Course4.class);
        startActivity(intent);
    }
    private void toLogin() {
        Intent intent = new Intent(this, Login.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
