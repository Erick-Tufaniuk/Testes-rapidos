import java.util.Scanner;

public class TestesRapidos{
    public static void main(String[]aargs){
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[4];
        
        System.out.println("Digite o primeiro nome: ");
        nomes[0] = sc.nextLine();
        System.out.println("Digite o segundo nome: ");
        nomes[1] = sc.nextLine();
        System.out.println("Digite o terceiro nome: ");
        nomes[2] = sc.nextLine();
        System.out.println("Digite o quarto nome: ");
        nomes[3] = sc.nextLine();

       for(int x =0; x< nomes.length; x++){
        System.out.println(nomes[x]);
       }
    }
}