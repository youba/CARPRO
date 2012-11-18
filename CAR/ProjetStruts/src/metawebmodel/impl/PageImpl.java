/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.CSS;
import metawebmodel.Content;
import metawebmodel.Form;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.Page;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.PageImpl#getHtmlContent <em>Html Content</em>}</li>
 *   <li>{@link metawebmodel.impl.PageImpl#getHead <em>Head</em>}</li>
 *   <li>{@link metawebmodel.impl.PageImpl#getCss <em>Css</em>}</li>
 *   <li>{@link metawebmodel.impl.PageImpl#getName <em>Name</em>}</li>
 *   <li>{@link metawebmodel.impl.PageImpl#getFormulaire <em>Formulaire</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageImpl extends CDOObjectImpl implements Page {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.PAGE;
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
	public Content getHtmlContent() {
		return (Content)eGet(MetawebmodelPackage.Literals.PAGE__HTML_CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHtmlContent(Content newHtmlContent) {
		eSet(MetawebmodelPackage.Literals.PAGE__HTML_CONTENT, newHtmlContent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHead() {
		return (String)eGet(MetawebmodelPackage.Literals.PAGE__HEAD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(String newHead) {
		eSet(MetawebmodelPackage.Literals.PAGE__HEAD, newHead);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CSS> getCss() {
		return (EList<CSS>)eGet(MetawebmodelPackage.Literals.PAGE__CSS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(MetawebmodelPackage.Literals.PAGE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetawebmodelPackage.Literals.PAGE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Form> getFormulaire() {
		return (EList<Form>)eGet(MetawebmodelPackage.Literals.PAGE__FORMULAIRE, true);
	}

} //PageImpl
