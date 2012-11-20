/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel;

import metawebmodel.tools.IVisiteur;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.Label#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getLabel()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Label extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see metawebmodel.MetawebmodelPackage#getLabel_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link metawebmodel.Label#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * 
	 * @param visiteur
	 * @return
	 * @generated NOT
	 */
	public String accepte(IVisiteur visiteur);
	
} // Label
