package br.com.curso.jsf.conversor;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("meuConversor")
public class MeuConversor implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		System.out.println("MeuConversor getAsObject " +value);
		return value;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		System.out.println("MeuConversor getAsString " +value);
		return (String) value;
	}

}
