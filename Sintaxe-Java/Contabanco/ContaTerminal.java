package Contabanco;

import java.util.Scanner;

public class ContaTerminal {
    
    public static void main (String[] args) throws Exception{

        Scanner entrada = new Scanner(System.in);
        Scanner entradanum = new Scanner(System.in);

        System.out.println("Digite seu nome Completo: ");
        String nomeCliente = entrada.nextLine();

        System.out.println("Digite o núemro da conta: ");
        int numero = entradanum.nextInt();

        System.out.println("Digite o número da sua agência: ");
        String agencia = entrada.nextLine();

        System.out.println("Digite o seu saldo:");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco.\nSua agência é " 
        + agencia + " ,conta " + numero + " e seu saldo " + saldo + " já está disponível pra saque.");

    }
}
