package tsubasa.csie.example.example09;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                MainActivity.this.finish();
            }
        });

    }

    public void changecolor (View v) {

        Random x = new Random();
        int r = x.nextInt(256);
        int b = x.nextInt(256);
        int g = x.nextInt(256);

        TextView t = findViewById(R.id.textView);
        t.setTextColor(Color.rgb(r,g,b));

    }

}
