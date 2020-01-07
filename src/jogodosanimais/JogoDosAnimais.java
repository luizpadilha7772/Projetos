
package jogodosanimais;
import java.util.Scanner;

public class JogoDosAnimais {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Respostas R = new Respostas();
      
        
        while(true) {
        System.out.println("-Pense em um animal:");
        R.setR1 (input.nextLine());
        System.out.println("-O animal que você pensou vive na água?");
        R.setR2 (input.nextLine());
        System.out.println("-Qual animal você pensou?");
        R.setR3 (input.nextLine());
        System.out.print("-um(a)" + R.getR3()); System.out.println(" _____ mas um(a) baleia não!");
        R.setR4 (input.nextLine());
        System.out.println("-Pense em um animal:");
        R.setR5 (input.nextLine());
        System.out.println("-O animal que você pensou vive na agua?:");
        R.setR6 (input.nextLine());
        System.out.print("-O animal que você pensou " + R.getR4()); System.out.println(" ?");
        R.setR7 (input.nextLine());
        if ("sim".equals(R.getR7())){
            System.out.print("-O animal que você pensou é um " + R.getR3()); System.out.println(" ?");
            R.setR8 (input.nextLine());
        } else {
            System.out.println("-Qual animal você pensou?");
            R.setR10 (input.nextLine());
            System.out.print("-um(a)" + R.getR10()); System.out.println(" _____ mas um(a) baleia não!");
            R.setR11 (input.nextLine());
        }
        
        
        if ("sim".equals(R.getR8())){
            System.out.println("Acerteii!");
            R.setR9 (input.nextLine());
         
        }
        
        
        System.out.println("-Pense em um animal");
        R.setR12 (input.nextLine());
        System.out.println("-O animal que você pensou vive na agua?:");
        R.setR13 (input.nextLine());
        System.out.print("-O animal que você pensou " + R.getR4()); System.out.println(" ?");
        R.setR14 (input.nextLine()); 
        if ("sim".equals(R.getR14())){
            System.out.print("-O animal que você pensou é um " + R.getR3()); System.out.println(" ?");
            R.setR15 (input.nextLine());
        }
        
        if ("sim".equals(R.getR15())){
            System.out.println("Acerteii!");
            R.setR16 (input.nextLine());
        }else{
        
        System.out.println("-Quer continuar jogando?");
        R.setR17 (input.nextLine());
        
        
        }
        }
    } 
}