package io.monteirodev.jokes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import io.monteirodev.jokedisplay.JokeActivity;

import static io.monteirodev.jokedisplay.JokeActivity.EXTRA_JOKE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView jokeView = findViewById(R.id.joke_text_view);
        jokeView.setText(new JokeSmith().getJoke());

        TextView jokeWizardView = findViewById(R.id.joke_wizard_text_view);
        jokeWizardView.setText(new JokeWizard().getJoke());

        Button invokeButton = findViewById(R.id.invoke_button);
        invokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchJokeDisplayIntent();
            }


        });
    }

    private void launchJokeDisplayIntent() {
        String wizardJoke = new JokeWizard().getJoke();
        if (!TextUtils.isEmpty(wizardJoke)) {
            Intent jokeDisplayIntent = new Intent(this, JokeActivity.class);
            jokeDisplayIntent.putExtra(EXTRA_JOKE, wizardJoke);
            startActivity(jokeDisplayIntent);
        }
    }
}
