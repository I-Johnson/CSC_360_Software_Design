package firstProj;

public class UnderAgeException extends Exception {

	private static final long serialVersionUID = 8834243242167852690L;

	/**
	 * 
	 */
	public UnderAgeException() {
		super("Parent is too Young");
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public UnderAgeException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
