package com.baize.game.opendeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public static void intent(Context context, String message) {
        Intent intent = new Intent(context,SecondActivity.class);
        intent.putExtra("message",message);
        context.startActivity(intent);
    }
}
