package application;

import java.io.IOException;

/*Ela retorna –1 quando o fim do fluxo é alcançado. A segunda versão lê bytes no fluxo de entrada e os insere 
em dados até o array ficar cheio, o fim do fluxo ser alcançado ou um erro ocorrer. Ela 
retorna o número de bytes lidos ou –1 quando o fim do fluxo é alcançado. A terceira 
versão lê a entrada em dados começando no local especificado por início. Até max
bytes podem ser armazenados. Ela retorna o número de bytes lidos ou –1 quando o 
fim do fluxo é alcançado. Todas lançam uma IOException quando um erro ocorre. 
Na leitura a partir de System.in, o pressionamento de ENTER gera uma condição de 
fim de fluxo.
Aqui está um programa que demonstra a leitura de um array de bytes a partir de 
System.in. Observe que qualquer exceção de I/O que posa ser gerada é lançada para 
fora de main( )*/

public final class ReadBytes {

	public static void main(String[] args) {

		byte data[] = new byte[10];

		try {
			// System.in é instância de InputStream
			// inclui espacos em branco
			System.in.read(data);
			System.out.println("Dados inseridos." + data.length);
			for (int i = 0; i < data.length; i++) {
				System.out.print((char) data[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}// main

}// class
