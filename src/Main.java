import java.util.Scanner;


public class Main {

	private static Scanner c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int l1,l2,l3;
	        c = new Scanner(System.in);
	        System.out.println("Teste de triangulo");
	        TipoTriangulo triangulo = new TipoTriangulo();
	        System.out.println("Entre com os lados do triângulo");
	        System.out.printf("Lado1:");
	        l1 = c.nextInt();
	        System.out.printf("Lado2:");
	        l2 = c.nextInt();
	        System.out.printf("Lado3:");
	        l3 = c.nextInt();
	        if (triangulo.verificaTriangulo(l1, l2, l3))
	         System.out.println("Os lados digitados formam um triangulo " +triangulo.getTipo());
	        else
	        System.out.println("Os lados digitados não formam um triangulo. Poligono " +triangulo.getTipo());

	}	
}
