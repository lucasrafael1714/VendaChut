/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.VendaChut.managedBean;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.VendaChut.modelo.Cliente;

/**
 *
 * @author lucas
 */
@Named
@RequestScoped
public class loginbean {

	@Inject
	private Cliente cliente;
	
	private String nomeCliente;
	private String senha;

	public String login() {
		FacesContext context = FacesContext.getCurrentInstance();
		
		if ("admin".equals(this.nomeCliente) && "12345".equals(this.senha)) {
			this.cliente.setNome(this.nomeCliente);
			this.cliente.setDataLogin(new Date());
			
			return "/index?faces-redirect=true";
		} else {
			FacesMessage mensagem = new FacesMessage("Cliente/senha inválidos!");
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			context.addMessage(null, mensagem);
		}
		
		return null;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/Login?faces-redirect=true";
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

