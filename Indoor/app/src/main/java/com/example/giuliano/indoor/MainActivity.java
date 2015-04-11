package com.example.giuliano.indoor;

import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.List;
import android.net.wifi.ScanResult;

public class MainActivity extends Activity {

    WifiManipulator wifi = new WifiManipulator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View view){

        TextView result = (TextView) findViewById(R.id.value);

        List<ScanResult> results = wifi.getConections(this);

        if(results!=null){

            StringBuilder info = new StringBuilder();

            for(ScanResult connection: results){
                result.setText(info.append("Wifi Network").append("\n").append("ID: ").append(connection.BSSID).append("\n").append(String.valueOf(connection.level)).append("\n\n\n"));
            }

        } else {
            result.setText("Sorry, no connections");
        }

    }

}
