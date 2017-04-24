/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.VendaChut.managedBean;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.VendaChut.dao.ChuteiraDAO;
import org.VendaChut.modelo.Chuteira;

/**
 *
 * @author trabalho
 */
@Named(value = "mbListarProdutos")
@RequestScoped
public class ListarChuteira {

    
    @Inject
    private ChuteiraDAO dao;
    private List<Chuteira> chuteiras;

    @PostConstruct
    private void init(){
        this.chuteiras = dao.buscarTodos();
   }
    
    /**
     *
     * @return chuteiras
     */
    public List<Chuteira> getChuteiras() {
        return chuteiras;
    }
    
    

}
