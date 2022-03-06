package com.example.listyy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView myL;
    String countryL[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myL=findViewById(R.id.listy);
        countryL=getResources().getStringArray(R.array.country);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,countryL);
        myL.setAdapter(arrayAdapter);
        myL.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Chalo"+adapterView.getItemAtPosition(i),Toast.LENGTH_SHORT).show();
            }
        });
    }
}