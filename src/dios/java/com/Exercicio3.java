package dios.java.com;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        String nome, sexo, estadocivil;
        int contador, idade;
        double salario;

        do{
            System.out.print("Insira o nome: ");
            nome = scan.next();
            contador = nome.length();
        }while(contador <=3);


        do{
            System.out.print("Insira idade: ");
            idade = scan.nextInt();
        }while(idade < 0 || idade > 150);

        do{
            System.out.print("Informe salário: ");
            salario = scan.nextDouble();
        }while(salario <= 0);

        do{
            System.out.print("informe o sexo (M/F): ");
            sexo = scan.next();


        }while(!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f") );

        do{
            System.out.print("informe o estado civil: ");
            estadocivil = scan.next();
        }while(!estadocivil.equalsIgnoreCase("s") && !estadocivil.equalsIgnoreCase("c") && estadocivil.equalsIgnoreCase("v") && !estadocivil.equalsIgnoreCase("d"));

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadocivil);




    }


}
