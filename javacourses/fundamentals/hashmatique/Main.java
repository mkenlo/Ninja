
/**
 * 
 * 
 */
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Empire State of mind",
                "In New York (Ay, aha) (Uh, yeah),Concrete jungle (Yeah) where dreams are made of");
        trackList.put("My boo", "There's always that one person that will always have your heart");
        trackList.put("Girl on Fire", "This girl is on fire");
        trackList.put("Be with you", "I'd rather be with you, Cause I love the way you scream my name ");
        System.out.println("******** Track: Lyric *******************");
        trackList.forEach((track, lyric) -> System.out.println(track + ":" + lyric));

    }

}
