package com.example.mix_language;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    @NonNull
    View listItemView;
    TextView miWok_textView,default_textView;

    public WordAdapter(@NonNull Context context, ArrayList<Word> Words) {
        super(context, 0, Words);
    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        if (convertView == null) {
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word currentWord=getItem(position);
        initView();
        assert currentWord != null;
        miWok_textView.setText(currentWord.getmMiwokTranslation());
        default_textView.setText(currentWord.getmDefaultTranslation());
        return listItemView;
    }

    private void initView() {
        miWok_textView=listItemView.findViewById(R.id.miWok_text_view);
        default_textView=listItemView.findViewById(R.id.default_text_view);
    }


}
