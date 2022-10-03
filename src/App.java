import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double nB1, nB2, nB3, nB4, media;

        System.out.println("Digite suas quatro notas bimestrais: ");
        nB1 = sc.nextDouble();
        nB2 = sc.nextDouble();
        nB3 = sc.nextDouble();
        nB4 = sc.nextDouble();
        media = (nB1 + nB2 + nB3 + nB4) / 4;

        System.out.println("A media das notas bimestrais e: " + media);

        sc.close();
    }
}
