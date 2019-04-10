package view;

import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
	
	Scanner leitor=new Scanner(System.in);
	
	
	
	
	public int menu(){
		
		int opcao = 0;
		boolean respostavalida=false;
		while(respostavalida==false) {
			System.out.println("Bem vindo ao Sistema de Consulta de Chamado");
			System.out.println("Digite 1 para consultar");
			System.out.println("Digite 2 para salvar");
			System.out.println("Digite 3 para carregar");
			System.out.println("Digite 4 para sair");
			
			try {
				opcao=leitor.nextInt();
				respostavalida=true;
			}catch(RuntimeException a) {//na vdd provavel que precise ser ioexception
				System.out.println("Erro, favor digitar novamente");
			}
		}
		return opcao;
		
		
		
	}

}
