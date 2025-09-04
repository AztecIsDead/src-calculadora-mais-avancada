import java.util.Scanner;
public class calculadoraMain {
    public static void main(String[] args) {

        processos proc = new processos();
    Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;
        int numsalvo;
        int op;


        System.out.println("Selecione uma operação");
        System.out.println("1- Adição; 2- Subtração; 3- Multiplicação; 4- Divisão; ");
        op = scanner.nextInt();
        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextInt();



        switch (op) {
            case 1:
                numsalvo = proc.soma(num1, num2);
                System.out.println(numsalvo);
            case 2:
                numsalvo = proc.sub(num1, num2);
                System.out.println(numsalvo);
            case 3:
                numsalvo = proc.mult(num1, num2);
                System.out.println(numsalvo);
            case 4:
                numsalvo = proc.div(num1, num2);
                System.out.println(numsalvo);

        }//switch
    }//args bs
    }//main