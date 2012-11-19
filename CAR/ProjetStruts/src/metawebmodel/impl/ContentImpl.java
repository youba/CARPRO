/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.Content;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.tools.IVisiteur;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.ContentImpl#getHtmlText <em>Html Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContentImpl extends CDOObjectImpl implements Content {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.CONTENT;
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
	public String getHtmlText() {
		return (String)eGet(MetawebmodelPackage.Literals.CONTENT__HTML_TEXT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtmlText(String newHtmlText) {
		eSet(MetawebmodelPackage.Literals.CONTENT__HTML_TEXT, newHtmlText);
	}

	/**
	 * @generated NOT
	 */
	public String accepte(IVisiteur visiteur){
		return visiteur.visite(this);
	}
} //ContentImpl
