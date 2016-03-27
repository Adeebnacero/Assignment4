package www.cput.ac.za.Assignment4_1;

/**
 * Created by Adeebo on 2016/03/26.
 */
public abstract class Sports implements SportsInterface {

    private String sport;
    private String ballType;
    private String name;

    public Sports(String sport, String ballType, String name) {
        this.sport = sport;
        this.ballType = ballType;
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getBallType() {
        return ballType;
    }

    public void setBallType(String ballType) {
        this.ballType = ballType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sports Information: " +
                "\nSport: " + sport +
                "\nBall used: " + ballType +
                "\nTeam Name: " + name + "\n";
    }

}
