package iniciante;
/*Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado
na variável X. Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está
sendo especificado e não esqueça de imprimir o fim de linha após o resultado, caso contrário,
você receberá "Presentation Error".*/

import java.util.Scanner;

public class _1001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a + b;

        System.out.println("X = " + x);

    }
}
