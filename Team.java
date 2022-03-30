import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Team here.
 *
 * @author Chiaha Christopher Izuchukwu
 * @version 2022.03.30
 */
public class Team
{
    private String name;
    private int group;
    private int totalPoints;
    private int totalGoalsScored;
    private int rank;
    private int goalDifference;
    /**
     * Constructor for objects of class Team
     */
    public Team(String name)
    {
        this.name = name;
        totalPoints = 0;
        totalGoalsScored = 0;
        goalDifference = 0;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void addPoints(int p)
    {
        totalPoints += p;
    }
    
    public int getPoints()
    {
        return totalPoints;
    }
    
    public int computeGoals()
    {
        Random rand = new Random();
        int goals = rand.nextInt(5);
        totalGoalsScored += goals;
        return goals;
    }

    public int getGoalsScored()
    {
        return totalGoalsScored;
    }

    public void updateGoalsScored(int value){
        totalGoalsScored += value;
    }
    
    public int getRank()
    {
        return rank;
    }

    public void setRank(int value){
        rank = value;
    }

    public int getGoalDifference(){
        return goalDifference;
    }

    public void setGoalDifference(int value){
        goalDifference += value;
    }

}