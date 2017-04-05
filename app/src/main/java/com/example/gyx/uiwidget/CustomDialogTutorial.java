package com.example.gyx.uiwidget;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class CustomDialogTutorial extends AppCompatActivity {
    View login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_tutorial);

        customView();
    }
    public void customView(){
        TableLayout loginForm = (TableLayout)getLayoutInflater()
                .inflate(R.layout.login, null);
        new AlertDialog.Builder(this)
                .setTitle("AlertDialog")
                .setView(loginForm)
                .setPositiveButton("登录", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){

                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which){

                    }
                })
                .create()
                .show();
    }
}
