import java.util.Scanner;

public class ConvertirEnHeuresMinutesSecondes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande de saisie
        System.out.print("Entrez le nombre total de secondes : ");
        int totalSecondes = scanner.nextInt();

        // Calcul des heures, minutes et secondes
        int heures = totalSecondes / 3600;
        int minutes = (totalSecondes % 3600) / 60;
        int secondes = totalSecondes % 60;

        // Affichage formaté
        System.out.println("Temps converti : " + heures + " : " + minutes + " : " + secondes);

        // Fermeture du scanner
        scanner.close();
    }
}
