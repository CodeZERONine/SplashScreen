package com.akshanshgusain.splashscreen;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class Splash_screenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Both ways works choose anyone.
        setTheme(android.R.style.Theme_Material_Light_NoActionBar_Fullscreen);
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Delay d=new Delay();
        d.start();
    }

    public class Delay extends Thread{
        public void run(){
            try {
                sleep(4000);
                startActivity(new Intent(Splash_screenActivity.this,MainActivity.class));
            }catch(Exception e){

            }
        }
    }
}
