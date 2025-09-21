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
@Table(name = "instituicao")
@NamedQueries({
    @NamedQuery(name = "Instituicao.findAll", query = "SELECT i FROM Instituicao i"),
    @NamedQuery(name = "Instituicao.pesquisaNome", query = "SELECT p FROM Instituicao p WHERE p.nome like :nome"),
    @NamedQuery(name = "Instituicao.findByIdinstituicao", query = "SELECT i FROM Instituicao i WHERE i.idinstituicao = :idinstituicao"),
    @NamedQuery(name = "Instituicao.findByNome", query = "SELECT i FROM Instituicao i WHERE i.nome = :nome"),
    @NamedQuery(name = "Instituicao.findByRazaosocial", query = "SELECT i FROM Instituicao i WHERE i.razaosocial = :razaosocial")})
public class Instituicao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idinstituicao")
    private Integer idinstituicao;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "razaosocial")
    private String razaosocial;

    public Instituicao() {
    }

    public Instituicao(Integer idinstituicao) {
        this.idinstituicao = idinstituicao;
    }

    public Instituicao(Integer idinstituicao, String nome) {
        this.idinstituicao = idinstituicao;
        this.nome = nome;
    }

    public Integer getIdinstituicao() {
        return idinstituicao;
    }

    public void setIdinstituicao(Integer idinstituicao) {
        this.idinstituicao = idinstituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinstituicao != null ? idinstituicao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Instituicao)) {
            return false;
        }
        Instituicao other = (Instituicao) object;
        if ((this.idinstituicao == null && other.idinstituicao != null) || (this.idinstituicao != null && !this.idinstituicao.equals(other.idinstituicao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Instituicao[ idinstituicao=" + idinstituicao + " ]";
    }
    
}
