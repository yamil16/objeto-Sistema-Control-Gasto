
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Gasto extends GastoAbstracto {

	public Gasto(String descrip, Date fecha, double monto) {
		super (descrip, fecha, monto);
	}

	public String detallar() {
		return ((String)this.get("descripcion"));
	}

	public double getTotalGastado(Criterio c) {
		if (c.cumple(this)) {
			return ((Double)this.get("monto")).doubleValue();
		} else {
			return 0;
		}
	}

	public List<GastoAbstracto> listar(Criterio c) {
		List<GastoAbstracto> out = new ArrayList<GastoAbstracto>();
		if (c.cumple(this)) {
			out.add(this);
		}
		return out;
	}

}
