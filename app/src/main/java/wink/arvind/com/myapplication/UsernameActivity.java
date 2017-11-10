package wink.arvind.com.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.startapp.android.publish.adsCommon.StartAppAd;

public class UsernameActivity extends AppCompatActivity {

EditText usernaem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_username);
        StartAppAd.showAd(UsernameActivity.this);

        getSupportActionBar().hide();
        usernaem = (EditText)findViewById(R.id.usernaem);
        findViewById(R.id.next_step).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = usernaem.getText().toString();
                if(data.length()>0){
                findViewById(R.id.next_step).setVisibility(View.GONE);
                findViewById(R.id.progressBar2).setVisibility(View.VISIBLE);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                            startActivity(new Intent(getApplicationContext(),Gemsgenrator.class));
                            finish();



                    }
                },2000);
                }else{

                }
            }
        });

    }
}
