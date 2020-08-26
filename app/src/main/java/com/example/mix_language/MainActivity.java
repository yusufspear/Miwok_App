package com.example.mix_language;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button number,family_member,colors,phrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        initView();


    }

    public void Go(View view) {
        switch (view.getTag().toString()){
            case "0": startActivity(new Intent(this,Numbers.class));
            break;
            case "1": startActivity(new Intent(this,Family_Members.class));
            break;
            case "2": startActivity(new Intent(this,Colors.class));
            finish();
            break;
            case "3": startActivity(new Intent(this,Phrases.class));
            finish();
            break;
        }
    }

//    private void initView() {
//        number=findViewById(R.id.button0);
//        family_member=findViewById(R.id.button1);
//        colors=findViewById(R.id.button2);
//        phrases=findViewById(R.id.button3);
//    }
}