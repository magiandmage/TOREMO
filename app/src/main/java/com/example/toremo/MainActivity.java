package com.example.toremo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText ninzuu; //人数への参照
    private EditText goukei; //合計金額への参照
    private TextView kekka; //結果への参照
    private Button start; //スタートボタンへの参照

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    };


    //てすと～～111111222222