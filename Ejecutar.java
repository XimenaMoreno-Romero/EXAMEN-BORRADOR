package examen;
public class Ejecucion {
	
	public void iniciarPrograma() {
		String cadena1= "hasta luego cocodrilo";
		String cadena2= "anita lava la tina";
	
		Palabras modificador=new Palabras();
		modificador.conviertePrimeraLetraMayuscula(cadena1);
		modificador.invierteCadena(cadena1);
		modificador.conviertePrimeraLetraMayuscula(cadena2);
		modificador.invierteCadena(cadena2);
		modificador.convierteVocalesenMayuscula(cadena2);
		modificador.convierteVocalesenMayuscula(cadena1);
		modificador.comprobarPalindromo(cadena2);
		modificador.comprobarPalindromo(cadena1);
	}

}
