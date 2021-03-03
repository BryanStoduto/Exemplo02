import java.util.Scanner;

public class Aluno {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int nota1, nota2, nota3;
        int media;
        
            System.out.println("Nome do Aluno: ");
            nome = ler.nextLine();
            
            System.out.println("Digite a Nota 1: ");
            nota1 = ler.nextInt();
            
            System.out.println("Digite a Nota 2: ");
            nota2 = ler.nextInt();
            
            System.out.println("Digite a Nota 3: ");
            nota3 = ler.nextInt();
            
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno é: "  + media);
            
            if( (media >= 0) && (media <4) ){
                System.out.println();
            } else if(media < 5){
                System.out.println();
            } else if(media < 7){
                System.out.println();
            } else if(media < 8){
                System.out.println();
            } else if(media <= 10){
                System.out.println();
            }
        }       
    }
