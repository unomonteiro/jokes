package io.monteirodev.jokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView jokeView = findViewById(R.id.joke_text_view);
        jokeView.setText(new JokeSmith().getJoke());
    }
}
