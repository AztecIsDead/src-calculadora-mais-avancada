import java.util.Scanner;

public class processosnumsalvo {
    Scanner scanner = new Scanner(System.in);
    public double somanew(double numsalvo, double num2){
        System.out.println("Digite o outro numero ");
        num2 = scanner.nextInt();
        numsalvo = numsalvo + num2;
        return numsalvo;
    }//somanew
    public double subnew(double numsalvo, double num2){
        System.out.println("Digite o outro numero ");
        num2 = scanner.nextInt();
        numsalvo = numsalvo - num2;
        return numsalvo;
    }//subnew
    public double multnew(double numsalvo, double num2){
        System.out.println("Digite o outro numero ");
        num2 = scanner.nextInt();
        numsalvo = numsalvo * num2;
       return numsalvo;
    }//multnew
    public double divnew(double numsalvo, double num2){
        System.out.println("Digite o outro numero ");
        num2 = scanner.nextInt();
        numsalvo = numsalvo / num2;
        return numsalvo;
    }
}
