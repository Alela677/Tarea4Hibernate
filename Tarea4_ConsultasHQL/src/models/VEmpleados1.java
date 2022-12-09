package models;
// Generated 9 dic 2022 8:59:42 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VEmpleados1 generated by hbm2java
 */
@Entity
@Table(name = "v_empleados1", catalog = "bd_neptuno2")
public class VEmpleados1 implements java.io.Serializable {

	private VEmpleados1Id id;

	public VEmpleados1() {
	}

	public VEmpleados1(VEmpleados1Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "apellidos", column = @Column(name = "apellidos", nullable = false, length = 20)),
			@AttributeOverride(name = "nombre", column = @Column(name = "nombre", nullable = false, length = 10)),
			@AttributeOverride(name = "cargo", column = @Column(name = "cargo", length = 30)),
			@AttributeOverride(name = "tratamiento", column = @Column(name = "tratamiento", length = 25)),
			@AttributeOverride(name = "fechaNacimiento", column = @Column(name = "fecha_nacimiento", length = 10)),
			@AttributeOverride(name = "fechaContratacion", column = @Column(name = "fecha_contratacion", length = 10)),
			@AttributeOverride(name = "direccion", column = @Column(name = "direccion", length = 60)),
			@AttributeOverride(name = "ciudad", column = @Column(name = "ciudad", length = 15)),
			@AttributeOverride(name = "region", column = @Column(name = "region", length = 15)),
			@AttributeOverride(name = "cp", column = @Column(name = "cp", length = 10)),
			@AttributeOverride(name = "pais", column = @Column(name = "pais", length = 15)),
			@AttributeOverride(name = "telefonoDomicilio", column = @Column(name = "telefono_domicilio", length = 24)),
			@AttributeOverride(name = "extension", column = @Column(name = "extension", length = 4)),
			@AttributeOverride(name = "notas", column = @Column(name = "notas", length = 65535)),
			@AttributeOverride(name = "jefeId", column = @Column(name = "jefe_id")) })
	public VEmpleados1Id getId() {
		return this.id;
	}

	public void setId(VEmpleados1Id id) {
		this.id = id;
	}

}
