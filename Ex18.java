import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade do produto no estoque: ");
        int quantidade = sc.nextInt();
        if(quantidade<10){
            System.out.println("Produto em falta! Deve ser reabastecido");
        }else{
            System.out.println("Estoque suficiente!");
        }sc.close();
    }
}
