package modeloPOO;

import java.util.ArrayList;
import java.util.stream.Collectors;

// representação do uso de classe interna (innerclass) com programação funcional.

public class InnerclassListaPalavras {

// classe interna "NoLista", só pode ser utilizada no escopo deste documento.
	private class NoLista {
		public String palavra;
		public int quantidade = 1;
// método construtor para instanciar objeto da classe "NoLista", utiliza-se a palavra
// reservada "this" seguida do atributo para indicar que o valor referência a ser
// considerado é aquele na representação da classe.
		public NoLista(String palavra, int quantidade) {
			this.palavra = palavra;
			this.quantidade = quantidade;
		}
	}

	private ArrayList<NoLista> lista = new ArrayList<>();

// estrutura try/catch funcional para verificar se palavra já existe na coleção com
// método "filter", resultado iguais a 0 sinalizam palavra presente na lista e o 
// contador "quantidade" é incrementado; resultado diferente de 0 gera erro e pega
// palavra para adição no array.
	public void addPalavra(String palavra) {
		try {
			lista.stream()
				 .filter(no -> no.palavra.equalsIgnoreCase(palavra))
				 .collect(Collectors.toList())
				 .get(0).quantidade++;
		} catch (Exception ex) {
			lista.add(new NoLista(palavra, 1));
		}
	}

// mecanismo da estrutura "try" é identico ao anterior, exceto pelo contador
// "quantidade" que não sofre incremento quando o valor é igual a 0, nessa ocasião 
// informa-se quantas vezes a palavra apareceu; valor diferente de 0 resulta
// representa paralvra que não consta na coleção, retornando o valor 0 no Contador.
	public int getContador(String palavra) {
		try {
			return lista.stream()
						.filter(no -> no.palavra.equalsIgnoreCase(palavra))
						.collect(Collectors.toList())
						.get(0).quantidade;
		} catch (Exception ex) {
			return 0;
		}
	}
}