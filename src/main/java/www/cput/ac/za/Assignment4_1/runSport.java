package www.cput.ac.za.Assignment4_1;

import www.cput.ac.za.Assignment4_1.Football;
import www.cput.ac.za.Assignment4_1.Rugby;

/**
 * Created by Adeebo on 2016/03/26.
 */
public class runSport {

    public static void main(String[] args) {

        Football foot = new Football("Soccer", "Round", "Manchester");
        Rugby rug = new Rugby("Rugby", "Oval", "Stomers");

        System.out.printf("%sNo of Players: %d\n\n",foot,foot.noOfPlayers());
        System.out.printf("%sNo of Players: %d\n\n",rug,rug.noOfPlayers());


    }
}
