package com.naitiks.togglebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ToggleButton tb1 = (ToggleButton) findViewById(R.id.btn_toggle_1);
        final ToggleButton tb2 = (ToggleButton) findViewById(R.id.btn_toggle_2);
        Button submit = (Button) findViewById(R.id.btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button 1: "+ tb1.getText().toString()+
                                "  Button 2: "+ tb2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
