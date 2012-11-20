/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.Input;
import metawebmodel.InputType;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.tools.IVisiteur;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.InputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link metawebmodel.impl.InputImpl#getInputType <em>Input Type</em>}</li>
 *   <li>{@link metawebmodel.impl.InputImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputImpl extends CDOObjectImpl implements Input {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.INPUT;
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
	public String getValue() {
		return (String)eGet(MetawebmodelPackage.Literals.INPUT__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(MetawebmodelPackage.Literals.INPUT__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType getInputType() {
		return (InputType)eGet(MetawebmodelPackage.Literals.INPUT__INPUT_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputType(InputType newInputType) {
		eSet(MetawebmodelPackage.Literals.INPUT__INPUT_TYPE, newInputType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(MetawebmodelPackage.Literals.INPUT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MetawebmodelPackage.Literals.INPUT__NAME, newName);
	}

	@Override
	/**
	 * @generated NOT
	 */
	public String accepte(IVisiteur visiteur) {
		return visiteur.visite(this);
	}

} //InputImpl
