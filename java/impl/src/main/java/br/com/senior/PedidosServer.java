package br.com.senior;

import br.com.senior.messaging.model.Server;
import br.com.senior.messaging.model.ServiceDescription;
import br.com.senior.varejo.pedidos.PedidosConstants;

@ServiceDescription(domain=PedidosConstants.DOMAIN, name=PedidosConstants.SERVICE, packages={
	"br.com.senior.varejo.pedidos" })
public class PedidosServer extends Server {

	public static void main(String[] args) {
		bootstrap(new PedidosServer());
	}
}
