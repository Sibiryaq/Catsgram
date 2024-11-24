package ru.solorepeat.Catsgram.SpringAndDB.DependencyInjection.spring_di_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // Аннотация указывает, что класс нужно добавить в контекст
public class A {
    private final B b;

    @Autowired //сообщаем Spring, что нужно передать в конструктор объект класса B
    public A(B b) {
        this.b = b;
    }

    public void printName() {
        System.out.println("Это А!");
        b.printName();
    }
}
