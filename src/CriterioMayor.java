

public class CriterioMayor implements Criterio {

	private double monto;

	public CriterioMayor(double monto) {
		this.monto = monto;
	}

	public boolean cumple(GastoAbstracto gasto) {
		Double amount = (Double)gasto.get("monto");
		return (amount!=null && amount.doubleValue() > monto);
	}

}
