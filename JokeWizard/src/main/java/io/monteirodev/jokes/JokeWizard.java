package io.monteirodev.jokes;

public class JokeWizard {
    public String getJoke() {
        return "A wizard says: " + new JokeSmith().getJoke();
    }

}
