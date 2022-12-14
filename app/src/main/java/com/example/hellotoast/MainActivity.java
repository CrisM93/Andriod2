package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount=10;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    mShowCount=(TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
     Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
       toast.show();
    }

    public void countUp(View view) {//metodo para mostrar al contador en la Text

        mCount--;
        if(mCount>-7){
        if(mShowCount !=null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        }//solo hasta -7 se queda el descontador en -6
        else{
            Toast toast2 = Toast.makeText(this, R.string.toast_message2,Toast.LENGTH_SHORT);
            toast2.show();
        }

    }
}