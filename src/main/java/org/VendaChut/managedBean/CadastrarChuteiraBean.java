/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.VendaChut.managedBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.VendaChut.dao.ChuteiraDAO;
import org.VendaChut.modelo.Chuteira;

/**
 *
 * @author trabalho
 */
@Named(value = "cadastrarChuteira")
@RequestScoped
public class CadastrarChuteiraBean {
    Chuteira chuteira = new Chuteira();
    
    @Inject
    ChuteiraDAO chuteiraDAO;
    
     public void adicionar() {
         chuteiraDAO.salvar(chuteira);
}
     public Chuteira getChuteira() {
         return chuteira;
     }
}