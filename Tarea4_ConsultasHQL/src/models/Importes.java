package models;
// Generated 9 dic 2022 8:59:42 by Hibernate Tools 4.3.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Importes generated by hbm2java
 */
@Entity
@Table(name = "importes", catalog = "bd_neptuno2")
public class Importes implements java.io.Serializable {

	private ImportesId id;

	public Importes() {
	}

	public Importes(ImportesId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "pedidoId", column = @Column(name = "pedido_id", nullable = false)),
			@AttributeOverride(name = "productoId", column = @Column(name = "producto_id", nullable = false)),
			@AttributeOverride(name = "precioUnidad", column = @Column(name = "precio_unidad", scale = 4)),
			@AttributeOverride(name = "cantidad", column = @Column(name = "cantidad")),
			@AttributeOverride(name = "descuento", column = @Column(name = "descuento", precision = 7)),
			@AttributeOverride(name = "importe", column = @Column(name = "importe", precision = 22, scale = 4)) })
	public ImportesId getId() {
		return this.id;
	}

	public void setId(ImportesId id) {
		this.id = id;
	}

}
