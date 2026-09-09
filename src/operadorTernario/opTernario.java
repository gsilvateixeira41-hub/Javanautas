package operadorTernario;

public class opTernario {
    static void main() {
        double salario = 6800;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter !";
//(condição ? verdadeiro: falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

/*if(salario>=5000){
   resultado= mensagemDoar;
}else{
    resultado=mensagemNaoDoar;
}*/
System.out.println(resultado);
    }

    }

