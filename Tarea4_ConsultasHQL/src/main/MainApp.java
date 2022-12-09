package main;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import org.hibernate.Query;
import org.hibernate.Session;

import models.Clientes;
import models.Detalles;
import models.Pedidos;
import models.Productos;
import utils.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {

		Query query = null;

		Session sesion = HibernateUtil.getSession();
		sesion.getTransaction().begin();

//		System.out.println("-------------Consulta 1 ----------------");
//		System.out.println("1. Mostrar el nombre del producto y el nombre de la categoría de todos los "
//				+ "productos que contengan la letra Q en el nombre.");
//
//		query = sesion.createQuery("SELECT a, a.categorias  " + "FROM Productos a " + "JOIN a.categorias c "
//				+ "WHERE a.producto LIKE '%q%'" + "ORDER BY a.categorias.categoria, a.producto");
//
//		List<Object[]> consulta1 = query.list();
//
//		for (Object[] objects : consulta1) {
//			Productos producto = (Productos) objects[0];
//			Categorias categoria = (Categorias) objects[1];
//
//			System.out.println(producto.getProducto() + " || " + categoria.getCategoria());
//		}

//		System.out.println("-------------Consulta 2 ----------------");
//		System.out.println("2. Mostrar el número de pedido y el país del cliente de los pedidos de mayo del año 1997");
//
//		query = sesion.createQuery("SELECT p,c, p.paisDestinatario FROM Pedidos p JOIN p.clientes c WHERE p.fechaPedido  BETWEEN '1997-05-01' AND '1997-05-31'");
//
//		List<Object[]> consulta2 = query.list();
//
//		for (Object[] objects : consulta2) {
//			Pedidos pedido = (Pedidos) objects[0];
//			Clientes cliente = (Clientes) objects[1];
//
//			System.out.println(pedido.getId() + "||" + cliente.getPais());
//		}

//		System.out.println("-------------Consulta 3 ----------------");
//		System.out.println("2. Mostrar fecha del pedido, cantidad y el nombre producto, y el código del pedido para"
//				+ "los códigos de pedido 10285 o 10298.");
//
//		query = sesion.createQuery("SELECT p, d, a FROM Pedidos p JOIN p.detalleses d JOIN d.productos a  "
//				+ "WHERE p.id= '10285' OR p.id='10298'");
//
//		List<Object[]> pedido = query.list();
//		for (Object[] objects : pedido) {
//			Pedidos pedido1 = (Pedidos) objects[0];
//			Detalles detalle = (Detalles) objects[1];
//			Productos producto = (Productos) objects[2];
//
//			System.out.println(pedido1.getFechaPedido() + "|" + detalle.getCantidad() + "|" + producto.getProducto()
//					+ "|" + pedido1.getId());
//		}

//		System.out.println("-------------Consulta 4 ----------------");
//		System.out.println("4. ¿Cuánto se factura cada mes? Mostrar el año, el mes y el total.");
//
//		query = sesion.createQuery(
//				"SELECT YEAR(p.fechaPedido), MONTH(p.fechaPedido), SUM(d.cantidad *  d.precioUnidad * ( 1 - descuento)) FROM Pedidos p JOIN p.detalleses d GROUP BY 1,2 ORDER BY 3");
//
//		List<Object[]> consulta4 = query.list();
//
//		for (Object[] objects : consulta4) {
//			int año = (int) objects[0];
//			int mes = (int) objects[1];
//			BigDecimal facturacion = (BigDecimal) objects[2];
//			System.out.println(año + "|" + mes + "|" + facturacion);
//		}

//		System.out.println("-------------Consulta 5 ----------------");
//		System.out.println("5. Los pedidos que hizo la empleada Nancy");
//
//		query = sesion.createQuery(
//				"SELECT p,e FROM Pedidos p JOIN p.empleados e WHERE e.id = (SELECT e.id FROM Empleados e WHERE e.nombre = 'Nancy')");
//
//		List<Object[]> consulta5 = query.list();
//		for (Object[] objects : consulta5) {
//			Pedidos pedido = (Pedidos) objects[0];
//			System.out.println(pedido);
//		}
//
//		System.out.println("-------------Consulta 6----------------");
//		System.out.println("6. Mostrar los pedidos de Anton (código cliente)");
//
//		query = sesion.createQuery(
//				"SELECT p,c FROM Pedidos p JOIN p.clientes c WHERE c.codigo = (SELECT c.codigo FROM Clientes c WHERE c.codigo = 'ANTON') ");
//
//		List<Object[]> consulta6 = query.list();
//		for (Object[] objects : consulta6) {
//			Pedidos pedido = (Pedidos) objects[0];
//			System.out.println(pedido);
//		}

//		System.out.println("-------------Consulta 7----------------");
//		System.out.println("7. Cuántos productos hay de cada categoría y el precio medio");
//
//		query = sesion.createQuery("SELECT COUNT(p.id),AVG(p.precioUnidad) ,p FROM Productos p");
//
//		List<Object[]> consulta7 = query.list();
//
//		for (Object[] objects : consulta7) {
//			long producto = (long) objects[0];
//			double precio = (double) objects[1];
//			System.out.println(producto + "|" + precio);
//		}

//		System.out.println("-------------Consulta 8----------------");
//		System.out.println("8. Mostrar los pedidos que tienen productos en la categoría 2 o 3");
//
//		query = sesion.createQuery(
//				"SELECT p,d,r FROM Detalles d JOIN d.pedidos p JOIN d.productos r  WHERE r.categorias=2 OR r.categorias =3 ORDER BY p.id");
//
//		List<Object[]> consulta7 = query.list();
//		for (Object[] objects : consulta7) {
//			Pedidos pedido = (Pedidos) objects[0];
//			System.out.println(pedido);
//		}

		System.out.println("-------------Consulta 9----------------");
		System.out.println("9.  Clientes que pidieron queso en julio de 1997");

		query = sesion.createQuery("SELECT c,p FROM Clientes c JOIN c.id p");
		List<Object[]> consulta9 = query.list();
		for (Object[] objects : consulta9) {
			Clientes pedido = (Clientes) objects[0];
			System.out.println(pedido);
		}

		sesion.getTransaction().commit();
		sesion.close();

	}

}
