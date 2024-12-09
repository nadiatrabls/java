import java.util.Scanner;

public class Morpion {
    public static void main(String[] args) {
        char[][] plateau = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        char joueurActuel = 'X';
        int tours = 0;
        boolean jeuEnCours = true;
        Scanner scanner = new Scanner(System.in);

        while (jeuEnCours) {
            afficherPlateau(plateau);
            System.out.println("Joueur " + joueurActuel + ", entrez les coordonnées (ligne et colonne) : ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Vérifier la validité de la position
            if (x < 0 || x > 2 || y < 0 || y > 2 || plateau[x][y] != '-') {
                System.out.println("Position invalide, essayez de nouveau.");
                continue;
            }

            // Placer le symbole du joueur
            plateau[x][y] = joueurActuel;
            tours++;

            // Vérification de victoire
            if (verifierVictoire(plateau, joueurActuel)) {
                afficherPlateau(plateau);
                System.out.println("Le joueur " + joueurActuel + " a gagné !");
                jeuEnCours = false;
            } else if (tours == 9) { // Match nul
                afficherPlateau(plateau);
                System.out.println("Match nul !");
                jeuEnCours = false;
            } else {
                // Changer de joueur
                joueurActuel = (joueurActuel == 'X') ? 'O' : 'X';
            }
        }
        scanner.close();
    }

    public static void afficherPlateau(char[][] plateau) {
        for (char[] ligne : plateau) {
            for (char caseJeu : ligne) {
                System.out.print(caseJeu + " ");
            }
            System.out.println();
        }
    }

    public static boolean verifierVictoire(char[][] plateau, char symbole) {
        // Vérifier les lignes, colonnes et diagonales
        for (int i = 0; i < 3; i++) {
            if ((plateau[i][0] == symbole && plateau[i][1] == symbole && plateau[i][2] == symbole) || // Ligne
                (plateau[0][i] == symbole && plateau[1][i] == symbole && plateau[2][i] == symbole)) { // Colonne
                return true;
            }
        }
        // Diagonales
        return (plateau[0][0] == symbole && plateau[1][1] == symbole && plateau[2][2] == symbole) ||
               (plateau[0][2] == symbole && plateau[1][1] == symbole && plateau[2][0] == symbole);
    }
}
