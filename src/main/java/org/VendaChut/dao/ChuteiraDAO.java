/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.VendaChut.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.VendaChut.modelo.Chuteira;

/**
 *
 * @author trabalho
 */
public class ChuteiraDAO {
    @PersistenceContext
     private EntityManager em;
 
    /**
     *
     * @param chuteira
     */
    @Transactional
      public void salvar(Chuteira chuteira) {
         em.persist(chuteira);
     }
    
 
    public List<Chuteira> buscarTodos() {
        TypedQuery<Chuteira> query = em.
                createQuery("select c from Chuteira c", Chuteira.class);
        return query.getResultList();
    }

}
