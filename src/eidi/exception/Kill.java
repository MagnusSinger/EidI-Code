package eidi.exception;

public class Kill {

    public static void kill() throws Killed {
        throw new Killed("What have you done?!");
    }

    public static void main(String[] args) {
        try {
            kill();
        } catch (RuntimeException r) {
            System.out.println("RunTimeException: " + r);
        } catch (Killed k) {
            System.out.println("Killed it!");
            System.out.println(k);
            System.out.println(k.getMessage());
        }
    }

}
