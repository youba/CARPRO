package metawebmodel.tools;

import metawebmodel.Content;
import metawebmodel.Field;
import metawebmodel.Form;
import metawebmodel.Input;
import metawebmodel.Label;
import metawebmodel.Page;
import metawebmodel.View;
import metawebmodel.WebSite;
/**
 * 
 * @author marcgregoire
 * @generated NOT
 */
public interface IVisiteur {

	public void visite(WebSite w);
	public void visite(View vue);
	public void visite(Page page);
	public String visite (Form formulaire);
	public String visite (Content contenu);
	public String visite(Field champs);
	public String visite(Input entree);
	public String visite(Label label);
}
