package metawebmodel.tools;

import metawebmodel.Form;
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
}
