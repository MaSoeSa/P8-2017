package com.example.rasmus.p8_master;

import java.util.ArrayList;

import android.os.Bundle;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Context context;

    ArrayList imgCards;
    public static int [] images ={R.drawable.paint_rejsekort, R.drawable.paint_licence, R.drawable.paint_sundhedskort,
                                  R.drawable.paint_bankcard, R.drawable.paint_ungdomskort};
    public static String [] prgmNameList={"Let Us C", "hejej","hehrej", "hehej", "jugjug"};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context=this;
        lv=(ListView) findViewById(R.id.listOfCards);
        lv.setAdapter(new CustomAdapter(this, prgmNameList, images));

    }

   /** @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

}
