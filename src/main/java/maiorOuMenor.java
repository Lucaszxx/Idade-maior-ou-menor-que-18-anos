import java.util.Scanner;
import java.util.Calendar;
import java.util.Scanner;
public class maiorOuMenor {
    public static void main(String[] args) {
        int anoDeNasc;
        int idadeDoUsuario;
        Calendar hoje = Calendar.getInstance();
        int ano = hoje.get(Calendar.YEAR);
        Scanner leitorDeIdade = new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("      Leitor de idade Brasileiro");
        System.out.println("----------------------------------------");
        System.out.println("Digite o seu ano de nascimento: ");
        anoDeNasc = leitorDeIdade.nextInt();

        idadeDoUsuario = ano - anoDeNasc;

        if (idadeDoUsuario < 18) {
            System.out.println("A sua idade é " + idadeDoUsuario + " ,Voce é menor de idade");
        }
        else{
            System.out.println("A sua idade é " + idadeDoUsuario + " ,Você é maior de idade");
        }
    }
}
