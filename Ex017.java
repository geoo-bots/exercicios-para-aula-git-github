import java.util.Scanner;
public class Ex017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o salário do funcionário que receberá o aumento: R$");
        double salario = sc.nextDouble();
        double salario10 = salario + (salario * 10/100);
        double salario7 = salario + (salario * 7/100);
        double salario5 = salario + (salario * 5/100);
        if (salario<1100.0){
            System.out.println("O novo salário desse funcionário será: R$"+ salario10);
        }else if(salario<2000){
            System.out.println("O novo salário deste funcionário será de: R$" + salario7);
        }else{
            System.out.println("O novo salário deste funcionário é: R$"+salario5);
        }sc.close();
    }
}
