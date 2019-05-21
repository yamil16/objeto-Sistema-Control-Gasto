

import java.util.HashMap;
import java.util.Date;
import java.util.List;

public abstract class GastoAbstracto {

	//Se usa HashMap porque los atributos son dinamicos, se pueden agregar nuevos atributos
	protected HashMap<String,Object> atributos;

	public GastoAbstracto(String descrip, Date fecha, double monto) {
		//Carga los atributos que son fijos
		atributos = new HashMap <String, Object>();
		atributos.put("descripcion", descrip);
		atributos.put ("fecha", fecha);
		atributos.put ("monto", new Double(monto));
	}

	public void set(String nombre, Object valor) {
		atributos.put (nombre, valor);
	}

	public Object get(String nombre) {
		return atributos.get(nombre);
	}

	public abstract String detallar();

	public abstract double getTotalGastado(Criterio c);

	public abstract List<GastoAbstracto> listar(Criterio c);

}
