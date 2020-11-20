package com.baize.game.openapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.openMain).setOnClickListener(this);
        findViewById(R.id.openFirst).setOnClickListener(this);
        findViewById(R.id.openSecond).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
//                Intent intent = new Intent("com.baize.game.opendeapp.mainAction");
//                //当没有Category时会显示显示所有相应的action让其选
//                intent.addCategory("com.baize.game.opendeapp.mainCategory");
//                startActivity(intent);
        Intent intent = new Intent();
        intent.setAction("com.baize.game.opendeapp.mainAction");
        switch (v.getId()){
            case R.id.openMain:
                intent.setData(Uri.parse("open://jxp.com:8888"));
                break;
            case R.id.openFirst:
                intent.setData(Uri.parse("open://jxp.com:8888/first?message=Hello First"));
                break;
            case R.id.openSecond:
                intent.setData(Uri.parse("open://jxp.com:8888/second?message=Hello Second&mesage2=2"));
                break;
        }
        MainActivity.this.startActivity(intent);
    }
}
