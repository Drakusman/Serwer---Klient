
package dummycex;

import dummycex.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dummycex package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HelloResponse_QNAME = new QName("http://Server/", "helloResponse");
    private final static QName _GetMaximumValue_QNAME = new QName("http://Server/", "GetMaximumValue");
    private final static QName _AddValue_QNAME = new QName("http://Server/", "addValue");
    private final static QName _AddValueResponse_QNAME = new QName("http://Server/", "addValueResponse");
    private final static QName _GetMessageAuthorLengthResponse_QNAME = new QName("http://Server/", "getMessageAuthorLengthResponse");
    private final static QName _IsConnectedResponse_QNAME = new QName("http://Server/", "isConnectedResponse");
    private final static QName _GetProductOfWithException_QNAME = new QName("http://Server/", "GetProductOfWithException");
    private final static QName _AddMessage_QNAME = new QName("http://Server/", "AddMessage");
    private final static QName _Hello_QNAME = new QName("http://Server/", "hello");
    private final static QName _GetProductOfWithExceptionResponse_QNAME = new QName("http://Server/", "GetProductOfWithExceptionResponse");
    private final static QName _SimpleMethod_QNAME = new QName("http://Server/", "Simple_Method");
    private final static QName _GetAllMessagesWithContentContainingStringResponse_QNAME = new QName("http://Server/", "getAllMessagesWithContentContainingStringResponse");
    private final static QName _GetAllMessagesWithContentContainingString_QNAME = new QName("http://Server/", "getAllMessagesWithContentContainingString");
    private final static QName _GetMessageAuthorLength_QNAME = new QName("http://Server/", "getMessageAuthorLength");
    private final static QName _SimpleMethodResponse_QNAME = new QName("http://Server/", "Simple_MethodResponse");
    private final static QName _AddMessageResponse_QNAME = new QName("http://Server/", "AddMessageResponse");
    private final static QName _GetMaximumValueResponse_QNAME = new QName("http://Server/", "GetMaximumValueResponse");
    private final static QName _IsConnected_QNAME = new QName("http://Server/", "isConnected");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dummycex
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SimpleMethodResponse }
     * 
     */
    public SimpleMethodResponse createSimpleMethodResponse() {
        return new SimpleMethodResponse();
    }

    /**
     * Create an instance of {@link GetMessageAuthorLength }
     * 
     */
    public GetMessageAuthorLength createGetMessageAuthorLength() {
        return new GetMessageAuthorLength();
    }

    /**
     * Create an instance of {@link GetAllMessagesWithContentContainingString }
     * 
     */
    public GetAllMessagesWithContentContainingString createGetAllMessagesWithContentContainingString() {
        return new GetAllMessagesWithContentContainingString();
    }

    /**
     * Create an instance of {@link SimpleMethod }
     * 
     */
    public SimpleMethod createSimpleMethod() {
        return new SimpleMethod();
    }

    /**
     * Create an instance of {@link GetAllMessagesWithContentContainingStringResponse }
     * 
     */
    public GetAllMessagesWithContentContainingStringResponse createGetAllMessagesWithContentContainingStringResponse() {
        return new GetAllMessagesWithContentContainingStringResponse();
    }

    /**
     * Create an instance of {@link IsConnected }
     * 
     */
    public IsConnected createIsConnected() {
        return new IsConnected();
    }

    /**
     * Create an instance of {@link AddMessageResponse }
     * 
     */
    public AddMessageResponse createAddMessageResponse() {
        return new AddMessageResponse();
    }

    /**
     * Create an instance of {@link GetMaximumValueResponse }
     * 
     */
    public GetMaximumValueResponse createGetMaximumValueResponse() {
        return new GetMaximumValueResponse();
    }

    /**
     * Create an instance of {@link GetMaximumValue }
     * 
     */
    public GetMaximumValue createGetMaximumValue() {
        return new GetMaximumValue();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetProductOfWithExceptionResponse }
     * 
     */
    public GetProductOfWithExceptionResponse createGetProductOfWithExceptionResponse() {
        return new GetProductOfWithExceptionResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link AddMessage }
     * 
     */
    public AddMessage createAddMessage() {
        return new AddMessage();
    }

    /**
     * Create an instance of {@link GetProductOfWithException }
     * 
     */
    public GetProductOfWithException createGetProductOfWithException() {
        return new GetProductOfWithException();
    }

    /**
     * Create an instance of {@link AddValue }
     * 
     */
    public AddValue createAddValue() {
        return new AddValue();
    }

    /**
     * Create an instance of {@link AddValueResponse }
     * 
     */
    public AddValueResponse createAddValueResponse() {
        return new AddValueResponse();
    }

    /**
     * Create an instance of {@link GetMessageAuthorLengthResponse }
     * 
     */
    public GetMessageAuthorLengthResponse createGetMessageAuthorLengthResponse() {
        return new GetMessageAuthorLengthResponse();
    }

    /**
     * Create an instance of {@link IsConnectedResponse }
     * 
     */
    public IsConnectedResponse createIsConnectedResponse() {
        return new IsConnectedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaximumValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "GetMaximumValue")
    public JAXBElement<GetMaximumValue> createGetMaximumValue(GetMaximumValue value) {
        return new JAXBElement<GetMaximumValue>(_GetMaximumValue_QNAME, GetMaximumValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "addValue")
    public JAXBElement<AddValue> createAddValue(AddValue value) {
        return new JAXBElement<AddValue>(_AddValue_QNAME, AddValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "addValueResponse")
    public JAXBElement<AddValueResponse> createAddValueResponse(AddValueResponse value) {
        return new JAXBElement<AddValueResponse>(_AddValueResponse_QNAME, AddValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageAuthorLengthResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getMessageAuthorLengthResponse")
    public JAXBElement<GetMessageAuthorLengthResponse> createGetMessageAuthorLengthResponse(GetMessageAuthorLengthResponse value) {
        return new JAXBElement<GetMessageAuthorLengthResponse>(_GetMessageAuthorLengthResponse_QNAME, GetMessageAuthorLengthResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnectedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "isConnectedResponse")
    public JAXBElement<IsConnectedResponse> createIsConnectedResponse(IsConnectedResponse value) {
        return new JAXBElement<IsConnectedResponse>(_IsConnectedResponse_QNAME, IsConnectedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductOfWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "GetProductOfWithException")
    public JAXBElement<GetProductOfWithException> createGetProductOfWithException(GetProductOfWithException value) {
        return new JAXBElement<GetProductOfWithException>(_GetProductOfWithException_QNAME, GetProductOfWithException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "AddMessage")
    public JAXBElement<AddMessage> createAddMessage(AddMessage value) {
        return new JAXBElement<AddMessage>(_AddMessage_QNAME, AddMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductOfWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "GetProductOfWithExceptionResponse")
    public JAXBElement<GetProductOfWithExceptionResponse> createGetProductOfWithExceptionResponse(GetProductOfWithExceptionResponse value) {
        return new JAXBElement<GetProductOfWithExceptionResponse>(_GetProductOfWithExceptionResponse_QNAME, GetProductOfWithExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleMethod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "Simple_Method")
    public JAXBElement<SimpleMethod> createSimpleMethod(SimpleMethod value) {
        return new JAXBElement<SimpleMethod>(_SimpleMethod_QNAME, SimpleMethod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessagesWithContentContainingStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getAllMessagesWithContentContainingStringResponse")
    public JAXBElement<GetAllMessagesWithContentContainingStringResponse> createGetAllMessagesWithContentContainingStringResponse(GetAllMessagesWithContentContainingStringResponse value) {
        return new JAXBElement<GetAllMessagesWithContentContainingStringResponse>(_GetAllMessagesWithContentContainingStringResponse_QNAME, GetAllMessagesWithContentContainingStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllMessagesWithContentContainingString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getAllMessagesWithContentContainingString")
    public JAXBElement<GetAllMessagesWithContentContainingString> createGetAllMessagesWithContentContainingString(GetAllMessagesWithContentContainingString value) {
        return new JAXBElement<GetAllMessagesWithContentContainingString>(_GetAllMessagesWithContentContainingString_QNAME, GetAllMessagesWithContentContainingString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMessageAuthorLength }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "getMessageAuthorLength")
    public JAXBElement<GetMessageAuthorLength> createGetMessageAuthorLength(GetMessageAuthorLength value) {
        return new JAXBElement<GetMessageAuthorLength>(_GetMessageAuthorLength_QNAME, GetMessageAuthorLength.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleMethodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "Simple_MethodResponse")
    public JAXBElement<SimpleMethodResponse> createSimpleMethodResponse(SimpleMethodResponse value) {
        return new JAXBElement<SimpleMethodResponse>(_SimpleMethodResponse_QNAME, SimpleMethodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "AddMessageResponse")
    public JAXBElement<AddMessageResponse> createAddMessageResponse(AddMessageResponse value) {
        return new JAXBElement<AddMessageResponse>(_AddMessageResponse_QNAME, AddMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMaximumValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "GetMaximumValueResponse")
    public JAXBElement<GetMaximumValueResponse> createGetMaximumValueResponse(GetMaximumValueResponse value) {
        return new JAXBElement<GetMaximumValueResponse>(_GetMaximumValueResponse_QNAME, GetMaximumValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnected }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Server/", name = "isConnected")
    public JAXBElement<IsConnected> createIsConnected(IsConnected value) {
        return new JAXBElement<IsConnected>(_IsConnected_QNAME, IsConnected.class, null, value);
    }

}
