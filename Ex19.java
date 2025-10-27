import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor das compras: R$");
        double valorCompra = sc.nextDouble();
        double valorDesconto = valorCompra - (valorCompra * 10/100);
        if(valorCompra <=500){
            System.out.println("Item não tem desconto.");
        }else{
            System.out.println("O valor a pagar será: R$"+ valorDesconto);
        }sc.close();
    }
}
