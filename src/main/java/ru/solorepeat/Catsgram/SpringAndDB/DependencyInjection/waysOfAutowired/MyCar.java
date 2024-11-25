package ru.solorepeat.Catsgram.SpringAndDB.DependencyInjection.waysOfAutowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Нельзя использовать final-поля, т.к. для внедерения зависимости, поле должно оставаться изменяемым
 * Сложнее тестировать
 * Если нет бина в контейнере, то поле всеравно будет равно null, но об этом станет известно только при попытке к нему обратиться
 * Команда Spring не рекомендует использовать этот способ
 */
@Component
public class MyCar {
    @Autowired //внедрение зависимости напрямую в поле класса
    private Engine engine;

}
