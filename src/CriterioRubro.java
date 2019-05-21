

public class CriterioRubro implements Criterio {

	private String rubro;

	public CriterioRubro(String rubro) {
		this.rubro = rubro;
	}

	public boolean cumple(GastoAbstracto gasto) {
		String r = (String)gasto.get("rubro");
		return (r!=null && r.equals(rubro));
	}

}
