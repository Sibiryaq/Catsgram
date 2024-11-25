package alishevSpringFramework;

public class MusicPlayer {
    private ClassicalMusic classicalMusic;

    public void playMusic() {
        classicalMusic = new ClassicalMusic(); // зависимость от класса
        // ...  Код для воспроизведения музыки ...
    }
}
