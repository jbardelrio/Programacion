package repaso;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Iban {

	public static Boolean validarCuentaBancaria(String cuenta){
		Pattern cuentaPattern = Pattern.compile("\\d{20}");
		Matcher m = cuentaPattern.matcher(cuenta);
		if (m.matches())
		{
		// cuenta cumple el patrón (20 dígitos)
		String banco = cuenta.substring(0, 4);
		String sucursal = cuenta.substring(4,8);
		String dC = cuenta.substring(8, 10);
		String CCC = cuenta.substring(10, 20);
		if (!( obtenerDigito("00" + banco + sucursal ) == Integer.parseInt(String.valueOf(dC.charAt(0))))
		||!(obtenerDigito(CCC) == Integer.parseInt(String.valueOf(dC.charAt(1)))))
		return false;
		else
		return true;
		}
		return false;

	}


	public static int obtenerDigito(String valor){
		Integer[] valores = new Integer[]{1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
	
		Integer control = 0;
		for (int i=0; i <=9; i++)
		control += Integer.parseInt(String.valueOf(valor.charAt(i))) * valores[i];
		control = 11 - (control % 11);
		if (control == 11)
		control = 0;
		else if (control == 10)
		control = 1;
		return control;
	}

}
