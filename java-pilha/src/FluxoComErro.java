public class FluxoComErro {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try{
		    try {
				metodo1();
			} catch (MinhaExcecao e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch(ArithmeticException | NullPointerException ex) {
		    String msg = ex.getMessage();
		    System.out.println("ArithmeticException " + msg);
		    ex.printStackTrace();
		} 
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Chamando metodo 2");
		metodo2();
		System.out.println("Fim do Metodo 2");
	}
}

