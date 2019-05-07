package tsubasa.csie.example.example09;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class SecondActivity extends Activity {
    ConstraintLayout t;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylayout2);
        t = findViewById(R.id.content);
        Button b2 = (Button)findViewById(R.id.button2);
        b2.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SecondActivity.this,MainActivity.class);
                startActivity(intent);
                SecondActivity.this.finish();
            }
        });

    }

    public void changebackgroundcolor (View v) {

        Random x = new Random();
        int r = x.nextInt(256);
        int b = x.nextInt(256);
        int g = x.nextInt(256);

        t.setBackgroundColor(Color.rgb(r,g,b));

    }

    public void changetextcolor2 (View v) {

        Random x = new Random();
        int r = x.nextInt(256);
        int b = x.nextInt(256);
        int g = x.nextInt(256);

        TextView t = findViewById(R.id.textView2);

        SpannableStringBuilder s = new SpannableStringBuilder(getString(R.string.act2));
        s.setSpan(new ForegroundColorSpan(Color.rgb(r,g,b)),8,17,0);

        t.setText(s);

    }

}
