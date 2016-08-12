package ru.startandroid.develop.p0271getintentaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Денис on 28.07.2016.
 */
public class info extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        Intent intent = getIntent();
        String action = intent.getAction();
        String format = "", textInfo = "";

        if (action.equals("ru.startandroid.intent.action.showtime")) {
            format = "HH.mm.ss";
            textInfo = "Time:";
        }

        else if (action.equals("ru.startandroid.intent.action.showdate")) {
            format = "dd.MM.yyyy";
            textInfo = "Date:";
        }
        // в зависимости от содержимого переменной format
        // получаем дату или время в переменную datetime
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String datetime = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = (TextView) findViewById(R.id.tvInfo);
        tvDate.setText(textInfo + datetime);
    }
}