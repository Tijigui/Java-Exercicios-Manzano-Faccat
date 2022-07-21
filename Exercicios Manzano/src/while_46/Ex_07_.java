package while_46;

public class Ex_07_ {

	public static void main(String[] args) {
		
int contadora =0;
int acomuladora =1;

int resultado=0;

while (resultado<1598) {
	resultado=acomuladora+contadora;
	System.out.println(contadora+" + "+acomuladora+" = "+resultado);
	contadora = resultado;
	acomuladora=resultado;
}
	}

}
