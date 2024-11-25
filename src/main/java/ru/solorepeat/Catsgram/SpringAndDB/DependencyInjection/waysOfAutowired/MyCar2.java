package ru.solorepeat.Catsgram.SpringAndDB.DependencyInjection.waysOfAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Всё ещё нельзя использовать final-поля, так как сеттер вызывается уже после создания объекта и требуется, чтобы поле было изменяемым.
 *
 * Есть риск упустить зависимость — забыть добавить сеттер с @Autowired.
 * В этом случае поле окажется пустым и программа может дать сбой.
 *
 * Одно из важных достоинств внедрения зависимостей через сеттеры — возможность работать с циклическими зависимостями
 */
@Component
public class MyCar2 {
    private Engine engine;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
