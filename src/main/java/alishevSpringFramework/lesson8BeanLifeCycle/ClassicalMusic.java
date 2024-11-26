package alishevSpringFramework.lesson8BeanLifeCycle;

public class ClassicalMusic implements Music {

    /**
     * Ограничение на создание объекта при помощи new, нужен для паттерна фабричный метод
     */
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    /*
    у методов init и destroy может быть любой модификатор доступа
    тип тоже может быть любой, но используется void, т.к нет возможности получить возвращаемое значение
    название может быть любым
    эти методы не должны принимать на вход какие-либо аргументы

    Для бинов со scope "prototype" Spring не вызывает метод destroy!!!
     */


}
