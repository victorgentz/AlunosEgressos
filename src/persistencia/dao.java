/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.List; 
import javax.persistence.*;
import controles.Instituicao; 
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
}
