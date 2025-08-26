import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv inn ditt fornavn:");
        String navn = input.nextLine();

        System.out.println("Skriv inn ditt etternavn:");
        String etternavn = input.nextLine();

        String fulltNavn = navn + " " + etternavn;

        System.out.println("Tenk at jeg, " + fulltNavn + ", har naila oblig 1 allerede!");
    }
}