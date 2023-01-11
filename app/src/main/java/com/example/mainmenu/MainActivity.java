package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listViewItems = this.findViewById(R.id.listViewItems);
        String[] items = {
                this.getResources().getString(R.string.menu_item_play),
                this.getResources().getString(R.string.menu_item_scores),
                this.getResources().getString(R.string.menu_item_settings),
                this.getResources().getString(R.string.menu_item_help)
        };

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.menu_item, items);

        listViewItems.setAdapter(arrayAdapter);


    }
}