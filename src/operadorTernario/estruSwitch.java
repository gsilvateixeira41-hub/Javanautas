package operadorTernario;

public class estruSwitch {
    static void main() {
        int dia = 2;
        // char, int byte, short, enum, String são aceitos
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("NÚMERO INVALIDO");
        }
    }
}
