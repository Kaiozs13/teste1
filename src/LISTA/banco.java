package LISTA;
import java.util.Scanner;

public class banco {
    
    public static void main(String[] args) {
    
    Scanner dep = new Scanner(System.in);
    
    System.out.println("BEM VINDO!!");
    System.out.println("Digite o valor a ser depositado: ");
    double valor = dep.nextDouble();
    
    contabancaria cont = new contabancaria(valor);
    cont.depositar();
}
}
