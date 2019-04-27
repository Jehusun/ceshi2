package com.example.jehusun.httpurlconnectiontest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {
    TextView responseText1;
    TextView responseText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent=getIntent();
        String name=intent.getStringExtra("param1");
        String money=intent.getStringExtra("param2");
        Button tuichu=(Button)findViewById(R.id.tuichu);
        responseText1=(TextView)findViewById(R.id.response1) ;
        responseText2=(TextView)findViewById(R.id.response2) ;
        responseText1.setText("用户："+name);
        //responseText2.setText(pass);
        responseText2.setText("钱包："+money);
        tuichu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //退出整个程序
                ActivityCollector.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
