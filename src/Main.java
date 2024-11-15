import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Count dem = new Count();
        System.out.print("Please enter your word: ");
        String string = sc.nextLine();
        System.out.print("Please enter the letter: ");
        char letter = sc.next().charAt(0);
        System.out.println("The letter " + letter + " appears " + dem.count(string, letter) + " times.");

    }
}
