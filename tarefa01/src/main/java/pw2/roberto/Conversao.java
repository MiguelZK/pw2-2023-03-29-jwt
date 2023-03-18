package pw2.roberto;

public class Conversao {

	private double valorEmNos;
	private double valorEmKm;

	public Conversao() {
	}

	@Override
	public String toString() {
		return "Conversao [valorEmNos=" + valorEmNos + ", valorEmKm=" + Math.round(valorEmKm) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(valorEmNos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valorEmKm);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conversao other = (Conversao) obj;
		if (Double.doubleToLongBits(valorEmNos) != Double.doubleToLongBits(other.valorEmNos))
			return false;
		if (Double.doubleToLongBits(valorEmKm) != Double.doubleToLongBits(other.valorEmKm))
			return false;
		return true;
	}

	public double getValorEmNos() {
		return valorEmNos;
	}

	public void setValorEmNos(double valorEmNos) {
		this.valorEmNos = valorEmNos;
	}

	public double getValorEmKm() {
		return valorEmKm;
	}

	public void setValorEmKm(double valorEmKm) {
		this.valorEmKm = valorEmKm;
	}

}
