package streamapi;

import java.util.*;

class SensorReading {
    int sensorId;
    double value;

    public SensorReading(int sensorId, double value) {
        this.sensorId = sensorId;
        this.value = value;
    }
}

public class IoTSensorReadings {

    public static void main(String[] args) {

        List<SensorReading> readings = Arrays.asList(
            new SensorReading(1, 45.5),
            new SensorReading(2, 78.2),
            new SensorReading(3, 32.1),
            new SensorReading(4, 90.6),
            new SensorReading(5, 60.0),
            new SensorReading(6, 25.4),
            new SensorReading(7, 85.9),
            new SensorReading(8, 40.0),
            new SensorReading(9, 95.3),
            new SensorReading(10, 55.8)
        );

        double threshold = 60.0;

        System.out.println("Sensor readings above threshold:");

        readings.stream()
                .filter(r -> r.value > threshold)
                .forEach(r ->
                    System.out.println("Sensor " + r.sensorId + " : " + r.value)
                );
    }
}

