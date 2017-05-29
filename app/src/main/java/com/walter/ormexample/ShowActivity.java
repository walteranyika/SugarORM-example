package com.walter.ormexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Iterator;

public class ShowActivity extends AppCompatActivity {
    ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        mListView= (ListView) findViewById(R.id.booksList);
        ArrayList<String> all=new ArrayList<>();
        Iterator<Book> books= Book.findAll(Book.class);
        while (books.hasNext()){
            Book b= books.next();
            all.add(b.getTitle());
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,all);
        mListView.setAdapter(adapter);

    }
}
