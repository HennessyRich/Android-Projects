package ru.startandroid.develop.p0701saveinstancestate;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    final String LOG_TAG = "myLogs";
    int cnt = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.d(LOG_TAG, "onCreate")
    }
}
