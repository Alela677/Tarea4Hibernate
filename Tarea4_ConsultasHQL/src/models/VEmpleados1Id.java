package models;
// Generated 9 dic 2022 8:59:42 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VEmpleados1Id generated by hbm2java
 */
@Embeddable
public class VEmpleados1Id implements java.io.Serializable {

	private int id;
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
	private Integer jefeId;

	public VEmpleados1Id() {
	}

	public VEmpleados1Id(int id, String apellidos, String nombre) {
		this.id = id;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}

	public VEmpleados1Id(int id, String apellidos, String nombre, String cargo, String tratamiento,
			Date fechaNacimiento, Date fechaContratacion, String direccion, String ciudad, String region, String cp,
			String pais, String telefonoDomicilio, String extension, String notas, Integer jefeId) {
		this.id = id;
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
		this.jefeId = jefeId;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Column(name = "fecha_nacimiento", length = 10)
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

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

	@Column(name = "jefe_id")
	public Integer getJefeId() {
		return this.jefeId;
	}

	public void setJefeId(Integer jefeId) {
		this.jefeId = jefeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VEmpleados1Id))
			return false;
		VEmpleados1Id castOther = (VEmpleados1Id) other;

		return (this.getId() == castOther.getId())
				&& ((this.getApellidos() == castOther.getApellidos()) || (this.getApellidos() != null
						&& castOther.getApellidos() != null && this.getApellidos().equals(castOther.getApellidos())))
				&& ((this.getNombre() == castOther.getNombre()) || (this.getNombre() != null
						&& castOther.getNombre() != null && this.getNombre().equals(castOther.getNombre())))
				&& ((this.getCargo() == castOther.getCargo()) || (this.getCargo() != null
						&& castOther.getCargo() != null && this.getCargo().equals(castOther.getCargo())))
				&& ((this.getTratamiento() == castOther.getTratamiento())
						|| (this.getTratamiento() != null && castOther.getTratamiento() != null
								&& this.getTratamiento().equals(castOther.getTratamiento())))
				&& ((this.getFechaNacimiento() == castOther.getFechaNacimiento())
						|| (this.getFechaNacimiento() != null && castOther.getFechaNacimiento() != null
								&& this.getFechaNacimiento().equals(castOther.getFechaNacimiento())))
				&& ((this.getFechaContratacion() == castOther.getFechaContratacion())
						|| (this.getFechaContratacion() != null && castOther.getFechaContratacion() != null
								&& this.getFechaContratacion().equals(castOther.getFechaContratacion())))
				&& ((this.getDireccion() == castOther.getDireccion()) || (this.getDireccion() != null
						&& castOther.getDireccion() != null && this.getDireccion().equals(castOther.getDireccion())))
				&& ((this.getCiudad() == castOther.getCiudad()) || (this.getCiudad() != null
						&& castOther.getCiudad() != null && this.getCiudad().equals(castOther.getCiudad())))
				&& ((this.getRegion() == castOther.getRegion()) || (this.getRegion() != null
						&& castOther.getRegion() != null && this.getRegion().equals(castOther.getRegion())))
				&& ((this.getCp() == castOther.getCp()) || (this.getCp() != null && castOther.getCp() != null
						&& this.getCp().equals(castOther.getCp())))
				&& ((this.getPais() == castOther.getPais()) || (this.getPais() != null && castOther.getPais() != null
						&& this.getPais().equals(castOther.getPais())))
				&& ((this.getTelefonoDomicilio() == castOther.getTelefonoDomicilio())
						|| (this.getTelefonoDomicilio() != null && castOther.getTelefonoDomicilio() != null
								&& this.getTelefonoDomicilio().equals(castOther.getTelefonoDomicilio())))
				&& ((this.getExtension() == castOther.getExtension()) || (this.getExtension() != null
						&& castOther.getExtension() != null && this.getExtension().equals(castOther.getExtension())))
				&& ((this.getNotas() == castOther.getNotas()) || (this.getNotas() != null
						&& castOther.getNotas() != null && this.getNotas().equals(castOther.getNotas())))
				&& ((this.getJefeId() == castOther.getJefeId()) || (this.getJefeId() != null
						&& castOther.getJefeId() != null && this.getJefeId().equals(castOther.getJefeId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getId();
		result = 37 * result + (getApellidos() == null ? 0 : this.getApellidos().hashCode());
		result = 37 * result + (getNombre() == null ? 0 : this.getNombre().hashCode());
		result = 37 * result + (getCargo() == null ? 0 : this.getCargo().hashCode());
		result = 37 * result + (getTratamiento() == null ? 0 : this.getTratamiento().hashCode());
		result = 37 * result + (getFechaNacimiento() == null ? 0 : this.getFechaNacimiento().hashCode());
		result = 37 * result + (getFechaContratacion() == null ? 0 : this.getFechaContratacion().hashCode());
		result = 37 * result + (getDireccion() == null ? 0 : this.getDireccion().hashCode());
		result = 37 * result + (getCiudad() == null ? 0 : this.getCiudad().hashCode());
		result = 37 * result + (getRegion() == null ? 0 : this.getRegion().hashCode());
		result = 37 * result + (getCp() == null ? 0 : this.getCp().hashCode());
		result = 37 * result + (getPais() == null ? 0 : this.getPais().hashCode());
		result = 37 * result + (getTelefonoDomicilio() == null ? 0 : this.getTelefonoDomicilio().hashCode());
		result = 37 * result + (getExtension() == null ? 0 : this.getExtension().hashCode());
		result = 37 * result + (getNotas() == null ? 0 : this.getNotas().hashCode());
		result = 37 * result + (getJefeId() == null ? 0 : this.getJefeId().hashCode());
		return result;
	}

}
