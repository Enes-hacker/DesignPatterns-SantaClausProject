package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {

        if(instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void postMessage(String message) {
        System.out.println("Santa Claus: " + message);
    }


    /* Singleton Pattern се използва за създаване на един единствен обект, не можем да създадем повече от един обект.
    В случая нашият обект е Дядо Коледа. И този обект може да има само една инстанция
     */
}
