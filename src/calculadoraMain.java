import java.util.Scanner;
public class calculadoraMain {
    public static void main(String[] args) {

        processos proc = new processos();
        processosnumsalvo proc2 = new processosnumsalvo();
    Scanner scanner = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        double numsalvo = 0;
        int op;
do {
    do {
        System.out.println("Selecione uma operação");
        System.out.println("1- Adição; 2- Subtração; 3- Multiplicação; 4- Divisão; 6 - Sair ");
        op = scanner.nextInt();
        if (numsalvo == 0) {
            System.out.println("Digite o primeiro numero: ");
            num1 = scanner.nextInt();
            System.out.println("Digite o segundo numero: ");
            num2 = scanner.nextInt();


            switch (op) {
                case 1:
                    numsalvo = proc.soma(num1, num2);
                    System.out.println(numsalvo);
                    break;
                case 2:
                    numsalvo = proc.sub(num1, num2);
                    System.out.println(numsalvo);
                    break;
                case 3:
                    numsalvo = proc.mult(num1, num2);
                    System.out.println(numsalvo);
                    break;
                case 4:
                    numsalvo = proc.div(num1, num2);
                    System.out.println(numsalvo);
                    break;

            }//switch
        }//if
    } while (numsalvo == 0);
do {
    {
        System.out.println("Continuando o cálculo com o numero: " + numsalvo + ", selecione a operação: ");
        System.out.println("1- Adição; 2- Subtração; 3- Multiplicação; 4- Divisão; 6 - Sair; ");

        op = scanner.nextInt();
        switch (op) {
            case 1:
                numsalvo = proc2.somanew(numsalvo, num2);
                System.out.println(numsalvo);
                break;
            case 2:
                numsalvo = proc2.subnew(numsalvo, num2);
                System.out.println(numsalvo);
                break;
            case 3:
                numsalvo = proc2.multnew(numsalvo, num2);
                System.out.println(numsalvo);
                break;
            case 4:
                numsalvo = proc2.divnew(numsalvo, num2);
                System.out.println(numsalvo);
                break;

        }//else: switch
    }//else
}//do1
while(op !=6);
}//do2
while(op !=6);
    }//args bs
    }//main