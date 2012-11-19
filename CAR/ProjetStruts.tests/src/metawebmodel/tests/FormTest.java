/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package metawebmodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import metawebmodel.Form;
import metawebmodel.MetawebmodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormTest extends TestCase {

	/**
	 * The fixture for this Form test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Form fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FormTest.class);
	}

	/**
	 * Constructs a new Form test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Form test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Form fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Form test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Form getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetawebmodelFactory.eINSTANCE.createForm());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FormTest
