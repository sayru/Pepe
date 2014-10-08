import java.util.Arrays;


public class Zombi {
	static int vida =0;
	private String nombre;
	private int [] cerebros;
	
	
	public Zombi(String nombre, int[] cerebros) {
		super();
		this.nombre = nombre;
		this.cerebros = cerebros;
	}


	public static int getVida() {
		return vida;
	}


	public static void setVida(int vida) {
		Zombi.vida = vida;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int[] getCerebros() {
		return cerebros;
	}


	public void setCerebros(int[] cerebros) {
		this.cerebros = cerebros;
	}


	@Override
	public String toString() {
		return "Zombi [nombre=" + nombre + ", cerebros="
				+ Arrays.toString(cerebros) + "]";
	}
	
	
	
}


