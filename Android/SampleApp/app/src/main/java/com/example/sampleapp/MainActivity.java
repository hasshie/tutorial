package com.example.sampleapp;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity  {
    AlertDialog dialog;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //        builder = new AlertDialog.Builder(getActivity())
//                .setTitle("データの削除")
//                .setMessage("データを削除します。")
//                .setPositiveButton(R.string.app_name, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // User clicked OK button
//                    }
//                })
//                .setNegativeButton(R.string.hello_first_fragment, new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog, int id) {
//                        // User cancelled the dialog
//                    }
//                });
//        // ここにデータを削除するメソッドを記述
////        }

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Snackbar.make(v, "ボタン１が押されました", Snackbar.LENGTH_SHORT).show();
//                builder.create().show();


                BlankFragment dialogFragment = new BlankFragment();
                dialogFragment.show(getSupportFragmentManager(), "my_dialog");
            }
        });

// Set other dialog properties
//...

// Create the AlertDialog
//        dialog = builder.create();
    }

//
//    public void onClickBtn() {
//    }

//    @Override
//    public void onClick(View view) {
//        Snackbar.make(view, "aaa", Snackbar.LENGTH_LONG).show();
//
//    }
}