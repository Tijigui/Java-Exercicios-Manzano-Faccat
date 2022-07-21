

public class Ex_01_Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero para ver a Tabuada: ");
		int numero=sc.nextInt();
		int contadora = 0;
		while (contadora<11) {
			
			System.out.println(numero+" X "+contadora+" = "+numero * contadora);
			contadora++;
		}
		sc.close();

	}

}
