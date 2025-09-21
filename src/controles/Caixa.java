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
@Table(name = "caixa")
@NamedQueries({
    @NamedQuery(name = "Caixa.findAll", query = "SELECT c FROM Caixa c"),
    @NamedQuery(name = "Caixa.pesquisaIdcaixa", query = "SELECT c FROM Caixa c WHERE c.idcaixa like :idcaixa"),
    @NamedQuery(name = "Caixa.findByIdcaixa", query = "SELECT c FROM Caixa c WHERE c.idcaixa = :idcaixa"),
    @NamedQuery(name = "Caixa.findByIdlocal", query = "SELECT c FROM Caixa c WHERE c.idlocal = :idlocal"),
    @NamedQuery(name = "Caixa.findByPrateleira", query = "SELECT c FROM Caixa c WHERE c.prateleira = :prateleira")})
public class Caixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idcaixa")
    private String idcaixa;
    @Basic(optional = false)
    @Column(name = "idlocal")
    private int idlocal;
    @Basic(optional = false)
    @Column(name = "prateleira")
    private String prateleira;

    public Caixa() {
    }

    public Caixa(String idcaixa) {
        this.idcaixa = idcaixa;
    }

    public Caixa(String idcaixa, int idlocal, String prateleira) {
        this.idcaixa = idcaixa;
        this.idlocal = idlocal;
        this.prateleira = prateleira;
    }

    public String getIdcaixa() {
        return idcaixa;
    }

    public void setIdcaixa(String idcaixa) {
        this.idcaixa = idcaixa;
    }

    public int getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(int idlocal) {
        this.idlocal = idlocal;
    }

    public String getPrateleira() {
        return prateleira;
    }

    public void setPrateleira(String prateleira) {
        this.prateleira = prateleira;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcaixa != null ? idcaixa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caixa)) {
            return false;
        }
        Caixa other = (Caixa) object;
        if ((this.idcaixa == null && other.idcaixa != null) || (this.idcaixa != null && !this.idcaixa.equals(other.idcaixa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Caixa[ idcaixa=" + idcaixa + " ]";
    }
    
}
