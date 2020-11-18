package application;

import java.io.IOException;

/*Ela retorna �1 quando o fim do fluxo � alcan�ado. A segunda vers�o l� bytes no fluxo de entrada e os insere 
em dados at� o array ficar cheio, o fim do fluxo ser alcan�ado ou um erro ocorrer. Ela 
retorna o n�mero de bytes lidos ou �1 quando o fim do fluxo � alcan�ado. A terceira 
vers�o l� a entrada em dados come�ando no local especificado por in�cio. At� max
bytes podem ser armazenados. Ela retorna o n�mero de bytes lidos ou �1 quando o 
fim do fluxo � alcan�ado. Todas lan�am uma IOException quando um erro ocorre. 
Na leitura a partir de System.in, o pressionamento de ENTER gera uma condi��o de 
fim de fluxo.
Aqui est� um programa que demonstra a leitura de um array de bytes a partir de 
System.in. Observe que qualquer exce��o de I/O que posa ser gerada � lan�ada para 
fora de main( )*/

public final class ReadBytes {

	public static void main(String[] args) {

		byte data[] = new byte[10];

		try {
			// System.in � inst�ncia de InputStream
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
