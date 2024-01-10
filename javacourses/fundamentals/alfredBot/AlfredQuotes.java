import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hi " + name + ". Lovely to see you";
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date.toString();
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > 0) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") > 0) {
            return "At your service. As you wish, naturally.";
        } else
            return "Right. And with that I shall retire.";
    }

    // NINJA BONUS
    // See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}
