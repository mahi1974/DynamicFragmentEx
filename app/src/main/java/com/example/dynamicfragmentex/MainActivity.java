package com.example.dynamicfragmentex;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction fn=fm.beginTransaction();
        fn.add(R.id.myview,new Frm1());
        fn.commit();
        Button btn1=findViewById(R.id.btn1);
        Button btn2=findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction fn=fm.beginTransaction();
                fn.replace(R.id.myview,new Frm1());
                fn.commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction fn=fm.beginTransaction();
                fn.replace(R.id.myview,new Frm2());
                fn.commit();
            }
        });
    }
}