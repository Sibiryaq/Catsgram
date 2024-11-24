package ru.solorepeat.Catsgram.SpringAndDB;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(toBuilder = true)
public class Point {
    int x;
    int y;
}
