
package in.benchresources.entities.music;

import javax.persistence.*;
import javax.xml.bind.annotation.*;
import java.io.Serializable;


/**
 * <p>Java class for Movie complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Movie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="musicId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="movieName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="director" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Movie", propOrder = {
        "musicId",
        "movieName",
        "year",
        "director",
        "comments"
})
@XmlSeeAlso({
        AddMovieRequestType.class,
        AddMovieResponseType.class,
        MusicListRequestType.class,
        MusicListResponseType.class,
        MusicListByIdRequestType.class,
        MusicListByIdResponseType.class
})
@XmlRootElement
@Entity
@Table(name = "music")
public class Movie implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "MUSIC_ID")
    protected int musicId;
    @XmlElement(required = true)
    @Column(name= "MOVIE_NAME")
    protected String movieName;
    @XmlElement(required = true)
    @Column(name= "YEAR_OF_RELEASE")
    protected String year;
    @XmlElement(required = true)
    @Column(name= "MOVIE_DIRECTOR")
    protected String director;
    @XmlElement(required = true)
    @Column(name= "COMMENTS")
    protected String comments;

    /**
     * Gets the value of the musicId property.
     *
     */
    public int getMusicId() {
        return musicId;
    }

    /**
     * Sets the value of the musicId property.
     *
     */
    public void setMusicId(int value) {
        this.musicId = value;
    }

    /**
     * Gets the value of the movieName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * Sets the value of the movieName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMovieName(String value) {
        this.movieName = value;
    }

    /**
     * Gets the value of the year property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setYear(String value) {
        this.year = value;
    }

    /**
     * Gets the value of the director property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDirector() {
        return director;
    }

    /**
     * Sets the value of the director property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDirector(String value) {
        this.director = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
