package ru.startandroid.develop.p0321simplebrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener{

    Button btnWeb;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        btnWeb = (Button) findViewById(R.id.btnWeb);
        btnWeb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ya.ru")));
    }
}
