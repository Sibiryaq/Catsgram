package ru.solorepeat.Catsgram.SpringAndDB;

import lombok.extern.slf4j.Slf4j;

@Slf4j // Creates private static final Logger log = LoggerFactory.getLogger(LogExample.class);
public class Main {
    public static void main(String[] args) {
        Car firstCar = Car.builder()
                .color("white")
                .power(200)
                .height(1560)
                .length(4280)
                .weight(1450)
                .build();

        final Point point = Point.builder()
                .x(0)
                .y(0)
                .build();
        System.out.println(point);

        final Point point2 = point.
                toBuilder() //@Builder(toBuilder = true)
                .y(3)
                .build();
        System.out.println(point2);
    }
}
