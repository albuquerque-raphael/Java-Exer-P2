//Defina uma classe aluno que faça o cadastro do nome com as 3 notas, e a operação
//da média das 3 notas. Ao final exiba na classe principal a média. Em seguida, informe
//se ele está aprovado, reprovado ou está na final.


import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Alunonota a = new Alunonota();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foia aprimeira nota? ");
        a.n1 = sc.nextDouble();
        System.out.println("Qual foi a sua segunda nota? ");
        a.n2 = sc.nextDouble();
        System.out.println("Qual foi a sua terceira nota? ");
        a.n3 = sc.nextDouble();

        a.calcmedia();


        double media = a.media;

        if(media >= 7){
            System.out.println("Você esta aprovado por média, parabéns!");
        }else if(media >= 5 && media < 7){
            System.out.println("Você está de recuperação, estude mais");
        }else{
            System.out.println("Não foi dessa vez");
        }
    }
}