public class EvolutionVariables {
    public static void main(String[] args) {
        // Déclaration des variables
        int a = 0, b = 0, c = 0;

        // Affiche l'état initial des variables
        System.out.println("Étape\t a\t b\t c");
        System.out.println("--------------------------");
        System.out.println("Initial\t " + a + "\t " + b + "\t " + c);

        // Étape 1 : a = 3
        a = 3;
        System.out.println("a = 3\t " + a + "\t " + b + "\t " + c);

        // Étape 2 : b = a + 2
        b = a + 2;
        System.out.println("b = a+2\t " + a + "\t " + b + "\t " + c);

        // Étape 3 : c = a + 5
        c = a + 5;
        System.out.println("c = a+5\t " + a + "\t " + b + "\t " + c);

        // Étape 4 : a = c + a
        a = c + a;
        System.out.println("a = c+a\t " + a + "\t " + b + "\t " + c);

        // Étape 5 : b = c + a
        b = c + a;
        System.out.println("b = c+a\t " + a + "\t " + b + "\t " + c);

        // Étape 6 : c = a + b * c
        c = a + b * c;
        System.out.println("c = a+b*c " + a + "\t " + b + "\t " + c);
    }
}
