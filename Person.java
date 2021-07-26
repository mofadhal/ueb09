import java.util.Objects;
/**
 *  Person Klasse zum Behalten der PersonenInformationen (Vor- Nachname)
 *
 * @author  (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (02.02.2021)
 */
public class Person {
    private String name;
    private String vorName;

    /**
     * Person Constructor um neue Objekte zu erzeugen
     *
     * @param vorName und  parameter
     * @param name und parameter
     */
    public Person() {}

    public Person(String vorName, String name) {
        if (vorName == null || name == null || vorName.isEmpty() || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.vorName = vorName;
    }

    /**
     * Method getVorName gibt Vorname zurück
     *
     * @return VorName
     */
    public String getVorname() {
        return vorName;
    }

    /**
     * Method setVorName um Vorname zu ändern
     * 
     * @param vorName als parameter
     */
    public void setVorname(String vorName) {
        if (vorName == null  || vorName.isEmpty() ){
            throw new IllegalArgumentException();
        }
        this.vorName = vorName;
    }
    
    /**
     * Method getVorName gibt Name zurück
     *
     * @return Name 
     */
    public String getName() {
        return name;
    }
    
    /**
     * Method setName um Name zu ändern
     * 
     * @param name als parameter
     */
    public void setName(String name) {
        if (name == null  || name.isEmpty() ){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(vorName, person.vorName);
    }

}
