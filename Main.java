import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    float peso, altura, imc;
    System.out.print("Qual seu PESO: ");
    peso = leitor.nextFloat(); 
    System.out.print("Qual sua ALTURA: "); 
    altura = leitor.nextFloat(); 
    imc = peso / (altura * altura);
    System.out.println("\n\n O IMC é " + imc + "\n\n");
  }
}