package com.example.mix_language;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Numbers extends AppCompatActivity {

    ArrayList<Word> arrayList=new ArrayList<Word>();
    ListView listView;
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        listView=findViewById(R.id.listView);
//        gridView=findViewById(R.id.gridView);

        arrayList.add(new Word("One","lutti"));
        arrayList.add(new Word("Two","2 lutti"));
        arrayList.add(new Word("Three","3 lutti"));
        arrayList.add(new Word("Four","4 lutti"));
        arrayList.add(new Word("Five","5 lutti"));


        WordAdapter adapter=new WordAdapter(this,arrayList);

        listView.setAdapter(adapter);

//        gridView.setAdapter(adapter);

    }
}