package metawebmodel.tools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		if(!entite.getClass().getSimpleName().contains("DataType")){
			EntitiesGenerator classejava = new EntitiesGenerator();
			FileWriter output; BufferedWriter writer;
			System.out.println("Creation de la classe metier"); try {
				output = new FileWriter(VisiteurWeb.nom_site+"/Java Resources: src/org.lip6.struts.domain/"+entite.getNom()+".java"); 
				writer = new BufferedWriter(output);
				writer.write(classejava.generate(entite));
				writer.close(); } catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public void visite(Model model){
		File src = new File(VisiteurWeb.nom_site+"/Java Resources: src");
		src.mkdir();
		File domain = new File(VisiteurWeb.nom_site+"/Java Resources: src/org.lip6.struts.domain");
		domain.mkdir();
				
		System.out.println("Model généré");
		for(int i=0;i<model.getEntities().size();i++){
			model.getEntities().get(i).accepte(this);
		}
	}

}
