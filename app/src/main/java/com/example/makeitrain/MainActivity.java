package com.example.makeitrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

import static com.example.makeitrain.R.color.mycolor;

public class MainActivity extends AppCompatActivity {
//    private Button showmoney;
//    private Button showtag;
    private TextView moneytext;
    private TextView rich;
    private int moneycounter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneytext=findViewById(R.id.money_text);
//        showmoney=findViewById(R.id.button_hit);
//        showtag=findViewById(R.id.button_show_tag);

//        showmoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("mytag", "onClick: ");
//            }
//        });

    }
    public void showtag(View v)
    { //in message we can keep anything like "hello", strings which are present in strings.xml
        Toast.makeText(getApplicationContext(),R.string.app_name,Toast.LENGTH_LONG)
        .show();
        //Log.d("mytag", "onClick: Show money ");
    }
    public void makeitrain(View view)
    {
        NumberFormat numberFormat=NumberFormat.getCurrencyInstance();
        moneycounter+=1000;
        //when u want to use resources colour
        //moneytext.setTextColor(getResources().getColor(mycolor));
        switch (moneycounter)
        { case 10000:
            moneytext.setTextColor(Color.BLACK);
            break;
            case 15000:
                moneytext.setTextColor(Color.RED);
                break;
            case 20000:
                moneytext.setTextColor(Color.YELLOW);
                rich=findViewById(R.id.rich_guy);
                rich.setText(R.string.high_money);
                break;
                default:

        }
     moneytext.setText((String.valueOf(numberFormat.format(moneycounter))));
        //Log.d("MIR", "makeitrain: Tapped "+ moneycounter);


    }
}
