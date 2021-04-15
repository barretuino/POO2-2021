package pjAula7;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class RadioRelogio implements Radio, Relogio {
	
	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		LocalDate outraData = LocalDate.of(1913, Month.FEBRUARY, 14);		
		
		long dias = ChronoUnit.DAYS.between(outraData, agora);
		long meses = ChronoUnit.MONTHS.between(outraData, agora);
		long anos = ChronoUnit.YEARS.between(outraData, agora);
		System.out.printf("%s dias, %s meses e %s anos", dias, meses, anos);
	}
	

	@Override
	public void obterHora(Date hora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajustarHora(int hora, int minuto, int segundo, int milissegundo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean dispertador(Date hora) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sintonizarEstacao(float estacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ligaDesliga() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void aumentarVolume(double volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diminuirVolue(double volume) {
		// TODO Auto-generated method stub
		
	}

}
