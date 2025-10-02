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
@Table(name = "aluno")
@NamedQueries({
    @NamedQuery(name = "Aluno.findAll", query = "SELECT a FROM Aluno a"),
    @NamedQuery(name = "Aluno.pesquisaNome", query = "SELECT a FROM Aluno a WHERE a.nome like :nome"),
    @NamedQuery(name = "Aluno.findByCpf", query = "SELECT a FROM Aluno a WHERE a.cpf = :cpf"),
    @NamedQuery(name = "Aluno.findByIdinstituicao", query = "SELECT a FROM Aluno a WHERE a.idinstituicao = :idinstituicao"),
    @NamedQuery(name = "Aluno.findByNome", query = "SELECT a FROM Aluno a WHERE a.nome = :nome"),
    @NamedQuery(name = "Aluno.findByIdcurso", query = "SELECT a FROM Aluno a WHERE a.idcurso = :idcurso"),
    @NamedQuery(name = "Aluno.findByIdturma", query = "SELECT a FROM Aluno a WHERE a.idturma = :idturma"),
    @NamedQuery(name = "Aluno.findByTelefone", query = "SELECT a FROM Aluno a WHERE a.telefone = :telefone"),
    @NamedQuery(name = "Aluno.findBySituacao", query = "SELECT a FROM Aluno a WHERE a.situacao = :situacao"),
    @NamedQuery(name = "Aluno.ConsultaCurso", query = "SELECT a FROM Aluno a WHERE a.idinstituicao = :idinstituicao AND a.idcurso like :idcurso"),
    @NamedQuery(name = "Aluno.ConsultaTurma", query = "SELECT a FROM Aluno a WHERE a.idinstituicao = :idinstituicao and a.idcurso = :idcurso and a.idturma = :idturma"),
    @NamedQuery(name = "Aluno.findByIdcaixa", query = "SELECT a FROM Aluno a WHERE a.idcaixa = :idcaixa")})
public class Aluno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "idinstituicao")
    private int idinstituicao;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "idcurso")
    private String idcurso;
    @Basic(optional = false)
    @Column(name = "idturma")
    private String idturma;
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "situacao")
    private String situacao;
    @Basic(optional = false)
    @Column(name = "idcaixa")
    private String idcaixa;

    public Aluno() {
    }

    public Aluno(String cpf) {
        this.cpf = cpf;
    }

    public Aluno(String cpf, int idinstituicao, String nome, String idcurso, String idturma, String situacao, String idcaixa) {
        this.cpf = cpf;
        this.idinstituicao = idinstituicao;
        this.nome = nome;
        this.idcurso = idcurso;
        this.idturma = idturma;
        this.situacao = situacao;
        this.idcaixa = idcaixa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdinstituicao() {
        return idinstituicao;
    }

    public void setIdinstituicao(int idinstituicao) {
        this.idinstituicao = idinstituicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(String idcurso) {
        this.idcurso = idcurso;
    }

    public String getIdturma() {
        return idturma;
    }

    public void setIdturma(String idturma) {
        this.idturma = idturma;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getIdcaixa() {
        return idcaixa;
    }

    public void setIdcaixa(String idcaixa) {
        this.idcaixa = idcaixa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpf != null ? cpf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aluno)) {
            return false;
        }
        Aluno other = (Aluno) object;
        if ((this.cpf == null && other.cpf != null) || (this.cpf != null && !this.cpf.equals(other.cpf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "controles.Aluno[ cpf=" + cpf + " ]";
    }
    
}
