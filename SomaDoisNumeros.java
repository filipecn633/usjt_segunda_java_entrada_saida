import java.util.Scaner;
//pacote padrão: java.lang: importado automaticamente
public class SomaDoisNumeros{
 public static void main(String [] args){
        //declaração de variáveis
        Scanner leitor = new Scanner(System.in);
        double primeiroOperando;
        double segundoOperando;
        double resultado;

        //entrada 
        System.out.println("digite o primeiro operando");
        primeiroOperando = leitor.nextDouble();
        segundoOperando = leitor.nextDouble();


        //processamento
        resultado = primeiroOperando + segundoOperando

        //saída
        System.out.print(resultado);
        
    }
