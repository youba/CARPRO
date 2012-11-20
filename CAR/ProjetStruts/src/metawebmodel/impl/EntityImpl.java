/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.impl;

import metawebmodel.Entity;
import metawebmodel.EntityAtribute;
import metawebmodel.MetawebmodelPackage;
import metawebmodel.tools.IVisiteurModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link metawebmodel.impl.EntityImpl#getAtributes <em>Atributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends DataTypeImpl implements Entity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetawebmodelPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EntityAtribute> getAtributes() {
		return (EList<EntityAtribute>)eGet(MetawebmodelPackage.Literals.ENTITY__ATRIBUTES, true);
	}

	@Override
	/**
	 * @generated NOT
	 */
	public void accepte(IVisiteurModel visiteur) {
		visiteur.visite(this);		
	}

	
} //EntityImpl
