package com.st.smarttrash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new TrashFragment())
                    .commit();
        }

        Button btn_key = (Button) findViewById(R.id.insert_key);

        btn_key.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, InsertKey.class));
            }
        });

        Button btn_refresh = (Button) findViewById(R.id.refresh);

        btn_refresh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, new TrashFragment())
                        .commit();
            }
        });
    }
}
