

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class GastoDetallado extends GastoAbstracto {

	private List<GastoAbstracto> gastos;

	public GastoDetallado(String descrip, Date fecha) {
		super (descrip, fecha, 0);
		gastos = new ArrayList <GastoAbstracto>();
	}

	public void add(GastoAbstracto gasto) {
		gastos.add(gasto);
		//actualizo el monto compuesto
		double actualValue = ((Double)this.get("monto")).doubleValue();
		double newValue = actualValue + ((Double)gasto.get("monto")).doubleValue();
		this.set ("monto", newValue);
	}

	public String detallar() {
		StringBuffer out = new StringBuffer();
		out.append ((String)this.get("descripcion"));
		for (GastoAbstracto g: gastos) {
			out.append(", ");
			out.append(g.detallar());
		}
		return out.toString();
		
	}

	public double getTotalGastado(Criterio c) {
		double total = 0;
		if (c.cumple(this)) {
			return ((Double)this.get("monto")).doubleValue();
		}
		
		for (GastoAbstracto g: gastos) {
			total += g.getTotalGastado(c);
		}
		return total;
	}

	public List<GastoAbstracto> listar(Criterio c) {
		List<GastoAbstracto> out = new ArrayList<GastoAbstracto>();
		//Si cumple, se retorna. Si no, se retornan los
		//de su interior que SI cumplan
		if (c.cumple(this)) {
			out.add(this);
			
		} else {
			for (GastoAbstracto g: gastos) {
				out.addAll(g.listar(c));	
			}
		}
		
		return out;		
	}

}
