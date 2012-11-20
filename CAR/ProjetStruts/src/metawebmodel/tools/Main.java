package metawebmodel.tools;

import java.io.File;

import metawebmodel.WebSite;
import metawebmodel.impl.WebSiteImpl;
/**
 * 
 * @author marcgregoire
 * @generated NOT
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebSiteSerializer serializerWeb = new WebSiteSerializer();
		File instanceWeb = new File("model/Website.xmi");
		WebSiteImpl website = (WebSiteImpl) serializerWeb.load(instanceWeb);
		VisiteurWeb visiteur  = new VisiteurWeb();
		visiteur.nom_site= website.getName();
		website.accept(visiteur);
	}

}

