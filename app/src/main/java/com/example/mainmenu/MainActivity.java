package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listViewItems = this.findViewById(R.id.listViewItems);
        String[] items = this.getResources().getStringArray(R.array.menu_items);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.menu_item, items);

        listViewItems.setAdapter(arrayAdapter);


        listViewItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {


                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();

                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))) {
                    Toast.makeText(MainActivity.this, "Play Game", Toast.LENGTH_SHORT).show();

                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))) {
                    Toast.makeText(MainActivity.this, "View Scores", Toast.LENGTH_SHORT).show();

                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))) {
                    Toast.makeText(MainActivity.this, "Help", Toast.LENGTH_SHORT).show();
                }


            }


        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);


        getMenuInflater().inflate(R.menu.gameoptions, menu);


        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);


        if (!item.getTitle().equals("buttomMenuOptions")) {
            Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        }


        return true;
    }

}