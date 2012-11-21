package metawebmodel.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import metawebmodel.Content;
import metawebmodel.Field;
import metawebmodel.Form;
import metawebmodel.Input;
import metawebmodel.InputType;
import metawebmodel.Label;
import metawebmodel.Page;
import metawebmodel.View;
import metawebmodel.WebSite;
/**
 * 
 * @author marcgregoire
 * @generated NOT
 */
public class VisiteurWeb implements IVisiteur {

	public static String nom_site;
	
	@Override
	public void visite(WebSite w) {
		//Generer les package de vue
		File racine = new File(nom_site);
		racine.mkdir();
		File webContent = new File(nom_site+"/WebContent");
		webContent.mkdir();
		for(int i=0; i<w.getVues().size();i++){
			w.getVues().get(i).accept(this);
		}
		System.out.println("Vues generees");
	}

	@Override
	public void visite(View vue) {
		File pages = new File(nom_site+"/WebContent/pages");
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
				ecri = new PrintWriter(new FileWriter(nom_site+"/WebContent/pages/"+page.getName()+".jsp"));
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
		
		// ajouter la creation des verificateur de formulaire ici
		String retour = "\n<html:form action = \""+formulaire.getAction().getName()+"\">\n";
		//Creation du validateur
		ActionFormGenerator classejava = new ActionFormGenerator();
		FileWriter output; BufferedWriter writer;
		System.out.println("Creation de la classe metier"); 
		//formulaire.getFields().get(0).getInput().getInputType().getName()
		try {
			output = new FileWriter(VisiteurWeb.nom_site+"/Java Resources: src/org.lip6.struts.actionForm/"+formulaire.getAction().getName()+"ValidationForm.java"); 
			writer = new BufferedWriter(output);
			writer.write(classejava.generate(formulaire));
			writer.close(); } catch (IOException e) {
				e.printStackTrace();
			}
		for(int i = 0; i<formulaire.getFields().size();i++)
		{
			retour=retour+formulaire.getFields().get(i).accepte(this)+"\n";
		}
		retour = retour + "\n</html:form>\n";
		return retour;
	}
	
	public String visite(Content contenu){
		return contenu.getHtmlText();
	}
	
	public String visite (Field champs){
		String champsLabel="";
		if(champs.getLabel()!=null)
			champsLabel=champs.getLabel().accepte(this);
		String rendu = champsLabel+champs.getInput().accepte(this);
		
		return rendu;
	}

	@Override
	public String visite(Input entree) {
		InputType atester = entree.getInputType();
		if(atester.equals(InputType.TEXT_AREA))
			return "<html:textarea property=\""+ entree.getName()+"\" size=\" \" maxlength=\" \" />";
		else if(atester.equals(InputType.TEXT))
			return "<html:text property=\""+ entree.getName()+"\" size=\" \" maxlength=\" \" />";
		else if(atester.equals(InputType.CHECK_BOX))
			return "<html:checkbox name=\""+entree.getName()+"\" value =\""+entree.getValue()+"\"/>";
		else if(atester.equals(InputType.PASSWORD))
			return "<html:password  name=\""+entree.getName()+"\" value =\""+entree.getValue()+"\"/>";
		else if(atester.equals(InputType.RADIO_BUTTON))
			return "<html:radio  name=\""+entree.getName()+"\" value =\""+entree.getValue()+"\"/>";
		else if(atester.equals(InputType.RESET))
			return "<html:reset  name=\""+entree.getName()+"\" value =\""+entree.getValue()+"\"/>";
		else if(atester.equals(InputType.OPTION))
			return "<html:option  name=\""+entree.getName()+"\" value =\""+entree.getValue()+"\"/>";
		else if(atester.equals(InputType.SUBMIT))
			return "<html:submit>"+ entree.getName()+"</html:submit>";
		return "";
		
	}

	@Override
	public String visite(Label label) {
		
		return label.getValue()+":";
	}
	
	


}
