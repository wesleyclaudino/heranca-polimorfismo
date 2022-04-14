package exceptions;

public class EscolhaException extends Exception {
	private static final long serialVersionUID = 1L;

	public EscolhaException(String msg) {
		super(msg);
	}
	
	public EscolhaException(Throwable err){
		super(err);
	}
}