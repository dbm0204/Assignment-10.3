package com.example.dbm0204.assignment103;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

/**
 * MainActivity extends ListActivity and is used to inflate the fragment List
 */
public class MainActivity extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getFragmentManager().findFragmentById(R.id.fragmentlist);

    }
}
