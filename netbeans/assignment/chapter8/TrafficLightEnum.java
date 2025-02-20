
package assignment.chapter8;


public class TrafficLightEnum {
    // Define the TrafficLight enum with constants and a duration parameter
enum TrafficLight {
    RED(30),    // RED light lasts for 30 seconds
    GREEN(45),  // GREEN light lasts for 45 seconds
    YELLOW(5);  // YELLOW light lasts for 5 seconds

    // Instance variable to hold the duration of each light
    private final int duration;

    // Constructor to set the duration for each light
    TrafficLight(int duration) {
        this.duration = duration;
    }

    // Getter method to return the duration of the light
    public int getDuration() {
        return duration;
    }
}

    
}
