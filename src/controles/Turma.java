/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author victo
 */
@Entity
@Table(name = "turma")
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findByIdinstituicao", query = "SELECT t FROM Turma t WHERE t.turmaPK.idinstituicao = :idinstituicao"),
    @NamedQuery(name = "Turma.findByIdcurso", query = "SELECT t FROM Turma t WHERE t.turmaPK.idcurso = :idcurso"),
    @NamedQuery(name = "Turma.findByIdturma", query = "SELECT t FROM Turma t WHERE t.turmaPK.idturma = :idturma"),
    @NamedQuery(name = "Turma.findByAnoinicio", query = "SELECT t FROM Turma t WHERE t.anoinicio = :anoinicio"),
    @NamedQuery(name = "Turma.findByAnoconclusao", query = "SELECT t FROM Turma t WHERE t.anoconclusao = :anoconclusao")})
public class Turma implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TurmaPK turmaPK;
    @Column(name = "anoinicio")
    private Integer anoinicio;
    @Column(name = "anoconclusao")
    private Integer anoconclusao;

    public Turma() {
    }

    public Turma(TurmaPK turmaPK) {
        this.turmaPK = turmaPK;
    }

    public Turma(int idinstituicao, String idcurso, String idturma) {
        this.turmaPK = new TurmaPK(idinstituicao, idcurso, idturma);
    }

    public TurmaPK getTurmaPK() {
        return turmaPK;
    }

    public void setTurmaPK(TurmaPK turmaPK) {
        this.turmaPK = turmaPK;
    }

    public Integer getAnoinicio() {
        return anoinicio;
    }

    public void setAnoinicio(Integer anoinicio) {
        this.anoinicio = anoinicio;
    }

    public Integer getAnoconclusao() {
        return anoconclusao;
    }

    public void setAnoconclusao(Integer anoconclusao) {
        this.anoconclusao = anoconclusao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (turmaPK != null ? turmaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.turmaPK == null && other.turmaPK != null) || (this.turmaPK != null && !this.turmaPK.equals(other.turmaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Turma[ turmaPK=" + turmaPK + " ]";
    }
    
}
