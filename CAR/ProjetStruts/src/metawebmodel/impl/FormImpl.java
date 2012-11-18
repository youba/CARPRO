/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.Action;
import metawebmodel.Field;
import metawebmodel.Form;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.Method;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.FormImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link metawebmodel.impl.FormImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link metawebmodel.impl.FormImpl#getAction <em>Action</em>}</li>
 *   <li>{@link metawebmodel.impl.FormImpl#getActionto <em>Actionto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormImpl extends CDOObjectImpl implements Form {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.FORM;
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
	@SuppressWarnings("unchecked")
	public EList<Field> getFields() {
		return (EList<Field>)eGet(MetawebmodelPackage.Literals.FORM__FIELDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMethod() {
		return (Method)eGet(MetawebmodelPackage.Literals.FORM__METHOD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Method newMethod) {
		eSet(MetawebmodelPackage.Literals.FORM__METHOD, newMethod);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return (Action)eGet(MetawebmodelPackage.Literals.FORM__ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		eSet(MetawebmodelPackage.Literals.FORM__ACTION, newAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getActionto() {
		return (Action)eGet(MetawebmodelPackage.Literals.FORM__ACTIONTO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionto(Action newActionto) {
		eSet(MetawebmodelPackage.Literals.FORM__ACTIONTO, newActionto);
	}

} //FormImpl
