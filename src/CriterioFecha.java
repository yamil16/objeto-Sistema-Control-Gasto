

import java.util.Date;

public class CriterioFecha implements Criterio {

	private Date fecha;

	public CriterioFecha(Date f) {
		fecha = f;
	}

	public boolean cumple(GastoAbstracto gasto) {
		Date date = (Date)gasto.get("fecha");
		return (date!=null && date.equals(fecha));
	}

}
