/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victo
 */
@Entity
@Table(name = "localarquivo")
@NamedQueries({
    @NamedQuery(name = "Localarquivo.findAll", query = "SELECT l FROM Localarquivo l"),
    @NamedQuery(name = "Localarquivo.pesquisaIdlocal", query = "SELECT l FROM Localarquivo l WHERE CAST(l.idlocal AS text) LIKE :idlocal"),
    @NamedQuery(name = "Localarquivo.findByIdlocal", query = "SELECT l FROM Localarquivo l WHERE l.idlocal = :idlocal"),
    @NamedQuery(name = "Localarquivo.findByCampus", query = "SELECT l FROM Localarquivo l WHERE l.campus = :campus"),
    @NamedQuery(name = "Localarquivo.findByDescricao", query = "SELECT l FROM Localarquivo l WHERE l.descricao = :descricao")})
public class Localarquivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idlocal")
    private Integer idlocal;
    @Basic(optional = false)
    @Column(name = "campus")
    private String campus;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;

    public Localarquivo() {
    }

    public Localarquivo(Integer idlocal) {
        this.idlocal = idlocal;
    }

    public Localarquivo(Integer idlocal, String campus, String descricao) {
        this.idlocal = idlocal;
        this.campus = campus;
        this.descricao = descricao;
    }

    public Integer getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Integer idlocal) {
        this.idlocal = idlocal;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlocal != null ? idlocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Localarquivo)) {
            return false;
        }
        Localarquivo other = (Localarquivo) object;
        if ((this.idlocal == null && other.idlocal != null) || (this.idlocal != null && !this.idlocal.equals(other.idlocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Localarquivo[ idlocal=" + idlocal + " ]";
    }
    
}
