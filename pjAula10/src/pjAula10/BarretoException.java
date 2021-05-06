package pjAula10;

public class BarretoException extends Exception{
	private static final long serialVersionUID = 1L;

	public BarretoException(String erro) {
		new StackOverflowError(erro);
	}
}
