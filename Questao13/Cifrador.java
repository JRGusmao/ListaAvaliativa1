package ListaAvaliativa1.Questao13;

public class Cifrador {
    private char nValores[];
    private int troca;

    public Cifrador() {

        nValores = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        troca = 3;
    }

    public int trocar(char a) {
        int i = 0;
        int o = nValores.length;

        boolean enc = false;
        while (i < o) {
            char ø = nValores[i];
            if (ø == a) {
                enc = true;
                break;
            }
            i += 1;
        }

        if (!enc) {
            i -= 1;
        }
        return i;
    }

    public String guardar(String eEntrada) {

        String nSaida = "";
        int i = 0;
        int o = eEntrada.length();
        while (i < o) {
            char letra = eEntrada.charAt(i);

            if (letra == ' ') {
                nSaida += " ";
            } else {
                int p = trocar(letra);

                if (p >= 0) {
                    int n = p + troca;
                    if (n >= nValores.length) {
                        n -= nValores.length;
                    }
                    nSaida += String.valueOf(nValores[n]);
                } else {
                    nSaida += " ";
                }

            }

            i += 1;
        }

        return nSaida;
    }

    public String revelar(String eEntrada) {
        String nSaida = "";

        int i = 0;
        int o = eEntrada.length();

        while (i < o) {
            char letra = eEntrada.charAt(i);

            if (letra == ' ') {
                nSaida += " ";
            } else {

                int p = trocar(letra);
                if (p >= 0) {
                    int n = p - troca;
                    if (n < 0) {
                        n += nValores.length;
                    }
                    nSaida += String.valueOf(nValores[n]);

                } else {
                    nSaida += " ";

                }

            }

            i += 1;

        }

        return nSaida;
    }
}
