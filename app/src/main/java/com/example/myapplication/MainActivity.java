package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button login = (Button)  findViewById(R.id.login);
        EditText username = super.findViewById(R.id.username);//获取用户输入的用户名
        EditText password = super.findViewById(R.id.pwd);//获取用户密码
        login.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "登陆成功！", Toast.LENGTH_SHORT).show();//提示用户登陆成功
                ResultActivity.start(MainActivity.this);
            }
        });
    }
}
