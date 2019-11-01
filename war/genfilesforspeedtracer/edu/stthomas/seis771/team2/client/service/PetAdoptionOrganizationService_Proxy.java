package edu.stthomas.seis771.team2.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class PetAdoptionOrganizationService_Proxy extends RemoteServiceProxy implements edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationService";
  private static final String SERIALIZATION_POLICY ="C9AD8763CB9AEA3281265185F89C40FC";
  private static final edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationService_TypeSerializer SERIALIZER = new edu.stthomas.seis771.team2.client.service.PetAdoptionOrganizationService_TypeSerializer();
  
  public PetAdoptionOrganizationService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "paoservice", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void authenticate(java.lang.String userName, java.lang.String password, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("PetAdoptionOrganizationService_Proxy", "authenticate");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(userName);
      streamWriter.writeString(password);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void recordAnimalByIntake(java.util.HashMap petInformation, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("PetAdoptionOrganizationService_Proxy", "recordAnimalByIntake");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.util.HashMap/1797211028");
      streamWriter.writeObject(petInformation);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void register(java.lang.String fname, java.lang.String lname, java.lang.String userName, java.lang.String password, java.lang.String address, java.lang.String city, java.lang.String zip, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("PetAdoptionOrganizationService_Proxy", "register");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 7);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(fname);
      streamWriter.writeString(lname);
      streamWriter.writeString(userName);
      streamWriter.writeString(password);
      streamWriter.writeString(address);
      streamWriter.writeString(city);
      streamWriter.writeString(zip);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void request(java.lang.String status, java.lang.String adoptionid, java.lang.String date, java.lang.String animalid, java.lang.String breed, java.lang.String gender, java.lang.String age, java.lang.String size, java.lang.String color, java.lang.String userName, java.lang.String password, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("PetAdoptionOrganizationService_Proxy", "request");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 11);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(status);
      streamWriter.writeString(adoptionid);
      streamWriter.writeString(date);
      streamWriter.writeString(animalid);
      streamWriter.writeString(breed);
      streamWriter.writeString(gender);
      streamWriter.writeString(age);
      streamWriter.writeString(size);
      streamWriter.writeString(color);
      streamWriter.writeString(userName);
      streamWriter.writeString(password);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void rescue(java.lang.String status, java.lang.String rescueid, java.lang.String date, java.lang.String animalid, java.lang.String breed, java.lang.String gender, java.lang.String age, java.lang.String size, java.lang.String color, java.lang.String userName, java.lang.String password, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("PetAdoptionOrganizationService_Proxy", "rescue");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 11);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(status);
      streamWriter.writeString(rescueid);
      streamWriter.writeString(date);
      streamWriter.writeString(animalid);
      streamWriter.writeString(breed);
      streamWriter.writeString(gender);
      streamWriter.writeString(age);
      streamWriter.writeString(size);
      streamWriter.writeString(color);
      streamWriter.writeString(userName);
      streamWriter.writeString(password);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void submission(java.lang.String status, java.lang.String submissionid, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("PetAdoptionOrganizationService_Proxy", "submission");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString(status);
      streamWriter.writeString(submissionid);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
