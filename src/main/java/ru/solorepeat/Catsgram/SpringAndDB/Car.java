package ru.solorepeat.Catsgram.SpringAndDB;

import lombok.Builder;

@Builder
public class Car {
    private int power;
    private int weight;
    private int height;
    private int length;

    @Builder.Default
    private String color = "black";
    @Builder.Default
    private int numberOfWheels = 4;
    @Builder.Default
    private int numberOfDoors = 5;
}
