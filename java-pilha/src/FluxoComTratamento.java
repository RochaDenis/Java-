public class FluxoComTratamento {

	public static void main(String[] args) throws MinhaExcecao{
		System.out.println("Ini do main");
		try{
		    metodo1();
		} catch(ArithmeticException | NullPointerException
				ex) {
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
		System.out.println("Ini do metodo2");
		
		throw new MinhaExcecao("Deu Ruim");
		
	
		//System.out.println("Fim do metodo2");
		
	}

}


