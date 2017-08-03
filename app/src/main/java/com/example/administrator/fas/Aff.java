package com.example.administrator.fas;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/8/2.
 */

public class Aff extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    Button btnf;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aff);
//        Intent.FLAG_ACTIVITY_CLEAR_TOP;
        btn= (Button) findViewById(R.id.btn_f);
     btn.setOnClickListener(this);
        btnf= (Button) findViewById(R.id.btn_ff);
        btnf.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_f:
        Intent intent = new Intent();
        intent.setClass(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //注意本行的FLAG设置
        startActivity(intent);
        finish();//关掉自己
                break;
            case R.id.btn_ff:
                startActivity(new Intent(this,Main2Activity.class));
                break;
        }
    }
}
