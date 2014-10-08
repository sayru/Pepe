import java.util.ArrayList;
import java.util.Collections;


public class comparador {
	
	public static void main (String[]args) {
		Coche c1 = new Coche ("5843-DGT", 1900, 100);
		Coche c2 = new Coche ("3218-UDE", 1500,90);
		Coche c3 = new Coche ("8675-OIF", 900, 50);
		
		ArrayList <Coche> list = new ArrayList<Coche>();
		
		list.add(c1);
		list.add(c2);
		list.add(c3);
		
		Collections.shuffle(list);
		
		System.out.println("Vamos a mostrar la lista de desordenada");
		System.out.println(list);
		
		Collections.sort(list, new comparadosCoches());
		
		System.out.println("Mostramos ordenador por cilindrada");
		System.out.println(list);
		
		
		
	}

}
