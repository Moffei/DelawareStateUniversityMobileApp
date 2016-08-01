package com.example.dsuappacademy.delawarestateuniversitymobileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FinancialAid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_aid);

        Button btn = (Button) findViewById(R.id.button5);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(FinancialAid.this , CampusActivity.class);
                startActivity(intent);

            }
        });

    }



    public void more (View view){goToURL ("http://www.desu.edu/financial-aid/investing-your-future-paying-college");}

    private void goToURL(String url) {

        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }


    }

