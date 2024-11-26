package alishevSpringFramework.lesson8BeanLifeCycle;

/**
 * Жизненный цикл бина (Bean LifeCycle)
 */
public class LifeCycle {
    /*
    Запускаем Spring-приложение
    Запускается Spring-контейнер (ApplicationContext) - читается config-file
    Создается объект бина
    В бин внедряются зависимости (Dependency Injection) учитывая описание бина в config-file
    Вызывается указанный init-method @PostConstruct инициализация ресурсов, обращение к внешним файлам, запуск БД
    Бин готов к использованию
    Какая-то работа с бином getBean()
    Вызывается указанный destroy-method @PreDestroy закрытие открытых ресурсов, потоков ввода-вывода, закрытие доступа к БД
    Остановка Spring-приложения

    В коде
    <bean id="musicBean"
          class="alishevSpringFramework.setterDIconfiguration.ClassicalMusic"
          init-method="doMyInit" - передаем имена методов
          destroy-method="doMyDestroy">  - передаем имена методов
    </bean>

    Методы doMyInit() и doMyDestroy()
    создаются в классе бина ClassicalMusic
     */


}
