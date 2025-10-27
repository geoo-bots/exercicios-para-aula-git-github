import java.util.Scanner;
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso do peixe: ");
        double pesoPeixes = sc.nextDouble();
        double excesso = pesoPeixes - 50;
        double multa = excesso * 4.0;

        if(pesoPeixes<=50){
            System.out.println("Peso ok!");
        }else{
            System.out.println("O excesso de peso é de "+ excesso + "KG," + " então, a multa será de R$"+ multa);
        }sc.close();
    }
}
