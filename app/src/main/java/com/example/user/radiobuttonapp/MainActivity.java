package com.example.user.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    RadioButton red, blue, green;
    Button change, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red=(RadioButton)(findViewById(R.id.rbred));
        blue=(RadioButton)(findViewById(R.id.rbblue));
        green=(RadioButton)(findViewById(R.id.rbgreen));
        change=(Button)(findViewById(R.id.btnchng));
        back=(Button)(findViewById(R.id.btnback));
    }

    public void buttonreturn(View view) {
    }

    public void buttonchange(View view) {
    }
}
