/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.MetawebmodelPackage;
import metawebmodel.Model;
import metawebmodel.View;
import metawebmodel.WebSite;
import metawebmodel.tools.IVisiteur;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.WebSiteImpl#getModels <em>Models</em>}</li>
 *   <li>{@link metawebmodel.impl.WebSiteImpl#getVues <em>Vues</em>}</li>
 *   <li>{@link metawebmodel.impl.WebSiteImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebSiteImpl extends CDOObjectImpl implements WebSite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebSiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.WEB_SITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Model> getModels() {
		return (EList<Model>)eGet(MetawebmodelPackage.Literals.WEB_SITE__MODELS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<View> getVues() {
		return (EList<View>)eGet(MetawebmodelPackage.Literals.WEB_SITE__VUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(MetawebmodelPackage.Literals.WEB_SITE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetawebmodelPackage.Literals.WEB_SITE__NAME, newName);
	}

	/**@generated NOT
	**/
	public void accept(IVisiteur visiteur){
		visiteur.visite(this);
	}
	
} //WebSiteImpl
