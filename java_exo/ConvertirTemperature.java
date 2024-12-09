import java.util.Scanner;

public class ConvertirTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reponse = "oui";  // Initialisation de reponse pour la première exécution

        do {
            // Affichage du menu de conversion
            System.out.println("Choisissez le type de conversion : ");
            System.out.println("1. Celsius vers Fahrenheit");
            System.out.println("2. Fahrenheit vers Celsius");
            System.out.print("Entrez votre choix (1 ou 2) : ");
            int choix = scanner.nextInt();

            // Variable pour stocker la température convertie
            double resultat = 0;

            if (choix == 1) {
                // Conversion de Celsius à Fahrenheit
                System.out.print("Entrez la température en Celsius : ");
                double tempCelsius = scanner.nextDouble();
                resultat = (9.0 / 5.0) * tempCelsius + 32;
                System.out.println("La température en Fahrenheit est : " + resultat);

            } else if (choix == 2) {
                // Conversion de Fahrenheit à Celsius
                System.out.print("Entrez la température en Fahrenheit : ");
                double tempFahrenheit = scanner.nextDouble();
                resultat = (tempFahrenheit - 32) * 5.0 / 9.0;
                System.out.println("La température en Celsius est : " + resultat);

            } else {
                System.out.println("Choix non valide, veuillez entrer 1 ou 2.");
                continue;  // Retourne au début du do-while si le choix est invalide
            }

            // Demande à l'utilisateur s'il souhaite effectuer une nouvelle conversion
            System.out.print("Voulez-vous faire une nouvelle conversion ? (oui/non) : ");
            reponse = scanner.next();

        } while (reponse.equalsIgnoreCase("oui"));

        System.out.println("Au revoir.");
        scanner.close();
    }
}
