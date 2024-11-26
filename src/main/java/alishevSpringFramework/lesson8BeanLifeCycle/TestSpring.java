package alishevSpringFramework.lesson8BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "lesson8Context.xml");
        // здесь вызовется init
        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());


        //        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer; // по ссылкам(указателям)
//        System.out.println(comparison);
//
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer); //одинаковые участки памяти занимают
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println("1st volume: " + firstMusicPlayer.getVolume()
//                + "\n2nd volume: " +secondMusicPlayer.getVolume());
        context.close();
        // Здесь destroy
    }
}
