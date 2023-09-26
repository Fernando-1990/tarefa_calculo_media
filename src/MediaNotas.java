/**
 * @author Fernando
 */
public class MediaNotas {

    public static void main(String args[]) {
        mediaDasNotas();
    }


    private static void mediaDasNotas() {
        System.out.println("Média das 4 notas");

        int nota1 = 35;
        int nota2 = 81;
        int nota3 = 45;
        int nota4 = 89;

        int media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("A média é: " + media);
    }

}
