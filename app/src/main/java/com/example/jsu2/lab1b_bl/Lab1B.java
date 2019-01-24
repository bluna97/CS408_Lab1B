package com.example.jsu2.lab1b_bl;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.*;
import java.util.ArrayList;


public class Lab1B extends AppCompatActivity {

    private ArrayList<String> helpLines;
    private ArrayList<String> helpLinesCopy;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        helpLines = new ArrayList<>();
        helpLines.add("you get knocked out");
        helpLines.add("you go somewhere else");
        helpLines.add("you find a dead man");
        helpLines.add("you find a dead woman");
        helpLines.add("you meet a buxom blonde");
        helpLines.add("someone has searched the place");
        helpLines.add("a crooked cop warns you");
        helpLines.add("you are arrested");
        helpLines.add("you find a gun");
        helpLines.add("you find a knife");
        helpLines.add("you find a frayed rope");
        helpLines.add("a bullet whizzes past your ear!");
        helpLines.add("you are almost run over");
        helpLines.add("you are being followed");
        helpLines.add("you smell familiar perfume");
        helpLines.add("the telephone rings");
        helpLines.add("there is a knock at the door");
        helpLines.add("you hear footsteps behind you ...");
        helpLines.add("you hear a gunshot!");
        helpLines.add("you hear a scream!");
        helpLines.add("you are not alone ...");
        helpLines.add("... forget this story, it stinks!");

        helpLinesCopy = resetHelpLines();
        }

    public ArrayList<String> resetHelpLines() {
        ArrayList<String> helpLinesCopy = new ArrayList<>();
        for(int i = 0; i < helpLines.size(); i++) {
            helpLinesCopy.add(helpLines.get(i));
        }
        return helpLinesCopy;
    }

    public void helpButtonClicked(View v) {
        TextView t = (TextView) findViewById(R.id.helpLabel);
        int selection = (int)(Math.random() * helpLinesCopy.size());
        t.setText(helpLinesCopy.get(selection));
        helpLinesCopy.remove(selection);

        if(helpLinesCopy.size() <= 0) {
            helpLinesCopy = resetHelpLines();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lab1_b, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
