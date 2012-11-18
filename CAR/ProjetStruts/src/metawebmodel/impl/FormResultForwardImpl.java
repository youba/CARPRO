/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.FormResultForward;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.Page;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Result Forward</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.FormResultForwardImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link metawebmodel.impl.FormResultForwardImpl#getForwardedPage <em>Forwarded Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormResultForwardImpl extends CDOObjectImpl implements FormResultForward {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormResultForwardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.FORM_RESULT_FORWARD;
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
	public String getMessage() {
		return (String)eGet(MetawebmodelPackage.Literals.FORM_RESULT_FORWARD__MESSAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		eSet(MetawebmodelPackage.Literals.FORM_RESULT_FORWARD__MESSAGE, newMessage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getForwardedPage() {
		return (Page)eGet(MetawebmodelPackage.Literals.FORM_RESULT_FORWARD__FORWARDED_PAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardedPage(Page newForwardedPage) {
		eSet(MetawebmodelPackage.Literals.FORM_RESULT_FORWARD__FORWARDED_PAGE, newForwardedPage);
	}

} //FormResultForwardImpl
