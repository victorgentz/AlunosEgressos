/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controles;

import java.io.Serializable;
import javax.persistence.Basic;
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
@Table(name = "curso")
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c"),
    @NamedQuery(name = "Curso.pesquisaNome", query = "SELECT c FROM Curso c WHERE c.nome like :nome"),
    @NamedQuery(name = "Curso.findByIdinstituicao", query = "SELECT c FROM Curso c WHERE c.cursoPK.idinstituicao = :idinstituicao"),
    @NamedQuery(name = "Curso.findByIdcurso", query = "SELECT c FROM Curso c WHERE c.cursoPK.idcurso = :idcurso"),
    @NamedQuery(name = "Curso.findByNome", query = "SELECT c FROM Curso c WHERE c.nome = :nome")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CursoPK cursoPK;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;

    public Curso() {
    }

    public Curso(CursoPK cursoPK) {
        this.cursoPK = cursoPK;
    }

    public Curso(CursoPK cursoPK, String nome) {
        this.cursoPK = cursoPK;
        this.nome = nome;
    }

    public Curso(int idinstituicao, String idcurso) {
        this.cursoPK = new CursoPK(idinstituicao, idcurso);
    }

    public CursoPK getCursoPK() {
        return cursoPK;
    }

    public void setCursoPK(CursoPK cursoPK) {
        this.cursoPK = cursoPK;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cursoPK != null ? cursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.cursoPK == null && other.cursoPK != null) || (this.cursoPK != null && !this.cursoPK.equals(other.cursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Curso[ cursoPK=" + cursoPK + " ]";
    }
    
}
