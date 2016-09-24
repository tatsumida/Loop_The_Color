package com.example.tatsumi.loopthecolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.danlew.android.joda.JodaTimeAndroid;

public class MainActivity extends AppCompatActivity {

    private boolean flag = false;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JodaTimeAndroid.init(this);
        setContentView(R.layout.activity_main);

        //オブジェクトの設定
        Button button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textView);
        EditText editText = (EditText)findViewById(R.id.editText);

        //ボタンにOnClickLister
        button.setOnClickListener(new View.OnClickListener(){
            //クリック時に呼ばれるイベント
            @Override
            public void onClick(View view){
                String str = "HELLO";
                textView.setText(str);
            }
        });
    }
}
