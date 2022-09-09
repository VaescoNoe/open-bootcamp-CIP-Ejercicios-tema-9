
public class Main {
	public static void main(String[] args) {
		
		Cliente c = new Cliente();
		
		c.setCredito(2000.99);
		c.setNombre("Noe");
		c.setEdad(30);
		c.setTelefono("5523232323");
		
		System.out.println(c.toString());
	}
}
