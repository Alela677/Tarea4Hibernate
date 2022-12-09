package models;
// Generated 9 dic 2022 8:59:42 by Hibernate Tools 4.3.6.Final

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
 * Empleados generated by hbm2java
 */
@Entity
@Table(name = "empleados", catalog = "bd_neptuno2")
public class Empleados implements java.io.Serializable {

	private Integer id;
	private Empleados empleados;
	private String apellidos;
	private String nombre;
	private String cargo;
	private String tratamiento;
	private Date fechaNacimiento;
	private Date fechaContratacion;
	private String direccion;
	private String ciudad;
	private String region;
	private String cp;
	private String pais;
	private String telefonoDomicilio;
	private String extension;
	private String notas;
	private Set pedidoses = new HashSet(0);
	private Set empleadoses = new HashSet(0);

	public Empleados() {
	}

	public Empleados(String apellidos, String nombre) {
		this.apellidos = apellidos;
		this.nombre = nombre;
	}

	public Empleados(Empleados empleados, String apellidos, String nombre, String cargo, String tratamiento,
			Date fechaNacimiento, Date fechaContratacion, String direccion, String ciudad, String region, String cp,
			String pais, String telefonoDomicilio, String extension, String notas, Set pedidoses, Set empleadoses) {
		this.empleados = empleados;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.cargo = cargo;
		this.tratamiento = tratamiento;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaContratacion = fechaContratacion;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.region = region;
		this.cp = cp;
		this.pais = pais;
		this.telefonoDomicilio = telefonoDomicilio;
		this.extension = extension;
		this.notas = notas;
		this.pedidoses = pedidoses;
		this.empleadoses = empleadoses;
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
	@JoinColumn(name = "jefe_id")
	public Empleados getEmpleados() {
		return this.empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	@Column(name = "apellidos", nullable = false, length = 20)
	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Column(name = "nombre", nullable = false, length = 10)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "cargo", length = 30)
	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Column(name = "tratamiento", length = 25)
	public String getTratamiento() {
		return this.tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_contratacion", length = 10)
	public Date getFechaContratacion() {
		return this.fechaContratacion;
	}

	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	@Column(name = "direccion", length = 60)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "ciudad", length = 15)
	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "region", length = 15)
	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	@Column(name = "cp", length = 10)
	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Column(name = "pais", length = 15)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Column(name = "telefono_domicilio", length = 24)
	public String getTelefonoDomicilio() {
		return this.telefonoDomicilio;
	}

	public void setTelefonoDomicilio(String telefonoDomicilio) {
		this.telefonoDomicilio = telefonoDomicilio;
	}

	@Column(name = "extension", length = 4)
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Column(name = "notas", length = 65535)
	public String getNotas() {
		return this.notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleados")
	public Set getPedidoses() {
		return this.pedidoses;
	}

	public void setPedidoses(Set pedidoses) {
		this.pedidoses = pedidoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "empleados")
	public Set getEmpleadoses() {
		return this.empleadoses;
	}

	public void setEmpleadoses(Set empleadoses) {
		this.empleadoses = empleadoses;
	}

}