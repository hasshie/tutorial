package com.example.sampleapp;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
//implements AdapterView.OnItemSelectedListener
public class MainActivity extends AppCompatActivity  {
    AlertDialog dialog;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("### MainActivity" , String.format("STEP: %s", "onCreate"));
        Toast.makeText(this, "MainActivity onCreate",Toast.LENGTH_LONG).show();;
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Snackbar.make(v, "ボタン１が押されました", Snackbar.LENGTH_SHORT).show();
//                builder.create().show();


                BlankFragment dialogFragment = new BlankFragment();
                dialogFragment.show(getSupportFragmentManager(), "my_dialog");
            }
        });


        ListView lv = findViewById(R.id.listView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item , new String[] {
                "aaa",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",
                "aaa",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB",  "BBB"
        });
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("### MainActivity.onItemClick" , String.format("STEP: %s", i));
            }
        });
        lv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("### MainActivity.onItemSelected" , String.format("STEP: %s", i));
//                Toast.makeText(this, "MainActivity:" + i,Toast.LENGTH_LONG).show();;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Log.d("### MainActivity.onNothingSelected" , String.format("getSelectedItemPosition: %s",adapterView.getSelectedItemPosition()));

//                Toast.makeText(this, "MainActivity:onNothingSelected",Toast.LENGTH_LONG).show();;

            }
        });

    }

//    @Override
//    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//        Log.d("### " , String.format("STEP: %s", i));
//        Toast.makeText(this, "MainActivity:" + i,Toast.LENGTH_LONG).show();;
//    }

//    @Override
//    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//        Log.d("### MainActivity.onItemSelected" , String.format("STEP: %s", i));
//        Toast.makeText(this, "MainActivity:" + i,Toast.LENGTH_LONG).show();;
//    }
//
//    @Override
//    public void onNothingSelected(AdapterView<?> adapterView) {
//        Log.d("### MainActivity.onNothingSelected" , String.format("STEP: %s",adapterView.toString()));
//
//        Toast.makeText(this, "MainActivity:onNothingSelected",Toast.LENGTH_LONG).show();;
//    }
}