
public class Coche {
	
	private String matricula;
	private int cilindrada;
	private int caballos;
	
	
	
	public Coche(String matricula, int cilindrada, int caballos) {
		// Este coche es mio
		this.matricula = matricula;
		this.cilindrada = cilindrada;
		this.caballos = caballos;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	
	@Override
	public String toString() {
		return "\ncoche [matricula=" + matricula + ", cilindrada=" + cilindrada
				+ ", caballos=" + caballos + "]\n";
	}
	
	

}
