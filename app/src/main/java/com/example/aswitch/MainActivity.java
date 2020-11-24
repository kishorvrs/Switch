package com.example.aswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SwitchCompat switchCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchCompat=(SwitchCompat)findViewById(R.id.switch_id);

        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

             if (b)
             {
                 Toast.makeText(getApplicationContext(),"Switch is on",Toast.LENGTH_LONG).show();
             }
             else
                 {
                  Toast.makeText(getApplicationContext(),"Switch is off",Toast.LENGTH_LONG).show();
             }
            }
        });
    }
}
