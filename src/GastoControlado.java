


import java.util.Date;

public class GastoControlado extends GastoDetallado {

	private Criterio control;

	public GastoControlado(String descrip, Date fecha, Criterio control) {
		super (descrip, fecha);
		this.control = control;
	}
	public void add(GastoAbstracto gasto) {
		if (!control.cumple(gasto)) {
			super.add(gasto);
		}
	}

}
