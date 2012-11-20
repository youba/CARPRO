/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.Field;
import metawebmodel.Input;
import metawebmodel.Label;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.tools.IVisiteur;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.FieldImpl#getInput <em>Input</em>}</li>
 *   <li>{@link metawebmodel.impl.FieldImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FieldImpl extends CDOObjectImpl implements Field {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.FIELD;
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
	public Input getInput() {
		return (Input)eGet(MetawebmodelPackage.Literals.FIELD__INPUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(Input newInput) {
		eSet(MetawebmodelPackage.Literals.FIELD__INPUT, newInput);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getLabel() {
		return (Label)eGet(MetawebmodelPackage.Literals.FIELD__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(Label newLabel) {
		eSet(MetawebmodelPackage.Literals.FIELD__LABEL, newLabel);
	}

	public String accepte(IVisiteur visiteur){
		return visiteur.visite(this);
	}
} //FieldImpl
