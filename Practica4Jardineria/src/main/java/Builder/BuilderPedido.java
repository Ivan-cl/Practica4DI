package Builder;

import JardineriaTest.pedido;
import errores.*;
import java.util.*;

import Dao.pedidosDao;

public class BuilderPedido {
	public static pedido build(int codigoPedido, Date fechaPedido, Date fechaEsperada, int codigoCliente)
			throws PedidoHoy, MasTresDias, ClienteNoExiste {

		pedidosDao pedidosDao = new pedidosDao();

		pedido pedido = new pedido();
		
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, -3);
		
		Date fecha = new Date();
		Date fecha2 = new Date();
		fecha2=c.getTime();
		

		if (fechaPedido != fecha) {
			throw new PedidoHoy();
		}
		

		if (pedidosDao.getPedido(codigoCliente) == null) {
			throw new ClienteNoExiste();
		}

		return pedido;
	}
}