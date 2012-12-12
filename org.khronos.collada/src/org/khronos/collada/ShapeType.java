/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.ShapeType#getHollow <em>Hollow</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getMass <em>Mass</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getDensity <em>Density</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getInstancePhysicsMaterial <em>Instance Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getPhysicsMaterial <em>Physics Material</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getInstanceGeometry <em>Instance Geometry</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getPlane <em>Plane</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getBox <em>Box</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getSphere <em>Sphere</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getCylinder <em>Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getTaperedCylinder <em>Tapered Cylinder</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getCapsule <em>Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getTaperedCapsule <em>Tapered Capsule</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getTranslate <em>Translate</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.khronos.collada.ShapeType#getExtra <em>Extra</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getShapeType()
 * @model extendedMetaData="name='shape_._type' kind='elementOnly'"
 * @generated
 */
public interface ShapeType extends EObject {
	/**
   * Returns the value of the '<em><b>Hollow</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hollow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Hollow</em>' containment reference.
   * @see #setHollow(HollowType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Hollow()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='hollow' namespace='##targetNamespace'"
   * @generated
   */
	HollowType getHollow();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getHollow <em>Hollow</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hollow</em>' containment reference.
   * @see #getHollow()
   * @generated
   */
	void setHollow(HollowType value);

	/**
   * Returns the value of the '<em><b>Mass</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mass</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Mass</em>' containment reference.
   * @see #setMass(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Mass()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='mass' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getMass();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getMass <em>Mass</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mass</em>' containment reference.
   * @see #getMass()
   * @generated
   */
	void setMass(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Density</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Density</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Density</em>' containment reference.
   * @see #setDensity(TargetableFloat)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Density()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='density' namespace='##targetNamespace'"
   * @generated
   */
	TargetableFloat getDensity();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getDensity <em>Density</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Density</em>' containment reference.
   * @see #getDensity()
   * @generated
   */
	void setDensity(TargetableFloat value);

	/**
   * Returns the value of the '<em><b>Instance Physics Material</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_physics_material element declares the instantiation of a COLLADA physics_material 
   * 			resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Physics Material</em>' containment reference.
   * @see #setInstancePhysicsMaterial(InstanceWithExtra)
   * @see org.khronos.collada.ColladaPackage#getShapeType_InstancePhysicsMaterial()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_physics_material' namespace='##targetNamespace'"
   * @generated
   */
	InstanceWithExtra getInstancePhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getInstancePhysicsMaterial <em>Instance Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Physics Material</em>' containment reference.
   * @see #getInstancePhysicsMaterial()
   * @generated
   */
	void setInstancePhysicsMaterial(InstanceWithExtra value);

	/**
   * Returns the value of the '<em><b>Physics Material</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			This element defines the physical properties of an object. It contains a technique/profile with 
   * 			parameters. The COMMON profile defines the built-in names, such as static_friction.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Physics Material</em>' containment reference.
   * @see #setPhysicsMaterial(PhysicsMaterialType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_PhysicsMaterial()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='physics_material' namespace='##targetNamespace'"
   * @generated
   */
	PhysicsMaterialType getPhysicsMaterial();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getPhysicsMaterial <em>Physics Material</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Physics Material</em>' containment reference.
   * @see #getPhysicsMaterial()
   * @generated
   */
	void setPhysicsMaterial(PhysicsMaterialType value);

	/**
   * Returns the value of the '<em><b>Instance Geometry</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The instance_geometry element declares the instantiation of a COLLADA geometry resource.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Instance Geometry</em>' containment reference.
   * @see #setInstanceGeometry(InstanceGeometryType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_InstanceGeometry()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='instance_geometry' namespace='##targetNamespace'"
   * @generated
   */
	InstanceGeometryType getInstanceGeometry();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getInstanceGeometry <em>Instance Geometry</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance Geometry</em>' containment reference.
   * @see #getInstanceGeometry()
   * @generated
   */
	void setInstanceGeometry(InstanceGeometryType value);

	/**
   * Returns the value of the '<em><b>Plane</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			An infinite plane primitive.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Plane</em>' containment reference.
   * @see #setPlane(PlaneType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Plane()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='plane' namespace='##targetNamespace'"
   * @generated
   */
	PlaneType getPlane();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getPlane <em>Plane</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plane</em>' containment reference.
   * @see #getPlane()
   * @generated
   */
	void setPlane(PlaneType value);

	/**
   * Returns the value of the '<em><b>Box</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			An axis-aligned, centered box primitive.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Box</em>' containment reference.
   * @see #setBox(BoxType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Box()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='box' namespace='##targetNamespace'"
   * @generated
   */
	BoxType getBox();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getBox <em>Box</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Box</em>' containment reference.
   * @see #getBox()
   * @generated
   */
	void setBox(BoxType value);

	/**
   * Returns the value of the '<em><b>Sphere</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A centered sphere primitive.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Sphere</em>' containment reference.
   * @see #setSphere(SphereType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Sphere()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sphere' namespace='##targetNamespace'"
   * @generated
   */
	SphereType getSphere();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getSphere <em>Sphere</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sphere</em>' containment reference.
   * @see #getSphere()
   * @generated
   */
	void setSphere(SphereType value);

	/**
   * Returns the value of the '<em><b>Cylinder</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A cylinder primitive that is centered on, and aligned with. the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Cylinder</em>' containment reference.
   * @see #setCylinder(CylinderType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Cylinder()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='cylinder' namespace='##targetNamespace'"
   * @generated
   */
	CylinderType getCylinder();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getCylinder <em>Cylinder</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cylinder</em>' containment reference.
   * @see #getCylinder()
   * @generated
   */
	void setCylinder(CylinderType value);

	/**
   * Returns the value of the '<em><b>Tapered Cylinder</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A tapered cylinder primitive that is centered on and aligned with the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Tapered Cylinder</em>' containment reference.
   * @see #setTaperedCylinder(TaperedCylinderType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_TaperedCylinder()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='tapered_cylinder' namespace='##targetNamespace'"
   * @generated
   */
	TaperedCylinderType getTaperedCylinder();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getTaperedCylinder <em>Tapered Cylinder</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tapered Cylinder</em>' containment reference.
   * @see #getTaperedCylinder()
   * @generated
   */
	void setTaperedCylinder(TaperedCylinderType value);

	/**
   * Returns the value of the '<em><b>Capsule</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A capsule primitive that is centered on and aligned with the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Capsule</em>' containment reference.
   * @see #setCapsule(CapsuleType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_Capsule()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='capsule' namespace='##targetNamespace'"
   * @generated
   */
	CapsuleType getCapsule();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getCapsule <em>Capsule</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Capsule</em>' containment reference.
   * @see #getCapsule()
   * @generated
   */
	void setCapsule(CapsuleType value);

	/**
   * Returns the value of the '<em><b>Tapered Capsule</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			A tapered capsule primitive that is centered on, and aligned with, the local Y axis.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Tapered Capsule</em>' containment reference.
   * @see #setTaperedCapsule(TaperedCapsuleType)
   * @see org.khronos.collada.ColladaPackage#getShapeType_TaperedCapsule()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='tapered_capsule' namespace='##targetNamespace'"
   * @generated
   */
	TaperedCapsuleType getTaperedCapsule();

	/**
   * Sets the value of the '{@link org.khronos.collada.ShapeType#getTaperedCapsule <em>Tapered Capsule</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tapered Capsule</em>' containment reference.
   * @see #getTaperedCapsule()
   * @generated
   */
	void setTaperedCapsule(TaperedCapsuleType value);

	/**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see org.khronos.collada.ColladaPackage#getShapeType_Group()
   * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
   *        extendedMetaData="kind='group' name='group:13'"
   * @generated
   */
	FeatureMap getGroup();

	/**
   * Returns the value of the '<em><b>Translate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.TargetableFloat3}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The translate element contains a mathematical vector that represents the distance along the 
   * 			X, Y and Z-axes.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Translate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getShapeType_Translate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='translate' namespace='##targetNamespace' group='#group:13'"
   * @generated
   */
	EList<TargetableFloat3> getTranslate();

	/**
   * Returns the value of the '<em><b>Rotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.RotateType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 			The rotate element contains an angle and a mathematical vector that represents the axis of rotation.
   * 			
   * <!-- end-model-doc -->
   * @return the value of the '<em>Rotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getShapeType_Rotate()
   * @model containment="true" transient="true" volatile="true" derived="true"
   *        extendedMetaData="kind='element' name='rotate' namespace='##targetNamespace' group='#group:13'"
   * @generated
   */
	EList<RotateType> getRotate();

	/**
   * Returns the value of the '<em><b>Extra</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.ExtraType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   * 												The extra element may appear any number of times.
   * 												
   * <!-- end-model-doc -->
   * @return the value of the '<em>Extra</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getShapeType_Extra()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='extra' namespace='##targetNamespace'"
   * @generated
   */
	EList<ExtraType> getExtra();

} // ShapeType