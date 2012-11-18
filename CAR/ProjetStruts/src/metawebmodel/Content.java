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
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link metawebmodel.Content#getHtmlText <em>Html Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see metawebmodel.MetawebmodelPackage#getContent()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Content extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Html Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Html Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Html Text</em>' attribute.
	 * @see #setHtmlText(String)
	 * @see metawebmodel.MetawebmodelPackage#getContent_HtmlText()
	 * @model
	 * @generated
	 */
	String getHtmlText();

	/**
	 * Sets the value of the '{@link metawebmodel.Content#getHtmlText <em>Html Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Html Text</em>' attribute.
	 * @see #getHtmlText()
	 * @generated
	 */
	void setHtmlText(String value);

} // Content
