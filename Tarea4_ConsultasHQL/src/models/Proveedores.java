package models;
// Generated 9 dic 2022 8:59:42 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Proveedores generated by hbm2java
 */
@Entity
@Table(name = "proveedores", catalog = "bd_neptuno2", uniqueConstraints = @UniqueConstraint(columnNames = "empresa"))
public class Proveedores implements java.io.Serializable {

	private Integer id;
	private String empresa;
	private String contacto;
	private String cargoContacto;
	private String direccion;
	private String ciudad;
	private String region;
	private String cp;
	private String pais;
	private String telefono;
	private String fax;
	private String web;
	private Set productoses = new HashSet(0);

	public Proveedores() {
	}

	public Proveedores(String empresa) {
		this.empresa = empresa;
	}

	public Proveedores(String empresa, String contacto, String cargoContacto, String direccion, String ciudad,
			String region, String cp, String pais, String telefono, String fax, String web, Set productoses) {
		this.empresa = empresa;
		this.contacto = contacto;
		this.cargoContacto = cargoContacto;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.region = region;
		this.cp = cp;
		this.pais = pais;
		this.telefono = telefono;
		this.fax = fax;
		this.web = web;
		this.productoses = productoses;
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

	@Column(name = "empresa", unique = true, nullable = false, length = 40)
	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Column(name = "contacto", length = 30)
	public String getContacto() {
		return this.contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@Column(name = "cargo_contacto", length = 30)
	public String getCargoContacto() {
		return this.cargoContacto;
	}

	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
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

	@Column(name = "telefono", length = 24)
	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Column(name = "fax", length = 24)
	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Column(name = "web", length = 65535)
	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "proveedores")
	public Set getProductoses() {
		return this.productoses;
	}

	public void setProductoses(Set productoses) {
		this.productoses = productoses;
	}

}
