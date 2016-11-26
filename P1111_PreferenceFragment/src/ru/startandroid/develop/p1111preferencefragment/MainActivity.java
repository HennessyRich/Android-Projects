package ru.startandroid.develop.p1111preferencefragment;

import android.preference.PreferenceActivity;

import java.util.List;

public class MainActivity extends PreferenceActivity {

    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.pref_head, target);
    }
}