package alishevSpringFramework;

/**
 * Бины это Java объекты, созданные с помощью Springa
 * Бины создаются из Java классов
 * <p>
 * <bean id="musicPLayerBeaN
 *       class="alishevSpringFrameworkMusicPlayerBean">
 *       <constructor-arg value="ClassicalMusic"/>
 * <bean/>
 */
public class MusicPlayer {
    private Music music; // всегда слева лучше интерфейс, так можем изменить конкретную реализацию

    public void playMusic() {
        music = new ClassicalMusic();
        // или
        music = new RockMusic();
        //  "-": Объекты создаются в ручную
        //       Слабая зависимость
        // Решение - использрвать Spring Framework который сам создаст необходимые объекты (бины)
        // согласно конфиругационому файлу
    }
}
