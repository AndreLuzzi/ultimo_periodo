package testqualcod.ex27;

import java.util.Scanner;

public class calc {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Digite dois números");
        int a = s.nextInt(); int b = s.nextInt();
        System.out.println("Escolha a operação: 1 - soma, 2 - subtração, 3 - multiplicacao, 4 - divisão");
        int op = s.nextInt();
        
        if(op==1){
            System.out.println("Resultado:"+(a+b));
        }else if(op==2){
            System.out.println("Resultado:"+(a-b));
        }else if(op==3){
            System.out.println("Resultado:"+(a*b));
        }else if(op==4){
            System.out.println("Resultado:"+(a/b));
        }else{
            System.out.println("Opção inválida");
        }
    } 

}
