import java.util.ArrayDeque;
import java.util.Scanner;

public class MaquinaTragaperras {
	private String simb1 = null;
	private String simb2 = null;
	private String simb3 = null;
	private String mensaje = null;
	public String getSimb1() {
		return simb1;
	}
	public String getSimb2() {
		return simb2;
	}
	public String getSimb3() {
		return simb3;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void Tirar(int dinMax) {
		ArrayDeque<String> simbolos = new ArrayDeque<String>();
		simbolos.add("Trebol");
		simbolos.add("Pica");
		simbolos.add("Corazón");
		simbolos.add("Rombo");
		ArrayDeque<String> simbolos2 = simbolos.clone();
		ArrayDeque<String> simbolos3 = simbolos.clone();
		boolean maquina = false;
		System.out.println("¿Cuanto dinero vas a introducir?");
		int contador = 0;
		while (!maquina) {
			int tirada = (int) Math.floor(Math.random() * 24 + 1);
			for (int i = 0; i < tirada + 2; i++) {
				String aux = simbolos.pollFirst();
				simbolos.addLast(aux);
				simb1 = aux;
			}
			for (int i = 0; i < tirada - 3; i++) {
				String aux = simbolos2.pollLast();
				simbolos2.addFirst(aux);
				if (aux.equals(null)) {
					i--;
				}
				simb2 = aux;
			}
			for (int i = 0; i < tirada + 5; i++) {
				String aux = simbolos3.pollFirst();
				simbolos3.addLast(aux);
				simb3 = aux;
			}
			System.out.println(simb1);
			System.out.println(simb2);
			System.out.println(simb3);
			System.out.println();
			contador++;
			if (simb1 == simb2 && simb2 == simb3) {
				maquina = true;
				mensaje = "PREMIO! y te has dejado: " + contador + "€";
			}
			if (contador == dinMax && !maquina) {
				maquina = true;
				mensaje = "NO TIENES PREMIO Y TE HAS DEJADO: " + contador + "€";
			}
		}
	}
}
