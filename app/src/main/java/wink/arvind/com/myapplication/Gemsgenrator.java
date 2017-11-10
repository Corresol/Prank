package wink.arvind.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.startapp.android.publish.adsCommon.StartAppAd;

public class Gemsgenrator extends AppCompatActivity {

    EditText gems,coins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gemsgenrator);
        StartAppAd.showAd(Gemsgenrator.this);
        gems = (EditText)findViewById(R.id.gems);
        coins  = (EditText)findViewById(R.id.coins);
        getSupportActionBar().hide();
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gm = gems.getText().toString();
                String cin = coins.getText().toString();
                if(gm.equals("")){

                }else if(cin.equals("")){

                }else{
                    startActivity(new Intent(getApplicationContext(),SuccessActivity.class));
                    finish();
                }


            }
        });
    }

}
