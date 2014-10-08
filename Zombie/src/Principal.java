import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Principal {

		
	public static void main (String[]args) throws Exception {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		ArrayList<Zombi> miEjercito = new ArrayList <Zombi>();
		String nombre;
		int [] cerebros;
		
		for (int i=0;i<2;i++) {
			System.out.println("Introduce el nombre del zombi:");
			nombre = br.readLine();
			cerebros= new int [3];
			for(int j =0; j<cerebros.length;j++) {
				System.out.println("INtroduce cerebros comidos de ");
				cerebros[j] = Integer.parseInt(br.readLine());
			}
			Zombi z = new Zombi (nombre, cerebros);
			miEjercito.add(z);
		}
		
		for (Zombi z: miEjercito) {
			System.out.println(z.toString());
		}
		miEjercito.get(0).setVida(10);
		
		System.out.println(miEjercito.get(1).getVida());
		
	}
}
