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
    Вызывается указанный init-method @PostConstruct например открытие и настройка к-либо ресурсов
    Бин готов к использованию
    Какая-то работа с бином getBean()
    Вызывается указанный destroy-method @PreDestroy закрытие открытых ресурсов
    Остановка Spring-приложения

     */
}
