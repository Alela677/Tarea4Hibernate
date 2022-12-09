package models;
// Generated 9 dic 2022 8:59:42 by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pedidos generated by hbm2java
 */
@Entity
@Table(name = "pedidos", catalog = "bd_neptuno2")
public class Pedidos implements java.io.Serializable {

	private Integer id;
	private Clientes clientes;
	private Empleados empleados;
	private Envios envios;
	private Date fechaPedido;
	private Date fechaEntrega;
	private Date fechaEnvio;
	private BigDecimal cargo;
	private String destinatario;
	private String direccionDestinatario;
	private String ciudadDestinatario;
	private String regionDestinatario;
	private String cpDestinatario;
	private String paisDestinatario;
	private Set detalleses = new HashSet(0);

	public Pedidos() {
	}

	public Pedidos(Clientes clientes) {
		this.clientes = clientes;
	}

	public Pedidos(Clientes clientes, Empleados empleados, Envios envios, Date fechaPedido, Date fechaEntrega,
			Date fechaEnvio, BigDecimal cargo, String destinatario, String direccionDestinatario,
			String ciudadDestinatario, String regionDestinatario, String cpDestinatario, String paisDestinatario,
			Set<?> detalleses) {
		this.clientes = clientes;
		this.empleados = empleados;
		this.envios = envios;
		this.fechaPedido = fechaPedido;
		this.fechaEntrega = fechaEntrega;
		this.fechaEnvio = fechaEnvio;
		this.cargo = cargo;
		this.destinatario = destinatario;
		this.direccionDestinatario = direccionDestinatario;
		this.ciudadDestinatario = ciudadDestinatario;
		this.regionDestinatario = regionDestinatario;
		this.cpDestinatario = cpDestinatario;
		this.paisDestinatario = paisDestinatario;
		this.detalleses = detalleses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cliente_id", nullable = false)
	public Clientes getClientes() {
		return this.clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "empleado_id")
	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "envio_id")
	public Envios getEnvios() {
		return this.envios;
	}

	public void setEnvios(Envios envios) {
		this.envios = envios;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_pedido", length = 10)
	public Date getFechaPedido() {
		return this.fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_entrega", length = 10)
	public Date getFechaEntrega() {
		return this.fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_envio", length = 10)
	public Date getFechaEnvio() {
		return this.fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	@Column(name = "cargo", scale = 4)
	public BigDecimal getCargo() {
		return this.cargo;
	}

	public void setCargo(BigDecimal cargo) {
		this.cargo = cargo;
	}

	@Column(name = "destinatario", length = 40)
	public String getDestinatario() {
		return this.destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	@Column(name = "direccion_destinatario", length = 60)
	public String getDireccionDestinatario() {
		return this.direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	@Column(name = "ciudad_destinatario", length = 15)
	public String getCiudadDestinatario() {
		return this.ciudadDestinatario;
	}

	public void setCiudadDestinatario(String ciudadDestinatario) {
		this.ciudadDestinatario = ciudadDestinatario;
	}

	@Column(name = "region_destinatario", length = 15)
	public String getRegionDestinatario() {
		return this.regionDestinatario;
	}

	public void setRegionDestinatario(String regionDestinatario) {
		this.regionDestinatario = regionDestinatario;
	}

	@Column(name = "cp_destinatario", length = 10)
	public String getCpDestinatario() {
		return this.cpDestinatario;
	}

	public void setCpDestinatario(String cpDestinatario) {
		this.cpDestinatario = cpDestinatario;
	}

	@Column(name = "pais_destinatario", length = 15)
	public String getPaisDestinatario() {
		return this.paisDestinatario;
	}

	public void setPaisDestinatario(String paisDestinatario) {
		this.paisDestinatario = paisDestinatario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedidos")
	public Set getDetalleses() {
		return this.detalleses;
	}

	public void setDetalleses(Set detalleses) {
		this.detalleses = detalleses;
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", clientes=" + clientes + ", empleados=" + empleados + ", envios=" + envios
				+ ", fechaPedido=" + fechaPedido + ", fechaEntrega=" + fechaEntrega + ", fechaEnvio=" + fechaEnvio
				+ ", cargo=" + cargo + ", destinatario=" + destinatario + ", direccionDestinatario="
				+ direccionDestinatario + ", ciudadDestinatario=" + ciudadDestinatario + ", regionDestinatario="
				+ regionDestinatario + ", cpDestinatario=" + cpDestinatario + ", paisDestinatario=" + paisDestinatario
				+ ", detalleses=" + detalleses + "]";
	}

	
}
