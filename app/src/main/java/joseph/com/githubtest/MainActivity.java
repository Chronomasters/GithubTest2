package joseph.com.githubtest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

import java.util.Random;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView number;
    private Button generate;
    private Random rand;
    private int n;

    Button colorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        colorButton = (Button)findViewById(R.id.colorButton);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
                findViewById(R.id.activity_main).setBackgroundColor(color);
            }
        });

        number = (TextView) findViewById(R.id.number);
        generate = (Button) findViewById(R.id.generate);

        generate.setOnClickListener(this);

        rand = new Random();



    }

    @Override
    public void onClick(View view) {
        n = rand.nextInt(50) + 1;
        number.setText("" + n);
    }
}
