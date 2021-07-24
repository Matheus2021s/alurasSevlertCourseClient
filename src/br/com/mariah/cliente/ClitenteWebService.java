package br.com.mariah.cliente;

import org.apache.http.client.fluent.Request;

public class ClitenteWebService {

	
	public static void main(String[] args) throws Exception {

		String requisicao = Request
			.Post("http://localhost:8080/gerenciador/empresas")
		    .addHeader("Accept","application/xml")
			.execute()
		    .returnContent()
		    .asString();
		
		System.out.println(requisicao);
	}

}
