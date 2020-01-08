
package jogodosanimais;
import java.util.Scanner;

public class JogoDosAnimais {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Respostas R = new Respostas();
      
        
        while ("sim".equals(R.getR18())) {
        System.out.println("-Pense em um animal:");
        R.setR1 (input.nextLine());
        System.out.println("-O animal que você pensou vive na água?");
        R.setR2 (input.nextLine());
        System.out.println("-Qual animal você pensou?");
        R.setR3 (input.nextLine());
        System.out.println("-Um(a)" + R.getR3()+ " _____ mas um(a) baleia não!");
        R.setR4 (input.nextLine());
        System.out.println("-Pense em um animal:");
        R.setR5 (input.nextLine());
        System.out.println("-O animal que você pensou vive na água?:");
        R.setR6 (input.nextLine());
        System.out.println("-O animal que você pensou " + R.getR4() + "?(sim/não)");
        R.setR7 (input.nextLine());
        if ("sim".equals(R.getR7())){
            System.out.println("-O animal que você pensou é um(a) " + R.getR3() + "?(sim/não)");
            R.setR8 (input.nextLine());
        }
        if ("sim".equals(R.getR7())){
            System.out.println(R.getAcertei());
       
        }else {
            System.out.println("-Qual animal você pensou?");
            R.setR10 (input.nextLine());
            
            System.out.println("-Um(a)" + R.getR10()+ " _____ mas um(a) baleia não!");
            R.setR11 (input.nextLine());
        }
        
               
        System.out.println("-Pense em um animal");
        R.setR12 (input.nextLine());
        System.out.println("-O animal que você pensou vive na água?:");
        R.setR13 (input.nextLine());
        System.out.println("-O animal que você pensou " + R.getR4() + "?(sim/não)");
        R.setR14 (input.nextLine()); 
        if ("sim".equals(R.getR14())){
            System.out.println("-O animal que você pensou é um(a)" + R.getR3() + "?(sim/não)");
            R.setR15 (input.nextLine());
        }if ("sim".equals(R.getR14())){
            System.out.println(R.getAcertei());
        }else {
            System.out.println("-Qual animal você pensou?");
            R.setR16 (input.nextLine());
            System.out.println("-Um(a)" + R.getR16()+ " _____ mas um(a) baleia não!");
            R.setR17 (input.nextLine());
              }
        
        
        
        
        System.out.println("-Quer continuar jogando?(sim/não)");
        R.setR18 (input.nextLine());
        
       
        }
    } 
}