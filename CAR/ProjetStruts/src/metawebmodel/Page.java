/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel;

import metawebmodel.tools.IVisiteur;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.Page#getHtmlContent <em>Html Content</em>}</li>
 *   <li>{@link metawebmodel.Page#getHead <em>Head</em>}</li>
 *   <li>{@link metawebmodel.Page#getCss <em>Css</em>}</li>
 *   <li>{@link metawebmodel.Page#getName <em>Name</em>}</li>
 *   <li>{@link metawebmodel.Page#getFormulaire <em>Formulaire</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getPage()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Page extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Html Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Content</em>' containment reference.
	 * @see #setHtmlContent(Content)
	 * @see metawebmodel.MetawebmodelPackage#getPage_HtmlContent()
	 * @model containment="true"
	 * @generated
	 */
	Content getHtmlContent();

	/**
	 * Sets the value of the '{@link metawebmodel.Page#getHtmlContent <em>Html Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Content</em>' containment reference.
	 * @see #getHtmlContent()
	 * @generated
	 */
	void setHtmlContent(Content value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' attribute.
	 * @see #setHead(String)
	 * @see metawebmodel.MetawebmodelPackage#getPage_Head()
	 * @model
	 * @generated
	 */
	String getHead();

	/**
	 * Sets the value of the '{@link metawebmodel.Page#getHead <em>Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' attribute.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(String value);

	/**
	 * Returns the value of the '<em><b>Css</b></em>' reference list.
	 * The list contents are of type {@link metawebmodel.CSS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Css</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Css</em>' reference list.
	 * @see metawebmodel.MetawebmodelPackage#getPage_Css()
	 * @model
	 * @generated
	 */
	EList<CSS> getCss();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see metawebmodel.MetawebmodelPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metawebmodel.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Formulaire</b></em>' containment reference list.
	 * The list contents are of type {@link metawebmodel.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formulaire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulaire</em>' containment reference list.
	 * @see metawebmodel.MetawebmodelPackage#getPage_Formulaire()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getFormulaire();
	
	/**
	 * 
	 * @param visiteur
	 * @generated NOT
	 */
	public void accepte(IVisiteur visiteur);

} // Page
