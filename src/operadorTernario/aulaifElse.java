package operadorTernario;

import java.util.Scanner;

public class aulaifElse {

    static void main() {
     Scanner sc=new Scanner(System.in);
        System.out.println("Digite a sua idade: ");
     int idade=sc.nextInt();
        if(idade>=20){
            System.out.println("Adulto");
        }if(idade>=15 && idade <=19){
            System.out.println("Adolescente");
        }else{
            System.out.println("Criança");
        }
    }
}
