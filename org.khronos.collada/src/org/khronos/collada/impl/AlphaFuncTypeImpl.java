/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.khronos.collada.AlphaFuncType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.FuncType2;
import org.khronos.collada.FuncType1;
import org.khronos.collada.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alpha Func Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.AlphaFuncTypeImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link org.khronos.collada.impl.AlphaFuncTypeImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlphaFuncTypeImpl extends EObjectImpl implements AlphaFuncType {
	/**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
	protected FuncType1 func;

	/**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
	protected ValueType value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AlphaFuncTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getAlphaFuncType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FuncType1 getFunc() {
    return func;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetFunc(FuncType1 newFunc, NotificationChain msgs) {
    FuncType1 oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ALPHA_FUNC_TYPE__FUNC, oldFunc, newFunc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setFunc(FuncType1 newFunc) {
    if (newFunc != func)
    {
      NotificationChain msgs = null;
      if (func != null)
        msgs = ((InternalEObject)func).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ALPHA_FUNC_TYPE__FUNC, null, msgs);
      if (newFunc != null)
        msgs = ((InternalEObject)newFunc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ALPHA_FUNC_TYPE__FUNC, null, msgs);
      msgs = basicSetFunc(newFunc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ALPHA_FUNC_TYPE__FUNC, newFunc, newFunc));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ValueType getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetValue(ValueType newValue, NotificationChain msgs) {
    ValueType oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.ALPHA_FUNC_TYPE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setValue(ValueType newValue) {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ALPHA_FUNC_TYPE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.ALPHA_FUNC_TYPE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.ALPHA_FUNC_TYPE__VALUE, newValue, newValue));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case ColladaPackage.ALPHA_FUNC_TYPE__FUNC:
        return basicSetFunc(null, msgs);
      case ColladaPackage.ALPHA_FUNC_TYPE__VALUE:
        return basicSetValue(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case ColladaPackage.ALPHA_FUNC_TYPE__FUNC:
        return getFunc();
      case ColladaPackage.ALPHA_FUNC_TYPE__VALUE:
        return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.ALPHA_FUNC_TYPE__FUNC:
        setFunc((FuncType1)newValue);
        return;
      case ColladaPackage.ALPHA_FUNC_TYPE__VALUE:
        setValue((ValueType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case ColladaPackage.ALPHA_FUNC_TYPE__FUNC:
        setFunc((FuncType1)null);
        return;
      case ColladaPackage.ALPHA_FUNC_TYPE__VALUE:
        setValue((ValueType)null);
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case ColladaPackage.ALPHA_FUNC_TYPE__FUNC:
        return func != null;
      case ColladaPackage.ALPHA_FUNC_TYPE__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //AlphaFuncTypeImpl