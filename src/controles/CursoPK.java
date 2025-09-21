/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author victo
 */
@Embeddable
public class CursoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idinstituicao")
    private int idinstituicao;
    @Basic(optional = false)
    @Column(name = "idcurso")
    private String idcurso;

    public CursoPK() {
    }

    public CursoPK(int idinstituicao, String idcurso) {
        this.idinstituicao = idinstituicao;
        this.idcurso = idcurso;
    }

    public int getIdinstituicao() {
        return idinstituicao;
    }

    public void setIdinstituicao(int idinstituicao) {
        this.idinstituicao = idinstituicao;
    }

    public String getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(String idcurso) {
        this.idcurso = idcurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idinstituicao;
        hash += (idcurso != null ? idcurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoPK)) {
            return false;
        }
        CursoPK other = (CursoPK) object;
        if (this.idinstituicao != other.idinstituicao) {
            return false;
        }
        if ((this.idcurso == null && other.idcurso != null) || (this.idcurso != null && !this.idcurso.equals(other.idcurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.CursoPK[ idinstituicao=" + idinstituicao + ", idcurso=" + idcurso + " ]";
    }
    
}
