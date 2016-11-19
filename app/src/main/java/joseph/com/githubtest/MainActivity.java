package joseph.com.githubtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView number;
    private Button generate;
    private Random rand;
    private int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
