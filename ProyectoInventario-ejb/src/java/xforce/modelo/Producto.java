/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xforce.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Samuel Gamez
 */
@Entity
@Table(name = "producto", catalog = "inventarioalmacen", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByIdproducto", query = "SELECT p FROM Producto p WHERE p.idproducto = :idproducto"),
    @NamedQuery(name = "Producto.findByNombre", query = "SELECT p FROM Producto p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Producto.findByPrecio", query = "SELECT p FROM Producto p WHERE p.precio = :precio"),
    @NamedQuery(name = "Producto.findByLote", query = "SELECT p FROM Producto p WHERE p.lote = :lote"),
    @NamedQuery(name = "Producto.findByPiezas", query = "SELECT p FROM Producto p WHERE p.piezas = :piezas"),
    @NamedQuery(name = "Producto.findByCantidad", query = "SELECT p FROM Producto p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Producto.findByAnaquel", query = "SELECT p FROM Producto p WHERE p.anaquel = :anaquel"),
    @NamedQuery(name = "Producto.findByBloque", query = "SELECT p FROM Producto p WHERE p.bloque = :bloque")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproducto")
    private Integer idproducto;
    @Size(max = 100)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "precio")
    private String precio;
    @Size(max = 8)
    @Column(name = "lote")
    private String lote;
    @Size(max = 45)
    @Column(name = "piezas")
    private String piezas;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "anaquel")
    private Character anaquel;
    @Size(max = 5)
    @Column(name = "bloque")
    private String bloque;
    @JoinColumn(name = "marca_idmarca", referencedColumnName = "idmarca")
    @ManyToOne(optional = false)
    private Marca marcaIdmarca;
    @JoinColumn(name = "proveedor_idproveedor", referencedColumnName = "idproveedor")
    @ManyToOne(optional = false)
    private Proveedor proveedorIdproveedor;
    @JoinColumn(name = "tipo_idtipo", referencedColumnName = "idtipo")
    @ManyToOne(optional = false)
    private Tipo tipoIdtipo;

    public Producto() {
    }

    public Producto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getPiezas() {
        return piezas;
    }

    public void setPiezas(String piezas) {
        this.piezas = piezas;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Character getAnaquel() {
        return anaquel;
    }

    public void setAnaquel(Character anaquel) {
        this.anaquel = anaquel;
    }

    public String getBloque() {
        return bloque;
    }

    public void setBloque(String bloque) {
        this.bloque = bloque;
    }

    public Marca getMarcaIdmarca() {
        return marcaIdmarca;
    }

    public void setMarcaIdmarca(Marca marcaIdmarca) {
        this.marcaIdmarca = marcaIdmarca;
    }

    public Proveedor getProveedorIdproveedor() {
        return proveedorIdproveedor;
    }

    public void setProveedorIdproveedor(Proveedor proveedorIdproveedor) {
        this.proveedorIdproveedor = proveedorIdproveedor;
    }

    public Tipo getTipoIdtipo() {
        return tipoIdtipo;
    }

    public void setTipoIdtipo(Tipo tipoIdtipo) {
        this.tipoIdtipo = tipoIdtipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "xforce.modelo.Producto[ idproducto=" + idproducto + " ]";
    }
    
}
