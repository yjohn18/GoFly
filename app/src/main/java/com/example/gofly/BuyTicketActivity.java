package com.example.gofly;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;

public class BuyTicketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_ticket);

        TextView date = findViewById(R.id.dateText);
        date.setText("2020年4月1日");
        date.setTextColor(Color.WHITE);

        TextView takeOffTime = findViewById(R.id.takeOffTimeText);
        takeOffTime.setTextColor(Color.WHITE);
        takeOffTime.setTextSize(32);
        takeOffTime.setText(takeOffTime.getText() + "\n北京");

        TextView landTime = findViewById(R.id.landTimeText);
        landTime.setTextColor(Color.WHITE);
        landTime.setTextSize(32);
        landTime.setText(landTime.getText() + "\n上海");

        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setColorFilter(0xFFFBC02D);

        // 为了视觉美观，price 与 flight 交换内容
        TextView price = findViewById(R.id.priceText);
        price.setTextColor(Color.WHITE);
        price.setTextSize(18);
        String p = price.getText().toString();

        // 用 flight 区域展示价格
        TextView flight = findViewById(R.id.flightNumberText);
        flight.setTextColor(Color.RED);
        flight.setTextSize(32);
        flight.getPaint().setFakeBoldText(true);
        price.setText(flight.getText());
        flight.setText(p);

        TextView classType = findViewById(R.id.classText);
        classType.setTextColor(Color.WHITE);


    }
}
