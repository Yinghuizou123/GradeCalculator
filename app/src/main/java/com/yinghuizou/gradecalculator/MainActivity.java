package com.yinghuizou.gradecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button button = (Button) findViewById(R.id.button2);


        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent UserPage= new Intent(MainActivity.this,Calculator.class);
                startActivity(UserPage);

            }


        } );


    }


}
