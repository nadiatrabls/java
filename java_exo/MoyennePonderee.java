import java.util.Scanner;

public class MoyennePonderee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande des notes
        System.out.print("Entrez la note de Mathématiques : ");
        int note_maths = scanner.nextInt();

        System.out.print("Entrez la note d'Informatique : ");
        int note_info = scanner.nextInt();

        System.out.print("Entrez la note de Français : ");
        int note_francais = scanner.nextInt();

        // Calcul de la moyenne pondérée
        int moyenne = (3 * note_maths + 5 * note_info + 2 * note_francais) / (3 + 5 + 2);

        // Affichage de la moyenne pondérée
        System.out.println("La moyenne pondérée est : " + moyenne);

        // Fermeture du scanner
        scanner.close();
    }
}
