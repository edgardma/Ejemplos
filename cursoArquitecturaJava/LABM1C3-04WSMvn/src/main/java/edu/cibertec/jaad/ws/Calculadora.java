
package edu.cibertec.jaad.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculadora", targetNamespace = "http://jaxws.jaad.cibertec.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculadora {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "restar", targetNamespace = "http://jaxws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.Restar")
    @ResponseWrapper(localName = "restarResponse", targetNamespace = "http://jaxws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.RestarResponse")
    public Integer restar(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Integer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sumar", targetNamespace = "http://jaxws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.Sumar")
    @ResponseWrapper(localName = "sumarResponse", targetNamespace = "http://jaxws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.SumarResponse")
    public Integer sumar(
        @WebParam(name = "arg0", targetNamespace = "")
        Integer arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Integer arg1);

}
