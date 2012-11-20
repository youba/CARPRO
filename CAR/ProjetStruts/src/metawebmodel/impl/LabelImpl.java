/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.Label;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.tools.IVisiteur;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.LabelImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends CDOObjectImpl implements Label {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.LABEL;
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
		return (String)eGet(MetawebmodelPackage.Literals.LABEL__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		eSet(MetawebmodelPackage.Literals.LABEL__VALUE, newValue);
	}

	@Override
	/**
	 * @generated NOT
	 */
	public String accepte(IVisiteur visiteur) {
		return visiteur.visite(this);
	}

} //LabelImpl
