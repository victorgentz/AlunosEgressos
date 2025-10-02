/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import controles.Curso;
import java.util.List; 
import javax.persistence.*;
import controles.Instituicao; 
import controles.Turma;
import persistencia.dao;


/**
 *
 * @author victo
 */
public class dao {
    public static void salvar (Object objeto) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        ent.getTransaction().begin(); 
        //ent.persist(objeto);  //somente inclui 
        ent.merge(objeto); 
        ent.getTransaction().commit(); 
    } 
    public static List listar(String nomePesquisa) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNamedQuery(nomePesquisa); 
        List lista = q.getResultList(); 
        return lista; 
    } 
    public static List listar(String nomePesquisa,String parametro, int chave) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNamedQuery(nomePesquisa); 
        q.setParameter(parametro, chave); 
        List lista = q.getResultList(); 
        return lista; 
    } 
     public static List listar(String nomePesquisa,String parametro, String chave) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNamedQuery(nomePesquisa); 
        q.setParameter(parametro, chave); 
        List lista = q.getResultList(); 
        return lista; 
    } 
    public static List listar1Sql (String sql) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createQuery(sql); 
        List lista = q.getResultList(); 
        return lista; 
    } 
    public static int executarSql(String sql) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNativeQuery(sql); 
        ent.getTransaction().begin(); 
        int r = q.executeUpdate(); 
        ent.getTransaction().commit(); 
        return r; 
    } 
     public static void excluir (Object objeto) { 
        // Dara erro com toplink e com campos not null do objeto no update!!! 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        ent.getTransaction().begin(); 
        //ent.remove(ent.getReference(Pessoa.class, objeto.getCodigo())); 
        ent.remove(ent.merge(objeto)); // Erro com toplink e not null 
        ent.getTransaction().commit(); 
    } 
    public static void excluir (String pesquisa, String parametro, int chave) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        ent.getTransaction().begin(); 
        Query q = ent.createNamedQuery(pesquisa); 
        q.setParameter(parametro, chave); 
        Object objeto = q.getSingleResult(); 
        ent.remove(objeto); 
        ent.getTransaction().commit(); 
    }
    public static void excluir (String pesquisa, String parametro, String chave) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        ent.getTransaction().begin(); 
        Query q = ent.createNamedQuery(pesquisa); 
        q.setParameter(parametro, chave); 
        Object objeto = q.getSingleResult(); 
        ent.remove(objeto); 
        ent.getTransaction().commit(); 
    }
    public static Object consultar (String pesquisa, String parametro, int chave) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNamedQuery(pesquisa); 
        q.setParameter(parametro, chave); 
        Object objeto = q.getSingleResult(); 
        return objeto; 
    } 
    public static Object consultar (String pesquisa, String parametro, String chave) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNamedQuery(pesquisa); 
        q.setParameter(parametro, chave); 
        Object objeto = q.getSingleResult(); 
        return objeto; 
    }
    
    // Metodos que serão utilizados nas tabelas com chaves compostas
    public static Curso consultar (Curso objeto){
        EntityManager ent;
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager();
        objeto = ent.find(Curso.class, objeto.getCursoPK());
        return objeto;
    }
    
    public static Turma consultar (Turma objeto){
        EntityManager ent;
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager();
        objeto = ent.find(Turma.class, objeto.getTurmaPK());
        return objeto;
    }
    
    //  Método para consultas com 2 campos (integer/string) 
    public static List listar(String nomePesquisa, String parametro1, int chave1, String parametro2, String chave2) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNamedQuery(nomePesquisa); 
        q.setParameter(parametro1, chave1); 
        q.setParameter(parametro2, chave2); 
        List lista = q.getResultList(); 
        return lista; 
    }
    
    //  Método para consultas com 3 campos (integer/string/string) 
    public static List listar(String nomePesquisa, String parametro1, int chave1, String parametro2, String chave2, String parametro3, String chave3) { 
        EntityManager ent; 
        ent = Persistence.createEntityManagerFactory("UP").createEntityManager(); 
        Query q = ent.createNamedQuery(nomePesquisa); 
        q.setParameter(parametro1, chave1); 
        q.setParameter(parametro2, chave2); 
        q.setParameter(parametro3, chave3); 
        List lista = q.getResultList(); 
        return lista; 
    }
    
}
