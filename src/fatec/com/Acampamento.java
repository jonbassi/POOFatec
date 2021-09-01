package fatec.com;

public class Acampamento {

    public String nome;
    public char equipe;
    public int idade;

    public void imprimir(){
        System.out.println("Dados--------------------------");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("-------------------------------");
    }

    public void separarGrupo(){

        if(idade < 6 ){
            equipe = '/';
            return;
        }

        if(idade < 11 ){
            equipe = 'A';
            return;
        }

        if(idade < 21 ){
            equipe = 'B';
            return;
        }
        else{
            equipe = 'C';
            return;
        }
    }
}
