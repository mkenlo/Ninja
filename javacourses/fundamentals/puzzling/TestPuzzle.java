import java.util.ArrayList;

public class TestPuzzle {

    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle();
        System.out.println("-- Generate 10 numbers between 1 and 20: " + puzzle.getTenRolls());

        System.out.println("-- Generate a letter: " + puzzle.getRandomLetter());

        System.out.println("-- Generate a password: " + puzzle.generatePassword());

        System.out.println("-- Generate a set of passwords: " + puzzle.getNewPasswordSet(5));

    }

}
