package br.com.curso.jsf.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class MeuBean {
	
	private HtmlInputText componenteEntrada;
	private String valorDado;
	private HtmlOutputText componenteSaida;
	private String valorSaida;
	
	public MeuBean() {
		log("construido");
	}
	
	public void valorAlterado(ValueChangeEvent event) {
		log(event.getOldValue() + " para " +event.getNewValue());
	}
	
	public void acao() {
		valorSaida = valorDado;
		log("sucesso");
	}
	
	public HtmlInputText getComponenteEntrada() {
		log(componenteEntrada);
		return componenteEntrada;
	}
	
	public void setComponenteEntrada(HtmlInputText componenteEntrada) {
		log(componenteEntrada);
		this.componenteEntrada = componenteEntrada;
	}
	
	public String getValorDado() {
		log(valorDado);
		return valorDado;
	}
	
	public void setValorDado(String valorDado) {
		log(valorDado);
		this.valorDado = valorDado;
	}
	
	public HtmlOutputText getComponenteSaida() {
		log(componenteSaida);
		return componenteSaida;
	}
	
	public void setComponenteSaida(HtmlOutputText componenteSaida) {
		log(componenteSaida);
		this.componenteSaida = componenteSaida;
	}
	
	public String getValorSaida() {
		log(valorSaida);
		return valorSaida;
	}
	
	private void log(Object object) {
		String nomeMetodo = Thread.currentThread().getStackTrace()[2].getMethodName();
		System.out.println("MeuBean " +nomeMetodo + ": " +object);
	}

}
