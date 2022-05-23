/**
 * generated by Xtext 2.26.0
 */
package fr.n7.pDL1.impl;

import fr.n7.pDL1.Need;
import fr.n7.pDL1.PDL1Package;
import fr.n7.pDL1.Resource;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Need</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.pDL1.impl.NeedImpl#getNbResources <em>Nb Resources</em>}</li>
 *   <li>{@link fr.n7.pDL1.impl.NeedImpl#getResource <em>Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeedImpl extends MinimalEObjectImpl.Container implements Need
{
  /**
   * The default value of the '{@link #getNbResources() <em>Nb Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbResources()
   * @generated
   * @ordered
   */
  protected static final int NB_RESOURCES_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNbResources() <em>Nb Resources</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNbResources()
   * @generated
   * @ordered
   */
  protected int nbResources = NB_RESOURCES_EDEFAULT;

  /**
   * The cached value of the '{@link #getResource() <em>Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResource()
   * @generated
   * @ordered
   */
  protected Resource resource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NeedImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PDL1Package.Literals.NEED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getNbResources()
  {
    return nbResources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNbResources(int newNbResources)
  {
    int oldNbResources = nbResources;
    nbResources = newNbResources;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.NEED__NB_RESOURCES, oldNbResources, nbResources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Resource getResource()
  {
    if (resource != null && resource.eIsProxy())
    {
      InternalEObject oldResource = (InternalEObject)resource;
      resource = (Resource)eResolveProxy(oldResource);
      if (resource != oldResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PDL1Package.NEED__RESOURCE, oldResource, resource));
      }
    }
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resource basicGetResource()
  {
    return resource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setResource(Resource newResource)
  {
    Resource oldResource = resource;
    resource = newResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PDL1Package.NEED__RESOURCE, oldResource, resource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PDL1Package.NEED__NB_RESOURCES:
        return getNbResources();
      case PDL1Package.NEED__RESOURCE:
        if (resolve) return getResource();
        return basicGetResource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PDL1Package.NEED__NB_RESOURCES:
        setNbResources((Integer)newValue);
        return;
      case PDL1Package.NEED__RESOURCE:
        setResource((Resource)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PDL1Package.NEED__NB_RESOURCES:
        setNbResources(NB_RESOURCES_EDEFAULT);
        return;
      case PDL1Package.NEED__RESOURCE:
        setResource((Resource)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PDL1Package.NEED__NB_RESOURCES:
        return nbResources != NB_RESOURCES_EDEFAULT;
      case PDL1Package.NEED__RESOURCE:
        return resource != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (nbResources: ");
    result.append(nbResources);
    result.append(')');
    return result.toString();
  }

} //NeedImpl
