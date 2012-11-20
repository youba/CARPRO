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
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.Input#getValue <em>Value</em>}</li>
 *   <li>{@link metawebmodel.Input#getInputType <em>Input Type</em>}</li>
 *   <li>{@link metawebmodel.Input#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getInput()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Input extends CDOObject {
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
	 * @see metawebmodel.MetawebmodelPackage#getInput_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link metawebmodel.Input#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Input Type</b></em>' attribute.
	 * The literals are from the enumeration {@link metawebmodel.InputType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Type</em>' attribute.
	 * @see metawebmodel.InputType
	 * @see #setInputType(InputType)
	 * @see metawebmodel.MetawebmodelPackage#getInput_InputType()
	 * @model
	 * @generated
	 */
	InputType getInputType();

	/**
	 * Sets the value of the '{@link metawebmodel.Input#getInputType <em>Input Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Type</em>' attribute.
	 * @see metawebmodel.InputType
	 * @see #getInputType()
	 * @generated
	 */
	void setInputType(InputType value);

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
	 * @see metawebmodel.MetawebmodelPackage#getInput_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link metawebmodel.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	
	/**
	 * @generated NOT
	 */
	public String accepte(IVisiteur visiteur );

} // Input
