package com.example.android.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       listView = (ListView) findViewById(R.id.myList);


       final ArrayList<String> myFriends = new ArrayList<String>(asList("bal7a","rozza","mafia","andrew"));

      // myFriends.add("bal7a");
      // myFriends.add("rozza");
      // myFriends.add("andrew");
      // myFriends.add("mafia");

       ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_2,myFriends);
       listView.setAdapter(arrayAdapter);



       // on item selected for spinners
       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


              // Toast.makeText(MainActivity.this,myFriends.get(position),Toast.LENGTH_SHORT).show();

               // switch (position) instead of get.id()

           }
       });

    }
}
