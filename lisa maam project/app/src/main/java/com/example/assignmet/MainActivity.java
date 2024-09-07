package com.example.assignmet;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;
    private ImageView imageView;
    private boolean isClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isClicked) {
                    textView.setText("Button Clicked!");
                    Toast.makeText(MainActivity.this, "Button has been clicked!", Toast.LENGTH_SHORT).show();
                    isClicked = true;
                } else {
                    textView.setText("Welcome to Simple UI App");
                    Toast.makeText(MainActivity.this, "Resetting Text", Toast.LENGTH_SHORT).show();
                    isClicked = false;
                }
            }
        });
    }
}
