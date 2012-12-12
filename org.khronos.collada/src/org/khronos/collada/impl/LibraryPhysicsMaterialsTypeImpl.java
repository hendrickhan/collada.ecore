/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.khronos.collada.AssetType;
import org.khronos.collada.ColladaPackage;
import org.khronos.collada.ExtraType;
import org.khronos.collada.LibraryPhysicsMaterialsType;
import org.khronos.collada.PhysicsMaterialType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Physics Materials Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.khronos.collada.impl.LibraryPhysicsMaterialsTypeImpl#getAsset <em>Asset</em>}</li>
 *   <li>{@link org.khronos.collada.impl.LibraryPhysicsMaterialsTypeImpl#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.impl.LibraryPhysicsMaterialsTypeImpl#getExtra <em>Extra</em>}</li>
 *   <li>{@link org.khronos.collada.impl.LibraryPhysicsMaterialsTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.khronos.collada.impl.LibraryPhysicsMaterialsTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryPhysicsMaterialsTypeImpl extends EObjectImpl implements LibraryPhysicsMaterialsType {
	/**
   * The cached value of the '{@link #getAsset() <em>Asset</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAsset()
   * @generated
   * @ordered
   */
	protected AssetType asset;

	/**
   * The cached value of the '{@link #getPhysicsMaterial() <em>Physics Material</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPhysicsMaterial()
   * @generated
   * @ordered
   */
	protected EList<PhysicsMaterialType> physicsMaterial;

	/**
   * The cached value of the '{@link #getExtra() <em>Extra</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExtra()
   * @generated
   * @ordered
   */
	protected EList<ExtraType> extra;

	/**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected static final String ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
	protected String id = ID_EDEFAULT;

	/**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected static final String NAME_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
	protected String name = NAME_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LibraryPhysicsMaterialsTypeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return ColladaPackage.eINSTANCE.getLibraryPhysicsMaterialsType();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AssetType getAsset() {
    return asset;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NotificationChain basicSetAsset(AssetType newAsset, NotificationChain msgs) {
    AssetType oldAsset = asset;
    asset = newAsset;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET, oldAsset, newAsset);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setAsset(AssetType newAsset) {
    if (newAsset != asset)
    {
      NotificationChain msgs = null;
      if (asset != null)
        msgs = ((InternalEObject)asset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET, null, msgs);
      if (newAsset != null)
        msgs = ((InternalEObject)newAsset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET, null, msgs);
      msgs = basicSetAsset(newAsset, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET, newAsset, newAsset));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<PhysicsMaterialType> getPhysicsMaterial() {
    if (physicsMaterial == null)
    {
      physicsMaterial = new EObjectContainmentEList<PhysicsMaterialType>(PhysicsMaterialType.class, this, ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__PHYSICS_MATERIAL);
    }
    return physicsMaterial;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<ExtraType> getExtra() {
    if (extra == null)
    {
      extra = new EObjectContainmentEList<ExtraType>(ExtraType.class, this, ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__EXTRA);
    }
    return extra;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getId() {
    return id;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setId(String newId) {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ID, oldId, id));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setName(String newName) {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__NAME, oldName, name));
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
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET:
        return basicSetAsset(null, msgs);
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__PHYSICS_MATERIAL:
        return ((InternalEList<?>)getPhysicsMaterial()).basicRemove(otherEnd, msgs);
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__EXTRA:
        return ((InternalEList<?>)getExtra()).basicRemove(otherEnd, msgs);
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
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET:
        return getAsset();
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__PHYSICS_MATERIAL:
        return getPhysicsMaterial();
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__EXTRA:
        return getExtra();
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ID:
        return getId();
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET:
        setAsset((AssetType)newValue);
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__PHYSICS_MATERIAL:
        getPhysicsMaterial().clear();
        getPhysicsMaterial().addAll((Collection<? extends PhysicsMaterialType>)newValue);
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__EXTRA:
        getExtra().clear();
        getExtra().addAll((Collection<? extends ExtraType>)newValue);
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ID:
        setId((String)newValue);
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__NAME:
        setName((String)newValue);
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
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET:
        setAsset((AssetType)null);
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__PHYSICS_MATERIAL:
        getPhysicsMaterial().clear();
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__EXTRA:
        getExtra().clear();
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ID:
        setId(ID_EDEFAULT);
        return;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__NAME:
        setName(NAME_EDEFAULT);
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
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ASSET:
        return asset != null;
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__PHYSICS_MATERIAL:
        return physicsMaterial != null && !physicsMaterial.isEmpty();
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__EXTRA:
        return extra != null && !extra.isEmpty();
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case ColladaPackage.LIBRARY_PHYSICS_MATERIALS_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (id: ");
    result.append(id);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //LibraryPhysicsMaterialsTypeImpl