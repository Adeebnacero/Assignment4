package www.cput.ac.za.Assignment4_1;

/**
 * Created by Adeebo on 2016/03/26.
 */
public class Rugby extends Sports {

    public Rugby(String sport,String ballType, String name) {
        super(sport, ballType, name);
    }

    public String toString() {
        return super.toString();
    }


    public int noOfPlayers() {
        return 15;
    }
}
