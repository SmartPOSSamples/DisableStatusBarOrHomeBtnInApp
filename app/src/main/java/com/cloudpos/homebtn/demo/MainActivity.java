package com.cloudpos.homebtn.demo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private static final String TAG = "DEBUG";
    protected static boolean isSuccessReturn = false;
    protected static boolean isSuccessMenu = false;
    private Button btn1_return = null;
    private Button btn2_menu = null;
    private Button btn3_back = null;
    private Button btn4_home = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        setContentView(R.layout.activity_main);
        btn1_return = findViewById(R.id.btn2_return);
        btn2_menu = findViewById(R.id.btn1_menu);
        btn3_back = findViewById(R.id.btn3_back);

        btn4_home = findViewById(R.id.btn4_home);
        btn3_back.setOnClickListener(v -> finish());
    }


    //Monitor physical keyboard
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_HOME) {
            Log.e("DEBUG", "KEYCODE_HOME");
//			android.os.Process.killProcess(android.os.Process.myPid());
            btn4_home.setBackgroundColor(Color.GREEN);
            return true;
        }
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            btn1_return.setBackgroundColor(Color.GREEN);
            Log.e(TAG, "KEYCODE_BACK");
            isSuccessReturn = true;
            return true;
        }
        if (keyCode == KeyEvent.KEYCODE_MENU) {
            btn2_menu.setBackgroundColor(Color.GREEN);
            Log.e(TAG, "KEYCODE_MENU");
            isSuccessMenu = true;
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

}
