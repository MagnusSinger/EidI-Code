package eidi.exception;

public class Killed extends Exception {

    public Killed(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "Job done.";
    }
}
