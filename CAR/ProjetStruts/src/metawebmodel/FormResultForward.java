/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Result Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.FormResultForward#getMessage <em>Message</em>}</li>
 *   <li>{@link metawebmodel.FormResultForward#getForwardedPage <em>Forwarded Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getFormResultForward()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface FormResultForward extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see metawebmodel.MetawebmodelPackage#getFormResultForward_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link metawebmodel.FormResultForward#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Forwarded Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwarded Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwarded Page</em>' reference.
	 * @see #setForwardedPage(Page)
	 * @see metawebmodel.MetawebmodelPackage#getFormResultForward_ForwardedPage()
	 * @model required="true"
	 * @generated
	 */
	Page getForwardedPage();

	/**
	 * Sets the value of the '{@link metawebmodel.FormResultForward#getForwardedPage <em>Forwarded Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forwarded Page</em>' reference.
	 * @see #getForwardedPage()
	 * @generated
	 */
	void setForwardedPage(Page value);

} // FormResultForward
