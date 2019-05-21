
public class CriterioAnd implements Criterio {

	private Criterio c1;

	private Criterio c2;

	public CriterioAnd(Criterio c1, Criterio c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	public boolean cumple(GastoAbstracto gasto) {
		return (c1.cumple(gasto) && c2.cumple(gasto));
	}

}
