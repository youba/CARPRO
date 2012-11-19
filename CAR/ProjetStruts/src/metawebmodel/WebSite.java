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
 * A representation of the model object '<em><b>Web Site</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.WebSite#getModels <em>Models</em>}</li>
 *   <li>{@link metawebmodel.WebSite#getVues <em>Vues</em>}</li>
 *   <li>{@link metawebmodel.WebSite#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getWebSite()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface WebSite extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Models</b></em>' containment reference list.
	 * The list contents are of type {@link metawebmodel.Model}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Models</em>' containment reference list.
	 * @see metawebmodel.MetawebmodelPackage#getWebSite_Models()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Model> getModels();

	/**
	 * Returns the value of the '<em><b>Vues</b></em>' containment reference list.
	 * The list contents are of type {@link metawebmodel.View}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vues</em>' containment reference list.
	 * @see metawebmodel.MetawebmodelPackage#getWebSite_Vues()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<View> getVues();

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
	 * @see metawebmodel.MetawebmodelPackage#getWebSite_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metawebmodel.WebSite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * 
	 * @param v
	 * @generated NOT
	 */
	public void accept(IVisiteur v);
} // WebSite
