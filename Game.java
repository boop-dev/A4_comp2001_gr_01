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
    private int dayNumber;
    /**
     * Constructor for objects of class Game
     */
    public Game(Team team1, Team team2, int dayNumber)
    {
        firstTeam = team1;
        secondTeam = team2;
        dayNumber = dayNumber;
    }
    
    public void playMatch()
    {
        int x = firstTeam.computeGoals();
        int y = secondTeam.computeGoals();
        firstTeam.setGoalDifference(x-y);
        secondTeam.setGoalDifference(y-x);
        if (x > y){
            firstTeam.addPoints(3);
            winner = firstTeam;
        } else if (x < y){
            secondTeam.addPoints(3);
            winner = secondTeam;
        } else {
            winner = decideWinner(firstTeam, secondTeam);
            firstTeam.addPoints(1);
            secondTeam.addPoints(1);
        }
        firstTeam.updateMatchesPlayed(firstTeam, secondTeam);
        secondTeam.updateMatchesPlayed(firstTeam, secondTeam);
    }

    public Team decideWinner(Team t1, Team t2){
        if (t1.getGoalDifference() > t2.getGoalDifference()){
            winner = firstTeam;
        } else if (t1.getGoalDifference() < t2.getGoalDifference()){
            winner = secondTeam;
        } else {
            winner = firstTeam;
        }
        return winner;
    }

    public Team getWinner(){
        return winner;
    }
}


