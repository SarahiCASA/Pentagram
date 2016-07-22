package com.example.sistemascasa.tigie.db;

import com.example.sistemascasa.tigie.pojo.Chapters;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 12/07/16.
 */
public class WebService {

    private static String NAMESPACE = "http://10.40.68.153:8080/serverWS/";
    private static String URL = "http://10.40.68.153:8080/serverWS/services/HolaMundo?wsdl";
    private static String SOAP_ACTION = "http://10.40.68.153:8080/serverWS/services/";
    ArrayList<Chapters> chapters;

    public static String invokeWebService(String name, String webMethName) {
        String resTxt = null;

        SoapObject request = new SoapObject(NAMESPACE, webMethName);
        PropertyInfo sayHelloPI = new PropertyInfo();
        sayHelloPI.setName("name");
        sayHelloPI.setValue(name);


        sayHelloPI.setType(String.class);
        request.addProperty(sayHelloPI);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

        try {
            androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
            SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            resTxt = response.toString();

        } catch (Exception e) {
            e.printStackTrace();
            resTxt = "Sucedio un Error : " + e.getMessage();
        }

        return resTxt;
    }


    /*public  ArrayList<Chapters>  getChapters (String webMethName) {
        chapters = new ArrayList<Chapters>();

        return chapters;
    }*/



    public static SoapPrimitive getChapters (String webMethName) {
        Chapters [] myArray = new Chapters [101];

        SoapObject request = new SoapObject(NAMESPACE, webMethName);
        PropertyInfo sayHelloPI = new PropertyInfo();

        sayHelloPI.setType(String.class);
        request.addProperty(sayHelloPI);

        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        envelope.setOutputSoapObject(request);
        HttpTransportSE androidHttpTransport = new HttpTransportSE(URL);

        try {
            androidHttpTransport.call(SOAP_ACTION+webMethName, envelope);
            SoapPrimitive response = (SoapPrimitive) envelope.getResponse();
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            //return  "hola"+ e.printStackTrace() ;
        }

    }

}
