package www.cput.ac.za.Assignment4_1;

/**
 * Created by Adeebo on 2016/03/27.
 */
public class SportsFactory {

    public SportsInterface getSportsInterface(int players){

        if(players == 11){

            return new Football("","","");
        }else
            if(players == 15){

                return new Rugby("","","");
            }
            else
                return null;
    }
}
