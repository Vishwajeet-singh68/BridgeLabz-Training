package streamapi;

import java.util.*;

public class EventWelcomeMessage {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Amit", "Rahul", "Priya", "Neha", "Rohit"
        );

        attendees.forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}

