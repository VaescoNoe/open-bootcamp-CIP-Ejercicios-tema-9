
public class Cliente extends Persona{
	
	private double credito;

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "Cliente [credito=" + credito + ", edad=" + super.getEdad() + ", nombre=" + super.getNombre()
				+ ", telefono=" + super.getTelefono() + "]";
	}
}
