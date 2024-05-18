import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[]args){
        Scanner entrada=new Scanner(System.in);
        int mediaFinal=entrada.nextInt();
        if(mediaFinal<6){
            System.out.println("REPROVADO");

        }else if(mediaFinal==6){
            System.out.println("Minerva");
        }else{
            System.out.println("APROVADO");
        }
    }
}
