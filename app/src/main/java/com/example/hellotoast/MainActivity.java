package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
//ESTOY DESDE ANDRIOD2.1.._Zero
public class MainActivity extends AppCompatActivity {

    private int mCount=0;
    private TextView mShowCount;


   //volley
   //retrofit2
   //gson_
    //crear dos actividades_de una actividad a otra_
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    mShowCount=(TextView) findViewById(R.id.show_count);
    }

    /*@Override
    protected void onResume() {
        super.onResume();
        Log.d("Mainactivity", "onresume_checar en un log" );
    }*/

    public void showToast(View view) {
     Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
       toast.show();
    }

    public void zeroUp(View view){
        Toast toast2 = Toast.makeText(this, R.string.toast_message2,Toast.LENGTH_SHORT);
        toast2.show();
        mCount=0;
        if(mShowCount !=null) {
            mShowCount.setText(Integer.toString(0));
        }

    }

    public void countUp(View view) {

        mCount++;
        if(mShowCount !=null) {
            mShowCount.setText(Integer.toString(mCount));
        }


    }
}