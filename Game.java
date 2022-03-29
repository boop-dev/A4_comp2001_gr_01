import java.util.Random;
/**
 * This class simulates a match between two teams.
 *
 * @author Chiaha Christopher Izuchukwu
 * @version 2022.03.29
 */
public class Game
{
    private Team firstTeam;
    private Team secondTeam;
    private int firstTeamGoals;
    private int secondTeamGoals;
    private Team winner;
    
    /**
     * Constructor for objects of class Game
     */
    public Game(Team team1, Team team2)
    {
        firstTeam = team1;
        secondTeam = team2;
    }
    
    public void playMatch()
    {
        firstTeam.computeGoals();
        secondTeam.computeGoals();
        if (firstTeam.getGoalsScored() > secondTeam.getGoalsScored()){
            firstTeam.addPoints(3);
            winner = firstTeam;
        } else if (firstTeam.getGoalsScored() < secondTeam.getGoalsScored()){
            secondTeam.addPoints(3);
            winner = secondTeam;
        } else {
            firstTeam.addPoints(1);
            secondTeam.addPoints(1);
        }
    } 
}
