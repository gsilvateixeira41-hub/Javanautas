package academyNaut;

public class tipoOperadores {
    static void main() {
        // +, -, /,*
        int numero01=10;
        int numero02=20;
        System.out.println(numero01+numero02);
        System.out.println(numero01-numero02);
        System.out.println(numero01/(double)numero02);
        System.out.println(numero01*numero02);

        // Resto da divisão %
        int resto=25%3;
        System.out.println(resto);

        // < > <= >= !=
        int nota = 10;
        System.out.println(nota!=numero02);
        System.out.println(nota>=numero01);
        System.out.println(nota <=numero02);
        System.out.println(nota==numero02);
        // and (&&) OR (||) not(!)
        int idade=26;
        boolean estudante=true;
        if(idade>=25 && (!estudante)){
            System.out.println("Estudante");
        }else{
            System.out.println("não estudante");
        }


    }
}
