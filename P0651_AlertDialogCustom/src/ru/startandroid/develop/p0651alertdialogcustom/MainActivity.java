package ru.startandroid.develop.p0651alertdialogcustom;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends Activity {

    final int DIALOG = 1;

    int btn;
    LinearLayout view;
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    TextView tvCount;
    ArrayList<TextView> textViews;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        textViews = new ArrayList<TextView>(10);
    }

    public void onclick(View v) {
        btn = v.getId();
        showDialog(DIALOG);
    }

    protected Dialog onCreateDialog(int id) {
        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("Custom dialog");

        view = (LinearLayout) getLayoutInflater().inflate(R.layout.dialog, null);
        adb.setView(view);
        tvCount = (TextView) view.findViewById(R.id.tvCount);
        return adb.create();
    }

    protected void onPrepareDialog (int id, Dialog dialog) {
        super.onPrepareDialog(id, dialog);
        if (id == DIALOG) {
            TextView tvTime = (TextView) dialog.getWindow().findViewById(R.id.tvTime);
            tvTime.setText(sdf.format(new Date(System.currentTimeMillis())));

            if (btn == R.id.btnAdd) {
                TextView tv = new TextView(this);
                view.addView (tv, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT));
                tv.setText("TextView = " + (textViews.size() + 1));

                textViews.add(tv);
            } else {
                if (textViews.size() > 0) {
                    TextView tv = textViews.get(textViews.size() - 1);
                    view.removeView(tv);
                    textViews.remove(tv);
                }
            }
            tvCount.setText("Кол-во TextView = " + textViews.size());
        }
    }
}
