package metawebmodel.tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import metawebmodel.Content;
import metawebmodel.Form;
import metawebmodel.Page;
import metawebmodel.View;
import metawebmodel.WebSite;
/**
 * 
 * @author marcgregoire
 * @generated NOT
 */
public class VisiteurWeb implements IVisiteur {

	private String nom_site="";
	@Override
	public void visite(WebSite w) {
		//Generer les package de vue
		File racine = new File(w.getName());
		racine.mkdir();
		this.nom_site=w.getName();
		for(int i=0; i<w.getVues().size();i++){
			w.getVues().get(i).accept(this);
		}
	}

	@Override
	public void visite(View vue) {
		File pages = new File(nom_site+"/pages");
		pages.mkdir();
		for(int i =0; i<vue.getPages().size();i++){
			vue.getPages().get(i).accepte(this);
		}
	}

	@Override
	public void visite(Page page) {
		String beforeHeader = "<%@ page language=\"java\" contentType=\"text/html; charset=ISO-8859-1\" pageEncoding=\"ISO-8859-1\"%>\n" +
				"<%@ taglib prefix=\"html\" uri=\"http://struts.apache.org/tags-html\" %>\n" +
				"<%@ taglib prefix=\"bean\" uri=\"http://struts.apache.org/tags-bean\" %>\n" +
				"<%@ taglib prefix=\"logic\" uri=\"http://struts.apache.org/tags-logic\" %>\n" +
				"<%@ taglib prefix=\"nested\" uri=\"http://struts.apache.org/tags-nested\" %>\n";
		
		String headerGenerer = page.getHead();
		if(page.getHead()==null)headerGenerer="";
		String header = "\n<html:html>\n"+
							"<head>\n<title><bean:message key=\""+page.getName()+"\"/></title>\n"+
							headerGenerer+"\n"+
							"</head>";
		
		String formulaireHTML ="";
		if(page.getFormulaire()!=null){
			for(int i=0;i<page.getFormulaire().size();i++){
				formulaireHTML = "\n"+page.getFormulaire().get(i).accepte(this)+"\n";
			}
		}
		String contenuPage = "\n<body>\n"+page.getHtmlContent().accepte(this)+formulaireHTML+"\n</body>\n";
		
		String footer = "\n</html:html>\n";
		String contenuComplet = beforeHeader+header+contenuPage+footer;
		
		//Ecriture dans le fichier jsp
		PrintWriter ecri=null ;
			try {
				ecri = new PrintWriter(new FileWriter(nom_site+"/pages/"+page.getName()+".jsp"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ecri.print(contenuComplet);
			ecri.flush();
			ecri.close();
	}

	@Override
	public String visite(Form formulaire) {
		return "<form></form>";
	}
	
	public String visite(Content contenu){
		return contenu.getHtmlText();
	}
	
	


}
