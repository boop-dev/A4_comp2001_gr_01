import java.util.ArrayList;
import java.util.stream.Collectors;
/**
 * Simulates a group with four teams.
 *
 * @author Chiaha Christopher Izuchukwu
 * @version 2022.03.29
 */
public class Group
{
    private String name;
    private ArrayList<Team> teams;
    /**
     * Constructor for objects of class Group
     */
    public Group(String name,Team firstTeam, Team secondTeam, Team thirdTeam, Team fourthTeam)
    {
        this.name = name;
        this.teams = new ArrayList<Team>();
        this.teams.add(firstTeam);
        this.teams.add(secondTeam);
        this.teams.add(thirdTeam);
        this.teams.add(fourthTeam);
    }
    
    public ArrayList<Team> getGroupList() {
        return this.teams;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void showGroupRanking(String name) {
        
    }
}
