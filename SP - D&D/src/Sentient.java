public interface Sentient {

    // ================FIELDS==================


    // ================BEHAVIORS==================

    public default void speak(String words) {
        System.out.println("Hello!");
    }

}
