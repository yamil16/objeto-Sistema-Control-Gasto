

public class CriterioCalidad implements Criterio {

	private String calidad;

	public CriterioCalidad(String calidad) {
		this.calidad = calidad;
	}

	public boolean cumple(GastoAbstracto gasto) {
		String cal = (String)gasto.get("calidad");
		return (cal!=null && cal.equals(calidad));
	}

}
