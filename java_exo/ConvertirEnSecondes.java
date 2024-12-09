import java.util.Scanner; // Importez la classe Scanner pour la saisie utilisateur

public class ConvertirEnSecondes { // Déclaration de la classe ConvertirEnSecondes
    public static void main(String[] args) { // Point d'entrée du programme
        Scanner scanner = new Scanner(System.in); // Création d'un objet Scanner pour lire l'entrée utilisateur

        // Étape 1 : Demander le nombre d'heures
        System.out.print("Entrez le nombre d'heures : ");
        int heures = scanner.nextInt();

        // Étape 2 : Demander le nombre de minutes
        System.out.print("Entrez le nombre de minutes : ");
        int minutes = scanner.nextInt();

        // Étape 3 : Demander le nombre de secondes
        System.out.print("Entrez le nombre de secondes : ");
        int secondes = scanner.nextInt();

        // Étape 4 : Calculer le total en secondes
        int totalSecondes = (heures * 3600) + (minutes * 60) + secondes;

        // Étape 5 : Afficher le résultat
        System.out.println("Le total en secondes est : " + totalSecondes);

        // Fermer le scanner
        scanner.close();
    }
}
