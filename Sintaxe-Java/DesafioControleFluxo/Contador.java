package DesafioControleFluxo;

import java.util.Scanner;

class ParametrosInvalidosException extends Exception{
    public ParametrosInvalidosException(String mensagem){
        super(mensagem);
    }
}
public class Contador {
    public static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }else{
            int contagem = num2 - num1;
            for(int x = 1; x <= contagem; x++){
                System.out.println("imprimindo o número " + x);
            }
        }
    }

       public static void main(String[] args){

        try{
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            int numero1 = entrada.nextInt();
            System.out.println("Digite o segundo número: ");
            int numero2 = entrada.nextInt(); 

            contar (numero1, numero2);

        }catch(ParametrosInvalidosException e ){
            System.out.println(e.getMessage());
        }
    }
}    

 


