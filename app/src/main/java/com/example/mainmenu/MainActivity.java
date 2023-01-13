package com.example.mainmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

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



        // https://stackoverflow.com/questions/22422196/android-listview-listselector-not-working

        listViewItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {


                TextView textView = (TextView) itemClicked;
                String strText = textView.getText().toString();

                if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_play))) {
                    startActivity(new Intent(MainActivity.this, GameActivity.class));

                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_help))) {
                    startActivity(new Intent(MainActivity.this, HelpActivity.class));

                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_settings))) {
                    startActivity(new Intent(MainActivity.this, SettingsActivity.class));

                } else if (strText.equalsIgnoreCase(getResources().getString(R.string.menu_item_scores))) {
                    startActivity(new Intent(MainActivity.this, ScoresActivity.class));

                }


            }


        });


    }
}