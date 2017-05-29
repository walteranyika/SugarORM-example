package com.walter.ormexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputBook, inputAuthor, inputYear;
    TextView outputTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputBook= (EditText) findViewById(R.id.inputTitle);
        inputAuthor= (EditText) findViewById(R.id.inputAuthor);
        inputYear= (EditText) findViewById(R.id.inputYear);
        outputTotal= (TextView) findViewById(R.id.outputCount);
        int total= (int)Book.count(Book.class);
        outputTotal.setText("Total number of books "+total);

    }


    public void save(View view) {
        String title =inputBook.getText().toString().trim();
        String author =inputAuthor.getText().toString().trim();
        String year=inputYear.getText().toString();

        if(!title.isEmpty() && !author.isEmpty() && !year.isEmpty()){
            Book book=new Book(title,author,year);

            book.save();
            Toast.makeText(this, "Saved Book", Toast.LENGTH_SHORT).show();
            inputBook.setText("");
            inputYear.setText("");
            inputAuthor.setText("");
        }
        long id=1;
//        Book b= Book.findById(Book.class,id);
//        Log.d("Book", b.getTitle());
    }

    public void show(View view) {
        startActivity(new Intent(this, ShowActivity.class));
    }
}
