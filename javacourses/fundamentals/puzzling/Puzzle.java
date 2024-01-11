import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
    private Random rand;

    public Puzzle() {
        this.rand = new Random();
    }

    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> tens = new ArrayList<Integer>();
        int n;
        for (int i = 0; i < 10; i++) {
            n = this.rand.nextInt(21);
            while (n == 0)
                n = this.rand.nextInt(21);
            tens.add(n);
        }
        return tens;
    }

    public char getRandomLetter() {

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (Character i = 'a'; i <= 'z'; i++)
            alphabet.add(i);
        int index = this.rand.nextInt(26);

        return alphabet.get(index);
    }

    public String generatePassword() {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            strBuilder.append(getRandomLetter());
        }

        return strBuilder.toString();
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwords = new ArrayList<String>();
        for (int i = 0; i < length; i++) {
            passwords.add(generatePassword());
        }
        return passwords;
    }

}
