import  java.util.ArrayList;
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    private String name;
    private int group;
    
    /**
     * Constructor for objects of class Team
     */
    public Team(String name,int group)
    {
        name = name;
        group = group;
    }
    
    public void teamNames(ArrayList<Team> teamsList) {
        Team team = new Team("USA", 1);
        teamsList.add(team);
        team = new Team("Uruguay", 1);
        teamsList.add(team);
        team = new Team("Germany", 1);
        teamsList.add(team);
        team = new Team("Mexico", 1);
        teamsList.add(team);
        team = new Team("Belgium", 2);
        teamsList.add(team);
        team = new Team("England", 2);
        teamsList.add(team);
        team = new Team("Italy", 2);
        teamsList.add(team);
        team = new Team("Denmark", 2);
        teamsList.add(team);
        team = new Team("Brazil", 3);
        teamsList.add(team);
        team = new Team("Spain", 3);
        teamsList.add(team);
        team = new Team("Portugal", 3);
        teamsList.add(team);
        team = new Team("Netherlands", 3);
        teamsList.add(team);
        team = new Team("France", 4);
        teamsList.add(team);
        team = new Team("Croatia", 4);
        teamsList.add(team);
        team = new Team("Switzerland", 4);
        teamsList.add(team);
        team = new Team("Argentina", 4);
        teamsList.add(team);
    }
}
