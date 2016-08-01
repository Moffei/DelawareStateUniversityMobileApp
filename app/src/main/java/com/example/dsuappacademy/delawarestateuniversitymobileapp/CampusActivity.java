package com.example.dsuappacademy.delawarestateuniversitymobileapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CampusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus);}

    public void website (View view){
        goToURL ("http://www.desu.edu/student-affairs/office-student-leadership-activities");
    }

    public void housing (View view){
        goToURL ("http://www.desu.edu/student-affairs/residential-halls");
    }

    public void rec (View view){
        goToURL ("http://www.desu.edu/student-affairs/department-wellness-recreation");
    }



    private void goToURL(String url) {

        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}



