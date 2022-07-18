
package in.benchresources.entities.music;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.benchresources.entities.music package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.benchresources.entities.music
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MusicListByIdRequestType }
     * 
     */
    public MusicListByIdRequestType createMusicListByIdRequestType() {
        return new MusicListByIdRequestType();
    }

    /**
     * Create an instance of {@link MusicListByIdResponseType }
     * 
     */
    public MusicListByIdResponseType createMusicListByIdResponseType() {
        return new MusicListByIdResponseType();
    }

    /**
     * Create an instance of {@link Movie }
     * 
     */
    public Movie createMovie() {
        return new Movie();
    }

    /**
     * Create an instance of {@link MusicListRequestType }
     * 
     */
    public MusicListRequestType createMusicListRequestType() {
        return new MusicListRequestType();
    }

    /**
     * Create an instance of {@link MusicListResponseType }
     * 
     */
    public MusicListResponseType createMusicListResponseType() {
        return new MusicListResponseType();
    }

    /**
     * Create an instance of {@link AddMovieRequestType }
     * 
     */
    public AddMovieRequestType createAddMovieRequestType() {
        return new AddMovieRequestType();
    }

    /**
     * Create an instance of {@link AddMovieResponseType }
     * 
     */
    public AddMovieResponseType createAddMovieResponseType() {
        return new AddMovieResponseType();
    }

    /**
     * Create an instance of {@link BusinessFaultType }
     * 
     */
    public BusinessFaultType createBusinessFaultType() {
        return new BusinessFaultType();
    }

}
