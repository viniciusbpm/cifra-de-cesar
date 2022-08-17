import java.util.Scanner;
public class CesarCifra {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String mensagem = t.next();

        System.out.println(mensagem);

         for(int c = 0; c < 25; c++) {
             String mensagemAux = "";

            for(int i = 0; i < mensagem.length(); i++){
                if (mensagem.charAt(i) + 1 <= 'z') {
                    mensagemAux += (char)(mensagem.charAt(i) + 1);
                }

                if (mensagem.charAt(i) + 1 > 'z') {
                    mensagemAux += (char)97;
                }
            }
            mensagem = mensagemAux;
            System.out.println(mensagemAux);
         }


    }
}
