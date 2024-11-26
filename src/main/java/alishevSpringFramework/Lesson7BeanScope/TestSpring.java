package alishevSpringFramework.Lesson7BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson7Context.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);


        boolean comparison = firstMusicPlayer == secondMusicPlayer; // по ссылкам(указателям)
        System.out.println(comparison);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer); //одинаковые участки памяти занимают

        firstMusicPlayer.setVolume(10);
        // поменяли у одного,
        // но из-за scope=singleton 2ой музыкальный плеер тоже изменит значение
        // т.к 2ой просто ссылается на 1ый
        // если поменять scope=prototype то 1ый будет с громкостью 10,
        // второй будет создан новым на осонов lesson7Context.xml и там будет громкость 70
        System.out.println("1st volume: " + firstMusicPlayer.getVolume()
                + "\n2nd volume: " +secondMusicPlayer.getVolume());
        context.close();
    }
}
