import java.util.Comparator;


public class comparadosCoches implements Comparator<Coche> {

	@Override
	public int compare(Coche c1, Coche c2) {
		// TODO Auto-generated method stub
		return c1.getCilindrada()-c2.getCilindrada();
	}

}
