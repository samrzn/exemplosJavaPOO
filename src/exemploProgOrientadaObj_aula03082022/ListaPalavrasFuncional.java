package exemploProgOrientadaObj_aula03082022;

import modelPOO.InnerclassListaPalavras;

public class ListaPalavrasFuncional {

// a classe "InnerclassListaPalavras" é importada para criação do objeto de
// exemplo "l1", com adição de elementos ao array pelo método "addPalavra".
	public static void main(String[] args) {
		InnerclassListaPalavras l1 = new InnerclassListaPalavras();
		String palavras[] = { "Viana", "Cruz", "Sena", "Rosa", "Neves" };
		for (String p : palavras) {
			l1.addPalavra(p);
		}
// método "getContador" é utilizado para verificação da quantidade de vezes que
// o elemento declarado no parâmetro apareceu no array de string.
		System.out.println(l1.getContador("Cruz"));
		System.out.println(l1.getContador("Montez"));
	}
}