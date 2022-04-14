
public class Main {
	public static void main(String[] args) {
		CartaLacaio lac1 = new CartaLacaio(1, "Frodo Bolseiro", 2, 1, 1);
		CartaLacaio lac2 = new CartaLacaio(2, "Aragorn", 5, 7, 6);
		CartaLacaio lac3 = new CartaLacaio(3, "Legolas", 8, 4, 6);
		CartaMagia mag1 = new CartaMagia(4, "You Shall Not Pass", 4, 7, true);
		CartaMagia mag2 = new CartaMagia(5, "Telecinese", 3, 2, false);
		
		/* 1 */
		System.out.println("\n/* 1 */");
		CartaLacaio lac4 = new CartaLacaio(6, "Bilbo", 3);
		System.out.println(lac4);
		
		/* 2 */
		System.out.println("\n/* 2 */");
		lac1.setAtaque(lac3.getAtaque());
		System.out.println(lac1);
		
		/* 3 */
		System.out.println("\n/* 3 */");
		System.out.println(mag1);
		
		/* 4 */
		System.out.println("\n/* 4 */");
		CartaLacaio lac5 = new CartaLacaio(lac2);
		System.out.println(lac5);
		System.out.println(lac2);
		
		
		/* 5 */
		System.out.println("\n/* 5 */");
		/* System.out.println(mag1.nome); */
		System.out.println(mag1.getNome());
		
		/* 6 */
		System.out.println("\n/* 6 */");
		System.out.println("\nAntes do buff: \n");
		
		System.out.println(lac3 + "\n" + lac4);

		lac3.buffar(2);
		lac4.buffar(1, 4);
		
		System.out.println("\nDepois do buff: \n");
		
		System.out.println(lac3 + "\n" + lac4);
		
	}
}
