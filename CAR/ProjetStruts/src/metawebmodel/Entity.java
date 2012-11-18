/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.Entity#getAtributes <em>Atributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends DataType {
	/**
	 * Returns the value of the '<em><b>Atributes</b></em>' containment reference list.
	 * The list contents are of type {@link metawebmodel.EntityAtribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atributes</em>' containment reference list.
	 * @see metawebmodel.MetawebmodelPackage#getEntity_Atributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<EntityAtribute> getAtributes();

} // Entity
