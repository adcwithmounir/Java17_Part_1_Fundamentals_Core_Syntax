/**
 * Entry point of the ADC Flix platform.
 * @author Mounir
 */

public class StreamingPlatform {

    // Platform name
    String name;

    // Display a welcome message
    public void launch() {
        System.out.println("ADC Flix is live!");
    }

    public static void main(String[] args) {
        StreamingPlatform p =
                new StreamingPlatform();
        p.name = "ADC Flix";
        p.launch();
    }

}
