package operadorTernario;

import java.util.Scanner;

public class exerSwitch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int dia = sc.nextInt();
        switch (dia) {
            default:
                System.out.println("Dia invalido");
            case 1:
                System.out.println("Domingo-não é dia util");
                break;
            case 2:
                System.out.println("Segunda-Feira: DIA UTIL");
                break;
            case 3:
                System.out.println("terça-Feira: DIA UTIL");
                break;
            case 4:
                System.out.println("Quarta-Feira: DIA UTIL");
                break;
            case 5:
                System.out.println("Quinta-Feira: Dia util");
                break;
            case 6:
                System.out.println("Sexta-Feira: DIA UTIL");
                break;
            case 7:

                System.out.println("Sabado: DIA UTIL");
                break;
        }
    }
}
