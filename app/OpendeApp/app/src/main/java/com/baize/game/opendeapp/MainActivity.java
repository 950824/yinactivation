package com.baize.game.opendeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        parseData();
    }

    private void parseData() {
        Uri data = getIntent().getData();
        if (data != null){
            String scheme = data.getScheme();
            String host = data.getHost();
            int port = data.getPort();
            String path = data.getPath();
            String query = data.getQuery();
            String message = data.getQueryParameter("message");
            Log.e(getClass().getSimpleName(),"scheme:"+scheme);
            Log.e(getClass().getSimpleName(),"host:"+host);
            Log.e(getClass().getSimpleName(),"port:"+port);
            Log.e(getClass().getSimpleName(),"path:"+path);
            Log.e(getClass().getSimpleName(),"query:"+query);

            if ("/first".equals(path)){
                FirstActivity.intent(this,message);
                finish();
            }else if ("/second".equals(path)){
                SecondActivity.intent(this,message);
                finish();
            }
        }
    }
}
