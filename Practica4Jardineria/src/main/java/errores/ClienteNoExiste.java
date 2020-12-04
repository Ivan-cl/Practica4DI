package errores;

public class ClienteNoExiste extends Exception {
	private static final long serialVersionUID = 1L;

	public String getMessage() {
		return "El cliente no está en la base de datos";
	}
}
