import java.util.ArrayList;
import java.util.Random;
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
    private int totalPoints;
    private int goalsScored;
    private int rank;    
    /**
     * Constructor for objects of class Team
     */
    public Team(String name,int group)
    {
        this.name = name;
        this.group = group;
        totalPoints = 0;
        goalsScored = 0;
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
    
    public void computeGoals()
    {
        Random rand = new Random(); 
        int value = rand.nextInt(5);
        goalsScored = value;
    }
    
    public int getGoalsScored()
    {
        return goalsScored;
    }
    
    public int getRank()
    {
        return rank;
    }
}