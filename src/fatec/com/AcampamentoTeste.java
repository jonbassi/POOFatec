package fatec.com;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {

        Acampamento membro = new Acampamento();

        System.out.println("Digite o nome: ");
        Scanner sc = new Scanner(System.in);
        membro.nome = sc.nextLine();

        System.out.println("Digite a idade: ");
        Scanner vInt = new Scanner(System.in);
        membro.idade = Integer.parseInt(sc.nextLine());
        //int idade = vInt.nextInt();

        membro.imprimir();



    }
}
