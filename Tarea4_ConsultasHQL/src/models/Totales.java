package models;
// Generated 9 dic 2022 8:59:42 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Totales generated by hbm2java
 */
@Entity
@Table(name = "totales", catalog = "bd_neptuno2")
public class Totales implements java.io.Serializable {

	private TotalesId id;

	public Totales() {
	}

	public Totales(TotalesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id", nullable = false)),
			@AttributeOverride(name = "fechaPedido", column = @Column(name = "fecha_pedido", length = 10)),
			@AttributeOverride(name = "clienteId", column = @Column(name = "cliente_id", nullable = false)),
			@AttributeOverride(name = "empleadoId", column = @Column(name = "empleado_id")),
			@AttributeOverride(name = "envioId", column = @Column(name = "envio_id")),
			@AttributeOverride(name = "cargo", column = @Column(name = "cargo", scale = 4)),
			@AttributeOverride(name = "importe", column = @Column(name = "importe", precision = 21, scale = 4)),
			@AttributeOverride(name = "total", column = @Column(name = "total", precision = 22, scale = 4)) })
	public TotalesId getId() {
		return this.id;
	}

	public void setId(TotalesId id) {
		this.id = id;
	}

}
