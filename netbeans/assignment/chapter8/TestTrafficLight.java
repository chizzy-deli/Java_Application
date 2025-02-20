
package assignment.chapter8;


public class TestTrafficLight {
    public class TestTrafficLight {
    public static void main(String[] args) {
        // Loop through each constant in the TrafficLight enum
        for (TrafficLight light : TrafficLight.values()) {
            // Print the name of the light and its duration
            System.out.println(light.name() + " light duration: " + light.getDuration() + " seconds.");
        }
    }
}

    
}
