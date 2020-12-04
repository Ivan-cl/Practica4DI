package JardineriaTest;

import java.util.*;

public class pedido {

	private int codigoPedido;
	private Calendar fechaPedido;
	private Calendar fechaEsperada;
	private Calendar fechaEntrega;
	private String estado;
	private String comentarios;
	private int codigoCliente;


	public pedido() {
	}

	public pedido(int codigoPedido, Calendar fechaPedido, Calendar fechaEsperada, Calendar fechaEntrega, String estado,
			String comentarios, int codigoCliente) {
		this.codigoPedido = codigoPedido;
		this.fechaPedido = fechaPedido;
		this.fechaEsperada = fechaEsperada;
		this.fechaEntrega = fechaEntrega;
		this.estado = estado;
		this.comentarios = comentarios;
		this.codigoCliente = codigoCliente;
	}

	public pedido(int codigoPedido, Calendar fechaPedido, Calendar fechaEsperada, int codigoCliente) {
		this.codigoPedido = codigoPedido;
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEsperada;
		this.codigoCliente = codigoCliente;
	}

	public int getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public Calendar getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Calendar fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Calendar getFechaEsperada() {
		return fechaEsperada;
	}

	public void setFechaEsperada(Calendar fechaEsperada) {
		this.fechaEsperada = fechaEsperada;
	}

	public Calendar getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Calendar fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

}