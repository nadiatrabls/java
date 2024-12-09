import java.util.Scanner;

public class AdditionTemps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Saisie du premier temps
        System.out.print("Entrez les heures du premier temps : ");
        int heures1 = scanner.nextInt();
        System.out.print("Entrez les minutes du premier temps : ");
        int minutes1 = scanner.nextInt();
        System.out.print("Entrez les secondes du premier temps : ");
        int secondes1 = scanner.nextInt();

        // Saisie du deuxième temps
        System.out.print("Entrez les heures du deuxième temps : ");
        int heures2 = scanner.nextInt();
        System.out.print("Entrez les minutes du deuxième temps : ");
        int minutes2 = scanner.nextInt();
        System.out.print("Entrez les secondes du deuxième temps : ");
        int secondes2 = scanner.nextInt();

        // Calcul de la somme des secondes
        int totalSecondes = secondes1 + secondes2;
        int minutesAdditionnelles = totalSecondes / 60;
        int secondes = totalSecondes % 60;

        // Calcul de la somme des minutes
        int totalMinutes = minutes1 + minutes2 + minutesAdditionnelles;
        int heuresAdditionnelles = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Calcul de la somme des heures
        int heures = heures1 + heures2 + heuresAdditionnelles;

        // Affichage du résultat
        System.out.println("La somme des deux temps est : " + heures + " : " + minutes + " : " + secondes);

        // Fermeture du scanner
        scanner.close();
    }
}
