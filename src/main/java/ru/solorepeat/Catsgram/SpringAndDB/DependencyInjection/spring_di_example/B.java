package ru.solorepeat.Catsgram.SpringAndDB.DependencyInjection.spring_di_example;

import org.springframework.stereotype.Component;

@Component // указаываем, что В также нужно ддобавить в контекст
public class B {
    public void printName() {
        System.out.println("Это Б!");
    }
}
