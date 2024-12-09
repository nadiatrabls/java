import java.util.Scanner;

public class TableauEntiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // a) Demander à l'utilisateur une série de N nombres entiers strictement positifs
        System.out.print("Entrez le nombre d'éléments N : ");
        int N = scanner.nextInt();
        int[] nombres = new int[N];

        for (int i = 0; i < N; i++) {
            int nombre;
            do {
                System.out.print("Entrez un nombre entier strictement positif pour l'élément " + (i + 1) + " : ");
                nombre = scanner.nextInt();
            } while (nombre <= 0); // Vérification de la positivité du nombre
            nombres[i] = nombre;
        }

        // b) Calculer la valeur maximale
        int max = nombres[0];
        for (int i = 1; i < N; i++) {
            if (nombres[i] > max) {
                max = nombres[i];
            }
        }

        // c) Déterminer le nombre d'occurrences de la valeur maximale et leurs indices
        int occurrencesMax = 0;
        StringBuilder indicesMax = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (nombres[i] == max) {
                occurrencesMax++;
                indicesMax.append(i).append(" ");
            }
        }

        // d) Calculer la moyenne des nombres du tableau
        int somme = 0;
        for (int nombre : nombres) {
            somme += nombre;
        }
        double moyenne = (double) somme / N;

        // Affichage des résultats
        System.out.println("\nValeur maximale : " + max);
        System.out.println("Nombre d'occurrences de la valeur maximale : " + occurrencesMax);
        System.out.println("Indices des valeurs maximales : " + indicesMax);
        System.out.println("Moyenne des nombres : " + moyenne);

        scanner.close();
    }
}
