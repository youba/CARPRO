/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predifined Data Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.PredifinedDataTypes#getTypes <em>Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getPredifinedDataTypes()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface PredifinedDataTypes extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link metawebmodel.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see metawebmodel.MetawebmodelPackage#getPredifinedDataTypes_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getTypes();

} // PredifinedDataTypes
