# Main-Menu-Android

<details>

**<summary>Application Images</summary>**

<img src="resForReadme/mobile.gif">

</details>

## **Code**

<ul>

### <li>**Java files**

<ul>

<li>

<details>

**<summary>`MainActivity.java`</summary>**

```java
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
```

</details>

</li>

</ul>

</li>

### <li>**XML files**

<ul>

#### <li>**`drawable`**

<ul>

<li>

<details>

**<summary>`button_press.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval">

    <gradient
        android:angle="270"
        android:endColor="@android:color/transparent"
        android:startColor="@android:color/holo_orange_dark" />

</shape>
```

</details>

</li>

<li>

<details>

**<summary>`divider.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="oval">


    <gradient
        android:centerColor="@android:color/transparent"
        android:endColor="@color/white"
        android:startColor="@color/white" />


</shape>
```

</details>

</li>

</ul>

</li>

#### <li>**`layout`**

<ul>

<li>

<details>

**<summary>`activity_main.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/parentLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/background"
    tools:context=".MainActivity">


    <RelativeLayout
        android:id="@+id/relativeLayoutHeader"
        android:layout_width="match_parent"
        android:layout_height="wrap_content">


        <ImageView
            android:id="@+id/imageViewHeader"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:src="@drawable/mini_earth" />

        <TextView
            android:id="@+id/textViewHeader"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:layout_toEndOf="@+id/imageViewHeader"
            android:shadowColor="@color/title_glow"
            android:shadowDx="3"
            android:shadowDy="3"
            android:shadowRadius="5"
            android:text="@string/menu"
            android:textColor="@color/title_color"
            android:textSize="@dimen/screen_title_size" />

        <ImageView
            android:id="@+id/imageViewSecondHeader"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_toEndOf="@+id/textViewHeader"
            android:src="@drawable/mini_earth" />


    </RelativeLayout>


    <ListView
        android:id="@+id/listViewItems"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/relativeLayoutHeader"
        android:layout_marginHorizontal="20dp"
        android:divider="@drawable/divider"
        android:dividerHeight="5dp"
        android:listSelector="@drawable/button_press" />

    <ImageView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_marginBottom="-190dp"
        android:src="@drawable/earth" />


</RelativeLayout>
```

</details>

</li>

<li>

<details>

**<summary>`menu_item.xml`</summary>**

```xml
<TextView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="center_horizontal"
    android:gravity="center"
    android:shadowColor="@color/menu_glow"
    android:shadowDx="3"
    android:shadowDy="3"
    android:shadowRadius="5"
    android:textColor="@color/menu_color"
    android:textSize="@dimen/menu_item_size" />
```

</details>

</li>

</ul>

#### <li>**`menu`**

<ul>

<li>

<details>

**<summary>`gameoptions.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto">

    <item
        android:icon="@drawable/ic_baseline_more_vert_24"
        android:title="buttomMenuOptions"
        app:showAsAction="ifRoom">

        <menu>

            <item
                android:id="@+id/play_menu_item"
                android:icon="@drawable/ic_baseline_play_circle_24"
                android:title="@string/menu_item_play"
                app:showAsAction="never" />

            <item
                android:id="@+id/scores_menu_item"
                android:icon="@drawable/ic_baseline_scoreboard_24"
                android:title="@string/menu_item_scores" />

            <item
                android:id="@+id/settings_menu_item"
                android:icon="@drawable/ic_baseline_settings_24"
                android:title="@string/menu_item_settings"
                app:showAsAction="never" />

            <item
                android:id="@+id/help_menu_item"
                android:icon="@drawable/ic_baseline_help_24"
                android:title="@string/menu_item_help"
                app:showAsAction="never" />


        </menu>

    </item>

</menu>

```

</details>

</li>

</ul>

</li>

#### <li>**`values`**

<ul>

<li>

<details>

**<summary>`colors.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="purple_200">#FFBB86FC</color>
    <color name="purple_500">#FF6200EE</color>
    <color name="purple_700">#FF3700B3</color>
    <color name="teal_200">#FF03DAC5</color>
    <color name="teal_700">#FF018786</color>
    <color name="black">#FF000000</color>
    <color name="white">#FFFFFFFF</color>


    <color name="title_color">#f0f0f0</color>
    <color name="title_glow">#F00</color>
    <color name="menu_color">#FFFF0F</color>
    <color name="menu_glow">#F00</color>

</resources>
```

</details>

</li>

<li>

<details>

**<summary>`dimens.xml`</summary>**

```xml
<?xml version="1.0" encoding="utf-8"?>
<resources>


    <dimen name="screen_title_size">40sp</dimen>
    <dimen name="menu_item_size">34sp</dimen>


</resources>
```

</details>

</li>

<li>

<details>

**<summary>`strings.xml`</summary>**

```xml
<resources>
    <string name="app_name">Main Menu</string>


    <string name="menu">MAIN MENU</string>
    <string name="menu_item_play">Play Game</string>
    <string name="menu_item_scores">View Scores</string>
    <string name="menu_item_settings">Settings</string>
    <string name="menu_item_help">Help</string>


    <string-array name="menu_items">
        <item>@string/menu_item_play</item>
        <item>@string/menu_item_scores</item>
        <item>@string/menu_item_settings</item>
        <item>@string/menu_item_help</item>
    </string-array>


</resources>
```

</details>

</li>

</ul>

</li>

</ul>

</li>

</ul>

</ul>
