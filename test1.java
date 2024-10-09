package atividades;
// imprimir qual o IMC da pessoa com base em peso e Altura.
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso =0, altura = 0, imc;
        char resposta = 's';

        System.out.println("Bem-vindo ao Calculador de IMC, Este programa calculará seu Índice de " +
                "Massa Corporal (IMC) com base no seu peso e altura");




        while (resposta == 's'){
            while (true) {
                System.out.println("Digite seu peso (em kg): ");
                peso = sc.nextDouble();
                if (peso > 0) {
                    break;
                } else {
                    System.out.println("Erro, peso inserido está incorreto. Deve ser um valor maior que .");
                }
            }

            while (true) {
                System.out.println("Digite sua altura (em m): ");
                altura = sc.nextDouble();
                if (altura > 0) {
                    break;
                } else {
                    System.out.println("Erro, altura inserido está incorreto. Deve ser um valor maior que .");
                }
            }

            imc = peso / (altura * altura);
            System.out.println("Seu IMC é:"+imc);

            if (imc < 18.5){
                System.out.println("\nVocê esta abaixo do peso");
                System.out.println("( 0 _ 0 )");
            } else if (imc >= 18.5 && imc < 24.9) {
                System.out.println("\nSeu peso é normal");
                System.out.println(	"(｡◕‿‿◕｡)");
            } else if (imc >=  25 && imc < 29.9) {
                System.out.println("\nVocê esta com sobrepesso");
                System.out.println("(ㆆ _ ㆆ)");
            }else {
                System.out.println("\nVocê esta com obesidade");
                System.out.println(
                        "   _____\n" +
                                "  /     \\\n" +
                                " /       \\\n" +
                                "|  O O   |\n" +
                                "|   ^    |\n" +
                                " \\  ~   /\n" +
                                "  \\____/");
            }
            System.out.print("\nDeseja calcular o IMC de outra pessoa? Digite 's' para sim ou 'n' para não: ");
            resposta = sc.next().toLowerCase().charAt(0);
        }


        System.out.println("Obrigado por usar a Calculadora de IMC!");
    }
}
