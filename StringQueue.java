import java.util.Arrays;
/**
 * StringQueue Klasse zur Implementierung von Queue.
 *
 * @author  (Mofadhal Al-Manari und Leen Alkhadraa)
 * @version (02.02.2021)
 */
public class StringQueue implements Queue {
    private String[] mofe;
    private int size;
    private int lastEle;
    
    /**
     * StringQueue Constructor um die Größe des Arrays überzugeben
     *
     * @param size als parameter übergeben
     */
    public StringQueue (int size){
        if (size <= 0 ){
            throw new IllegalArgumentException("Size muss grosser als 0 sein");
        }
        mofe = new String[size];
        this.size = size;
        lastEle = 0;
    }
    
    /**
     *  Method addLast um Objekt hinten anzufuegen
     *
     * @param o als parameter 
     */
    @Override
    public void addLast(Object o) {
       if (lastEle >= size ){
        throw new RuntimeException("Die Schlange ist bereit Voll !!");
       }
       if (!(o instanceof String || o == null)){
        throw new IllegalArgumentException("Die Schlange muss String sein");
       }
      mofe[lastEle] = (String) o;
       lastEle++;
    }

    /**
     *  Method removeFirst diese Methode entfernt das erste Element und gibt eine Referenz darauf zurück
     *
     *  @return gibt eine Referenz auf das erste gelöchte Element zurück
     */
    @Override
    public String removeFirst() {

        if (lastEle <= 0){
            throw new RuntimeException("Die Schlange ist leer");
        }
        String FirstEle = mofe[0];
        for (int i = 0; i < lastEle -1 ; i++) {
            mofe[i] = mofe[i + 1];
        }
        lastEle--;
        if (lastEle < size){
            mofe[lastEle] = null ;
        }
        return FirstEle;
    }

    /**
     * Method get das i-te Element zurückgeben 
     *
     * @param indesBasedOne A parameter
     * @return das i-te Element
     */
    // die Signatur einer Methode besteht aus dem Methodenname und der Parameterliste
    // der Rückgabewert gehört NICHT dazu !!!
    @Override
    public String get(int indesBasedOne) {
        int i = indesBasedOne -1 ;
        if (i <= 0 || i >= lastEle || i >= size /*unmöglich aber aus sicherheit*/){
            throw new IllegalArgumentException("indesBasedOne ist nicht gültig");
        }
        return mofe[i];
        /***
        String tempGet = mofe[i];
        for (int j = i; j < lastEle -1; j++) {
            mofe[j] = mofe[j + 1];
        }
        lastEle--;
        if (lastEle < size){
            mofe[lastEle] = null ;
        }
        return tempGet;
        */
    }

    /**
     * Method empty überprüft ob die StringQueue leer ist 
     *
     * @return true ob die StringQueue leer ist und false ob die StringQueue nicht leer ist 
     */
    @Override
    public boolean empty() {
        return lastEle == 0;
    }

    /**
     * Method full  überprüft ob die StringQueue full ist 
     *
     * @return  true ob die StringQueue full ist und false ob die StringQueue nicht full ist 
     */
    @Override
    public boolean full() {
        return lastEle >= size;
    }

    /**
     * Method size gibt die Größe zurück
     *
     * @return die Größe 
     */
    @Override
    public int size() {
        return lastEle;
    }

    /**
     * Method toString um die Objekte aufzubereiten
     *
     * @return die Objekte 
     */
    @Override
    public String toString() {
        return
                "size = " + size +
                ", lastEle = " + lastEle +
                "\nQueue = "+ Arrays.toString(mofe) ;
    }
}
