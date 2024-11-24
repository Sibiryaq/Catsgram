package ru.solorepeat.Catsgram.SpringAndDB.DependencyInjection;

/*
Класс NavigatorService получает зависимости MapService и LocationService
через конструктор. При этом зависимому классу не нужно знать ни о конечной реализации зависимостой,
ни  о том как правильно их создавать.
 */
public class NavigatorScreen {
    MapService mapService;
    LocationService locationService;
    int zoomLevel;

    public NavigatorScreen(MapService mapService, LocationService locationService) {
        this.mapService = mapService;
        this.locationService = locationService;
        this.zoomLevel = 5;
    }

}
