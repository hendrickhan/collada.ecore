/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.khronos.collada;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Setparam Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.khronos.collada.SetparamType#getAnnotate <em>Annotate</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#isBool <em>Bool</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getBool2 <em>Bool2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getBool3 <em>Bool3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getBool4 <em>Bool4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getInt <em>Int</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getInt2 <em>Int2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getInt3 <em>Int3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getInt4 <em>Int4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat <em>Float</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat2 <em>Float2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat3 <em>Float3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat4 <em>Float4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat1x1 <em>Float1x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat1x2 <em>Float1x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat1x3 <em>Float1x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat1x4 <em>Float1x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat2x1 <em>Float2x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat2x2 <em>Float2x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat2x3 <em>Float2x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat2x4 <em>Float2x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat3x1 <em>Float3x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat3x2 <em>Float3x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat3x3 <em>Float3x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat3x4 <em>Float3x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat4x1 <em>Float4x1</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat4x2 <em>Float4x2</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat4x3 <em>Float4x3</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getFloat4x4 <em>Float4x4</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getSurface <em>Surface</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getTexturePipeline <em>Texture Pipeline</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getSamplerState <em>Sampler State</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getTextureUnit <em>Texture Unit</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getEnum <em>Enum</em>}</li>
 *   <li>{@link org.khronos.collada.SetparamType#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.khronos.collada.ColladaPackage#getSetparamType()
 * @model extendedMetaData="name='setparam_._type' kind='elementOnly'"
 * @generated
 */
public interface SetparamType extends EObject {
	/**
   * Returns the value of the '<em><b>Annotate</b></em>' containment reference list.
   * The list contents are of type {@link org.khronos.collada.FxAnnotateCommon}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotate</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Annotate</em>' containment reference list.
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Annotate()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='annotate' namespace='##targetNamespace'"
   * @generated
   */
	EList<FxAnnotateCommon> getAnnotate();

	/**
   * Returns the value of the '<em><b>Bool</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool</em>' attribute.
   * @see #isSetBool()
   * @see #unsetBool()
   * @see #setBool(boolean)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Bool()
   * @model unsettable="true" dataType="org.khronos.collada.Bool"
   *        extendedMetaData="kind='element' name='bool' namespace='##targetNamespace'"
   * @generated
   */
	boolean isBool();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool</em>' attribute.
   * @see #isSetBool()
   * @see #unsetBool()
   * @see #isBool()
   * @generated
   */
	void setBool(boolean value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.SetparamType#isBool <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	void unsetBool();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType#isBool <em>Bool</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Bool</em>' attribute is set.
   * @see #unsetBool()
   * @see #isBool()
   * @see #setBool(boolean)
   * @generated
   */
	boolean isSetBool();

	/**
   * Returns the value of the '<em><b>Bool2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool2</em>' attribute.
   * @see #setBool2(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Bool2()
   * @model dataType="org.khronos.collada.Bool2" many="false"
   *        extendedMetaData="kind='element' name='bool2' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getBool2 <em>Bool2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool2</em>' attribute.
   * @see #getBool2()
   * @generated
   */
	void setBool2(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool3</em>' attribute.
   * @see #setBool3(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Bool3()
   * @model dataType="org.khronos.collada.Bool3" many="false"
   *        extendedMetaData="kind='element' name='bool3' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getBool3 <em>Bool3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool3</em>' attribute.
   * @see #getBool3()
   * @generated
   */
	void setBool3(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Bool4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Bool4</em>' attribute.
   * @see #setBool4(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Bool4()
   * @model dataType="org.khronos.collada.Bool4" many="false"
   *        extendedMetaData="kind='element' name='bool4' namespace='##targetNamespace'"
   * @generated
   */
	List<Boolean> getBool4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getBool4 <em>Bool4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool4</em>' attribute.
   * @see #getBool4()
   * @generated
   */
	void setBool4(List<Boolean> value);

	/**
   * Returns the value of the '<em><b>Int</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int</em>' attribute.
   * @see #isSetInt()
   * @see #unsetInt()
   * @see #setInt(long)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Int()
   * @model unsettable="true" dataType="org.khronos.collada.Int"
   *        extendedMetaData="kind='element' name='int' namespace='##targetNamespace'"
   * @generated
   */
	long getInt();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int</em>' attribute.
   * @see #isSetInt()
   * @see #unsetInt()
   * @see #getInt()
   * @generated
   */
	void setInt(long value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.SetparamType#getInt <em>Int</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetInt()
   * @see #getInt()
   * @see #setInt(long)
   * @generated
   */
	void unsetInt();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType#getInt <em>Int</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Int</em>' attribute is set.
   * @see #unsetInt()
   * @see #getInt()
   * @see #setInt(long)
   * @generated
   */
	boolean isSetInt();

	/**
   * Returns the value of the '<em><b>Int2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int2</em>' attribute.
   * @see #setInt2(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Int2()
   * @model dataType="org.khronos.collada.Int2" many="false"
   *        extendedMetaData="kind='element' name='int2' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getInt2 <em>Int2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int2</em>' attribute.
   * @see #getInt2()
   * @generated
   */
	void setInt2(List<Long> value);

	/**
   * Returns the value of the '<em><b>Int3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int3</em>' attribute.
   * @see #setInt3(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Int3()
   * @model dataType="org.khronos.collada.Int3" many="false"
   *        extendedMetaData="kind='element' name='int3' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getInt3 <em>Int3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int3</em>' attribute.
   * @see #getInt3()
   * @generated
   */
	void setInt3(List<Long> value);

	/**
   * Returns the value of the '<em><b>Int4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Int4</em>' attribute.
   * @see #setInt4(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Int4()
   * @model dataType="org.khronos.collada.Int4" many="false"
   *        extendedMetaData="kind='element' name='int4' namespace='##targetNamespace'"
   * @generated
   */
	List<Long> getInt4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getInt4 <em>Int4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int4</em>' attribute.
   * @see #getInt4()
   * @generated
   */
	void setInt4(List<Long> value);

	/**
   * Returns the value of the '<em><b>Float</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float</em>' attribute.
   * @see #isSetFloat()
   * @see #unsetFloat()
   * @see #setFloat(double)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='float' namespace='##targetNamespace'"
   * @generated
   */
	double getFloat();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float</em>' attribute.
   * @see #isSetFloat()
   * @see #unsetFloat()
   * @see #getFloat()
   * @generated
   */
	void setFloat(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.SetparamType#getFloat <em>Float</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat()
   * @see #getFloat()
   * @see #setFloat(double)
   * @generated
   */
	void unsetFloat();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType#getFloat <em>Float</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Float</em>' attribute is set.
   * @see #unsetFloat()
   * @see #getFloat()
   * @see #setFloat(double)
   * @generated
   */
	boolean isSetFloat();

	/**
   * Returns the value of the '<em><b>Float2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2</em>' attribute.
   * @see #setFloat2(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float2()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat2 <em>Float2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2</em>' attribute.
   * @see #getFloat2()
   * @generated
   */
	void setFloat2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3</em>' attribute.
   * @see #setFloat3(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float3()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat3 <em>Float3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3</em>' attribute.
   * @see #getFloat3()
   * @generated
   */
	void setFloat3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4</em>' attribute.
   * @see #setFloat4(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float4()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat4 <em>Float4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4</em>' attribute.
   * @see #getFloat4()
   * @generated
   */
	void setFloat4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float1x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x1</em>' attribute.
   * @see #isSetFloat1x1()
   * @see #unsetFloat1x1()
   * @see #setFloat1x1(double)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float1x1()
   * @model unsettable="true" dataType="org.khronos.collada.Float"
   *        extendedMetaData="kind='element' name='float1x1' namespace='##targetNamespace'"
   * @generated
   */
	double getFloat1x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat1x1 <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x1</em>' attribute.
   * @see #isSetFloat1x1()
   * @see #unsetFloat1x1()
   * @see #getFloat1x1()
   * @generated
   */
	void setFloat1x1(double value);

	/**
   * Unsets the value of the '{@link org.khronos.collada.SetparamType#getFloat1x1 <em>Float1x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isSetFloat1x1()
   * @see #getFloat1x1()
   * @see #setFloat1x1(double)
   * @generated
   */
	void unsetFloat1x1();

	/**
   * Returns whether the value of the '{@link org.khronos.collada.SetparamType#getFloat1x1 <em>Float1x1</em>}' attribute is set.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return whether the value of the '<em>Float1x1</em>' attribute is set.
   * @see #unsetFloat1x1()
   * @see #getFloat1x1()
   * @see #setFloat1x1(double)
   * @generated
   */
	boolean isSetFloat1x1();

	/**
   * Returns the value of the '<em><b>Float1x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x2</em>' attribute.
   * @see #setFloat1x2(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float1x2()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float1x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat1x2 <em>Float1x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x2</em>' attribute.
   * @see #getFloat1x2()
   * @generated
   */
	void setFloat1x2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float1x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x3</em>' attribute.
   * @see #setFloat1x3(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float1x3()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float1x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat1x3 <em>Float1x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x3</em>' attribute.
   * @see #getFloat1x3()
   * @generated
   */
	void setFloat1x3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float1x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float1x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float1x4</em>' attribute.
   * @see #setFloat1x4(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float1x4()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float1x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat1x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat1x4 <em>Float1x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float1x4</em>' attribute.
   * @see #getFloat1x4()
   * @generated
   */
	void setFloat1x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float2x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x1</em>' attribute.
   * @see #setFloat2x1(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float2x1()
   * @model dataType="org.khronos.collada.Float2" many="false"
   *        extendedMetaData="kind='element' name='float2x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat2x1 <em>Float2x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x1</em>' attribute.
   * @see #getFloat2x1()
   * @generated
   */
	void setFloat2x1(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float2x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x2</em>' attribute.
   * @see #setFloat2x2(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float2x2()
   * @model dataType="org.khronos.collada.Float2x2" many="false"
   *        extendedMetaData="kind='element' name='float2x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat2x2 <em>Float2x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x2</em>' attribute.
   * @see #getFloat2x2()
   * @generated
   */
	void setFloat2x2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float2x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x3</em>' attribute.
   * @see #setFloat2x3(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float2x3()
   * @model dataType="org.khronos.collada.Float2x3" many="false"
   *        extendedMetaData="kind='element' name='float2x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat2x3 <em>Float2x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x3</em>' attribute.
   * @see #getFloat2x3()
   * @generated
   */
	void setFloat2x3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float2x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float2x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float2x4</em>' attribute.
   * @see #setFloat2x4(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float2x4()
   * @model dataType="org.khronos.collada.Float2x4" many="false"
   *        extendedMetaData="kind='element' name='float2x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat2x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat2x4 <em>Float2x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float2x4</em>' attribute.
   * @see #getFloat2x4()
   * @generated
   */
	void setFloat2x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x1</em>' attribute.
   * @see #setFloat3x1(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float3x1()
   * @model dataType="org.khronos.collada.Float3" many="false"
   *        extendedMetaData="kind='element' name='float3x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat3x1 <em>Float3x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x1</em>' attribute.
   * @see #getFloat3x1()
   * @generated
   */
	void setFloat3x1(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x2</em>' attribute.
   * @see #setFloat3x2(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float3x2()
   * @model dataType="org.khronos.collada.Float3x2" many="false"
   *        extendedMetaData="kind='element' name='float3x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat3x2 <em>Float3x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x2</em>' attribute.
   * @see #getFloat3x2()
   * @generated
   */
	void setFloat3x2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x3</em>' attribute.
   * @see #setFloat3x3(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float3x3()
   * @model dataType="org.khronos.collada.Float3x3" many="false"
   *        extendedMetaData="kind='element' name='float3x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat3x3 <em>Float3x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x3</em>' attribute.
   * @see #getFloat3x3()
   * @generated
   */
	void setFloat3x3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float3x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float3x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float3x4</em>' attribute.
   * @see #setFloat3x4(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float3x4()
   * @model dataType="org.khronos.collada.Float3x4" many="false"
   *        extendedMetaData="kind='element' name='float3x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat3x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat3x4 <em>Float3x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float3x4</em>' attribute.
   * @see #getFloat3x4()
   * @generated
   */
	void setFloat3x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4x1</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x1</em>' attribute.
   * @see #setFloat4x1(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float4x1()
   * @model dataType="org.khronos.collada.Float4" many="false"
   *        extendedMetaData="kind='element' name='float4x1' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x1();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat4x1 <em>Float4x1</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x1</em>' attribute.
   * @see #getFloat4x1()
   * @generated
   */
	void setFloat4x1(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4x2</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x2</em>' attribute.
   * @see #setFloat4x2(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float4x2()
   * @model dataType="org.khronos.collada.Float4x2" many="false"
   *        extendedMetaData="kind='element' name='float4x2' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x2();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat4x2 <em>Float4x2</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x2</em>' attribute.
   * @see #getFloat4x2()
   * @generated
   */
	void setFloat4x2(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4x3</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x3</em>' attribute.
   * @see #setFloat4x3(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float4x3()
   * @model dataType="org.khronos.collada.Float4x3" many="false"
   *        extendedMetaData="kind='element' name='float4x3' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x3();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat4x3 <em>Float4x3</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x3</em>' attribute.
   * @see #getFloat4x3()
   * @generated
   */
	void setFloat4x3(List<Double> value);

	/**
   * Returns the value of the '<em><b>Float4x4</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float4x4</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Float4x4</em>' attribute.
   * @see #setFloat4x4(List)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Float4x4()
   * @model dataType="org.khronos.collada.Float4x4" many="false"
   *        extendedMetaData="kind='element' name='float4x4' namespace='##targetNamespace'"
   * @generated
   */
	List<Double> getFloat4x4();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getFloat4x4 <em>Float4x4</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Float4x4</em>' attribute.
   * @see #getFloat4x4()
   * @generated
   */
	void setFloat4x4(List<Double> value);

	/**
   * Returns the value of the '<em><b>Surface</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Surface</em>' containment reference.
   * @see #setSurface(FxSurfaceCommon)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Surface()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='surface' namespace='##targetNamespace'"
   * @generated
   */
	FxSurfaceCommon getSurface();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getSurface <em>Surface</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Surface</em>' containment reference.
   * @see #getSurface()
   * @generated
   */
	void setSurface(FxSurfaceCommon value);

	/**
   * Returns the value of the '<em><b>Texture Pipeline</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Pipeline</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture Pipeline</em>' containment reference.
   * @see #setTexturePipeline(GlesTexturePipeline)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_TexturePipeline()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='texture_pipeline' namespace='##targetNamespace'"
   * @generated
   */
	GlesTexturePipeline getTexturePipeline();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getTexturePipeline <em>Texture Pipeline</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture Pipeline</em>' containment reference.
   * @see #getTexturePipeline()
   * @generated
   */
	void setTexturePipeline(GlesTexturePipeline value);

	/**
   * Returns the value of the '<em><b>Sampler State</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sampler State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Sampler State</em>' containment reference.
   * @see #setSamplerState(GlesSamplerState)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_SamplerState()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='sampler_state' namespace='##targetNamespace'"
   * @generated
   */
	GlesSamplerState getSamplerState();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getSamplerState <em>Sampler State</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sampler State</em>' containment reference.
   * @see #getSamplerState()
   * @generated
   */
	void setSamplerState(GlesSamplerState value);

	/**
   * Returns the value of the '<em><b>Texture Unit</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Texture Unit</em>' containment reference.
   * @see #setTextureUnit(GlesTextureUnit)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_TextureUnit()
   * @model containment="true"
   *        extendedMetaData="kind='element' name='texture_unit' namespace='##targetNamespace'"
   * @generated
   */
	GlesTextureUnit getTextureUnit();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getTextureUnit <em>Texture Unit</em>}' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texture Unit</em>' containment reference.
   * @see #getTextureUnit()
   * @generated
   */
	void setTextureUnit(GlesTextureUnit value);

	/**
   * Returns the value of the '<em><b>Enum</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Enum</em>' attribute.
   * @see #setEnum(Enumerator)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Enum()
   * @model dataType="org.khronos.collada.GlesEnumeration"
   *        extendedMetaData="kind='element' name='enum' namespace='##targetNamespace'"
   * @generated
   */
	Enumerator getEnum();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getEnum <em>Enum</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum</em>' attribute.
   * @see #getEnum()
   * @generated
   */
	void setEnum(Enumerator value);

	/**
   * Returns the value of the '<em><b>Ref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' attribute.
   * @see #setRef(String)
   * @see org.khronos.collada.ColladaPackage#getSetparamType_Ref()
   * @model dataType="org.eclipse.emf.ecore.xml.type.NCName" required="true"
   *        extendedMetaData="kind='attribute' name='ref'"
   * @generated
   */
	String getRef();

	/**
   * Sets the value of the '{@link org.khronos.collada.SetparamType#getRef <em>Ref</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' attribute.
   * @see #getRef()
   * @generated
   */
	void setRef(String value);

} // SetparamType