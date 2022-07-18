package in.benchresources.services.musicservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2022-07-18T16:41:36.650+05:30
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "MusicService",
                  wsdlLocation = "file:/C:/soap/ApacheCXF-JAX-WS-Top-Down-Spring-Hibernate/src/main/resources/com/demo/soap/cxf/services/MusicService.wsdl",
                  targetNamespace = "http://benchresources.in/services/MusicService/")
public class MusicService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://benchresources.in/services/MusicService/", "MusicService");
    public final static QName MusicServicePort = new QName("http://benchresources.in/services/MusicService/", "MusicServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/soap/ApacheCXF-JAX-WS-Top-Down-Spring-Hibernate/src/main/resources/com/demo/soap/cxf/services/MusicService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(MusicService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/soap/ApacheCXF-JAX-WS-Top-Down-Spring-Hibernate/src/main/resources/com/demo/soap/cxf/services/MusicService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MusicService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MusicService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MusicService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MusicService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MusicService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MusicService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns IMusicService
     */
    @WebEndpoint(name = "MusicServicePort")
    public IMusicService getMusicServicePort() {
        return super.getPort(MusicServicePort, IMusicService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IMusicService
     */
    @WebEndpoint(name = "MusicServicePort")
    public IMusicService getMusicServicePort(WebServiceFeature... features) {
        return super.getPort(MusicServicePort, IMusicService.class, features);
    }

}
