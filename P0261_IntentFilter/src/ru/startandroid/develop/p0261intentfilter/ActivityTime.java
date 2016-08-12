package ru.startandroid.develop.p0261intentfilter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Денис on 28.07.2016.
 */
public class ActivityTime extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm.ss");
        String time = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvTime = (TextView) findViewById(R.id.tvTime);
        tvTime.setText(time);
    }
}