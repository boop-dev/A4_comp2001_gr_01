import java.util.Random;
/**
 * This class simulates a match between two teams.
 *
 * @author Chiaha Christopher Izuchukwu
 * @version 2021.03.29
 */
public class Game
{
    private Team firstTeam;
    private Team secondTeam;
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
        int x = firstTeam.computeGoals();
        int y = secondTeam.computeGoals();
        firstTeam.setGoalDifference(x);
        firstTeam.setGoalDifference(-y);
        secondTeam.setGoalDifference(y);
        secondTeam.setGoalDifference(-x);
        if (x > y){
            firstTeam.addPoints(3);
            winner = firstTeam;
        } else if (x < y){
            secondTeam.addPoints(3);
            winner = secondTeam;
        } else {
            firstTeam.addPoints(1);
            secondTeam.addPoints(1);
        }
    }

    public Team getWinner(){
        return winner;
    }
}


