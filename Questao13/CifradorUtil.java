package ListaAvaliativa1.Questao13;

import java.util.Scanner;

public class CifradorUtil {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrada....: ");
        String eEntrada = sc.nextLine();
        char[] caracteres = eEntrada.toCharArray();
        boolean deuCerto = false;

        for (int i = 0; i < caracteres.length; i++) {
            char caracter = caracteres[i];

            try {
                if (!Character.isLetter(caracter)) {
                    throw new Exception("Há espaços ou acentos!");
                }
                deuCerto = true;
            } catch (Exception e) {
                System.err.println(e.getMessage());
                deuCerto = false;
            }

        }

        if (deuCerto) {
            Cifrador eCifrador = new Cifrador();
            String eGuardado = eCifrador.guardar(eEntrada);
            System.out.println("\nTexto codificado: " + eGuardado);

            String eRevelado = eCifrador.revelar(eGuardado);
            System.out.println("\nTexto descodificado: " + eRevelado);

            sc.close();
        }
    }

}
