/**
 * CorpPaymentWsImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.turkcelltech.cpgw.ws.impl;

public class CorpPaymentWsImplServiceLocator extends org.apache.axis.client.Service implements com.turkcelltech.cpgw.ws.impl.CorpPaymentWsImplService {

    public CorpPaymentWsImplServiceLocator() {
    }


    public CorpPaymentWsImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CorpPaymentWsImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CorpPaymentWsImplPort
    private java.lang.String CorpPaymentWsImplPort_address = "http://10.201.232.24:6611/CorpPaymentGW/services/corpPaymentService";

    public java.lang.String getCorpPaymentWsImplPortAddress() {
        return CorpPaymentWsImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CorpPaymentWsImplPortWSDDServiceName = "CorpPaymentWsImplPort";

    public java.lang.String getCorpPaymentWsImplPortWSDDServiceName() {
        return CorpPaymentWsImplPortWSDDServiceName;
    }

    public void setCorpPaymentWsImplPortWSDDServiceName(java.lang.String name) {
        CorpPaymentWsImplPortWSDDServiceName = name;
    }

    public com.turkcelltech.cpgw.ws.CorpPaymentService getCorpPaymentWsImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CorpPaymentWsImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCorpPaymentWsImplPort(endpoint);
    }

    public com.turkcelltech.cpgw.ws.CorpPaymentService getCorpPaymentWsImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.turkcelltech.cpgw.ws.impl.CorpPaymentWsImplServiceSoapBindingStub _stub = new com.turkcelltech.cpgw.ws.impl.CorpPaymentWsImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCorpPaymentWsImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCorpPaymentWsImplPortEndpointAddress(java.lang.String address) {
        CorpPaymentWsImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.turkcelltech.cpgw.ws.CorpPaymentService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.turkcelltech.cpgw.ws.impl.CorpPaymentWsImplServiceSoapBindingStub _stub = new com.turkcelltech.cpgw.ws.impl.CorpPaymentWsImplServiceSoapBindingStub(new java.net.URL(CorpPaymentWsImplPort_address), this);
                _stub.setPortName(getCorpPaymentWsImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CorpPaymentWsImplPort".equals(inputPortName)) {
            return getCorpPaymentWsImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.ws.cpgw.turkcelltech.com/", "CorpPaymentWsImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.ws.cpgw.turkcelltech.com/", "CorpPaymentWsImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CorpPaymentWsImplPort".equals(portName)) {
            setCorpPaymentWsImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
