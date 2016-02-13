package com.malinskiy.sofa.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            URLConnection connection = new URL("http://stackoverflow.com").openConnection();
            InputStream inputStream = connection.getInputStream();
            inputStream.read(new byte[1024]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
