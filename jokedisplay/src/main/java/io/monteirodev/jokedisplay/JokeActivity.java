package io.monteirodev.jokedisplay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JokeActivity extends AppCompatActivity {

    public static String EXTRA_JOKE = "io.monteirodev.jokedisplay.EXTRA_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
    }
}
