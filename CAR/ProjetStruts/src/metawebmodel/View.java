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
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.View#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getView()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface View extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link metawebmodel.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see metawebmodel.MetawebmodelPackage#getView_Pages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getPages();

	/**
	 * 
	 * @param v
	 * @generated NOT
	 */
	public void accept(IVisiteur v);
	
} // View
