package aulaJava7;

public class aulaJava7 {

	/*variavel global é acessivel a todos e o seu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;
	
	public static void main(String[] args) {
	
		/*variavel local porque pertence somente a esse metodo e o valor fica dentro do metodo*/
	int maiorIdade = 18;
	System.out.println("valor da variavel local = " + maiorIdade);
	
	metodo2 ();
	
	}

	public static void metodo2 () {
		System.out.println("Valor da variavel global = " + maiorIdadeGlobal);
	}
}
