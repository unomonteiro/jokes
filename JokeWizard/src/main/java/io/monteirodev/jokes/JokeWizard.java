package io.monteirodev.jokes;

public class JokeWizard {
    public String getJoke() {
        return new JokeSmith().getJoke();
    }

}
