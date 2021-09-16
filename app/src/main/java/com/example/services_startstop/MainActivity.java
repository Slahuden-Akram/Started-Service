package com.example.services_startstop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btnStartService = (Button) findViewById(R.id.btnStartService);
//        Button btnStopService = (Button) findViewById(R.id.btnStopService);
//
//        btnStartService.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, myService.class);
//                startService(intent);
//            }
//        });
    }

    public void Clicked(View view){
        switch (view.getId()){
            case R.id.btnStartService:
                Intent intent = new Intent(MainActivity.this, myService.class);
                startService(intent);
                break;
            case R.id.btnStopService:
                Toast.makeText(MainActivity.this, "Toasted", Toast.LENGTH_SHORT).show();

        }
    }
}