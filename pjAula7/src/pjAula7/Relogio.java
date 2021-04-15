package pjAula7;import java.util.Date;

public interface Relogio {
	public void obterHora(Date hora);
	public void ajustarHora(int hora, int minuto, int segundo, int milissegundo);
	public boolean dispertador(Date hora);
	//****Outros Métodos
}
