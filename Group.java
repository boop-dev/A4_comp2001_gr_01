import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 * Simulates a group with four teams.
 *
 * @author Chiaha Christopher Izuchukwu
 * @version 2021.03.29
 */
public class Group
{
    private String name;
    private int groupNumber;
    private ArrayList<String> groupResults;
    private ArrayList<Team> teams;

    /**
     * Constructor for objects of class Group
     */
    public Group(String name,Team firstTeam, Team secondTeam, Team thirdTeam, Team fourthTeam, int groupNo) {
        this.name = name;
        this.teams = new ArrayList<Team>();
        this.teams.add(firstTeam);
        this.teams.add(secondTeam);
        this.teams.add(thirdTeam);
        this.teams.add(fourthTeam);
        this.groupNumber = groupNo;
    }

    public ArrayList<Team> calculateRanking()
    {
        ArrayList<Team> teams = this.teams.stream().sorted(
                (team1, team2) -> Double.compare(team2.getPoints(), team1.getPoints())
        ).collect(Collectors.toCollection(ArrayList::new));
        this.teams = compareGoals(teams);
        return teams;
    }

    private ArrayList<Team> compareGoals(ArrayList<Team> teams){
        for (int i=0; i<this.teams.size()-1; i++) {
            Team team1 = teams.get(i);
            Team team2 = teams.get(i+1);
            int rank = i+1;
            if (i!=0) {
                rank = teams.get(i).getRank();}

            if (team1.getPoints()==team2.getPoints()){
                int standing1 = team1.getGoalDifference();
                int standing2 = team2.getGoalDifference();
                if (standing1>standing2) {team1.setRank(rank); team2.setRank(rank+1);}
                else if (standing2>standing1) {team2.setRank(rank); team1.setRank(rank+1);}
                else {team1.setRank(rank); team2.setRank(rank);}
            }else {team1.setRank(rank); team2.setRank(rank+1);}
        }
        return teams;
    }

    public ArrayList<Team> teams() {
        return this.teams;
    }

    public int getGroupNumber(){
        return groupNumber;
    }

}
