package com.hofo.objectbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // do this in your activities/fragments to get hold of a Box
//        notesBox = ((App) getApplication()).getBoxStore().boxFor(Note.class);
    }
}
