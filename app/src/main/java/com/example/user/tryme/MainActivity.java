package com.example.user.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View view1;
    private Button button;
    private int[] color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view1 = findViewById(R.id.mainView);
        button = findViewById(R.id.button2);

        color = new int[]{Color.BLACK, Color.RED, Color.GREEN, Color.MAGENTA, Color.BLUE, Color.YELLOW, Color.CYAN, Color.LTGRAY,
        Color.DKGRAY};

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colors = color.length;
                Random random = new Random();
                int randomNum = random.nextInt(colors);

                view1.setBackgroundColor(color[randomNum]);

            }
        });
    }
}
