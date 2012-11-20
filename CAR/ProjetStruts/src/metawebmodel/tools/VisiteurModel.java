package metawebmodel.tools;

import java.io.File;

import metawebmodel.Entity;
import metawebmodel.Model;
/**
 * 
 * @author marcgregoire
 * @generated NOT
 */
public class VisiteurModel implements IVisiteurModel {

	@Override
	public void visite(Entity entite) {
		
	}
	
	public void visite(Model model){
		File src = new File(VisiteurWeb.nom_site+"/Java Resources: src");
		src.mkdir();
		File domain = new File(VisiteurWeb.nom_site+"/Java Resources: src/org.lip6.struts.domain");
		domain.mkdir();
		System.out.println("Model généré");
	}

}
