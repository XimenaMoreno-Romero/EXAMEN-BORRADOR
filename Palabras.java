package examen;

public class Palabras {
	public void conviertePrimeraLetraMayuscula(String cadena) 
	{

		String resultado = cadena.toUpperCase().charAt(0) + cadena.substring(1, cadena.length()).toLowerCase();
		System.out.println("Primera letra en mayuscula: "+resultado);
	}
	public void invierteCadena(String cadena) {
		String cadenaInvertida = "";
		for (int convercion = cadena.length() - 1; convercion >= 0; convercion--) {
			cadenaInvertida += cadena.charAt(convercion);
		}
		System.out.println("Cadena invertida: " + cadenaInvertida);
	
		
	}
	public void convierteVocalesenMayuscula(String cadena) {
	
	}
	public void comprobarPalindromo(String cadena)
    {
  
        int n = cadena.length();
  
        cadena = cadena.toLowerCase();
  
        for (int i = 0; i < n; i++, n--)
        {
            if (cadena.charAt(i) != cadena.charAt(n - 1)) {
            	System.out.println("No es palindromo");
            } else {
            	System.out.println("Es palindromo");
            }
                
        }
  
        
    }
}
