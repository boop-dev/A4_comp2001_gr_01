import java.util.ArrayList;

/**
 * Simulates the fifa world cup
 *
 * @author Chiaha Christopher Izuchukwu
 * @version 2022.03.30
 */
public class FifaWorldCup
{
    private ArrayList<Team> teamsList;

    public FifaWorldCup(ArrayList<Team> teamsList) {
        this.teamsList = teamsList;
    }


    public void showGroupResults(int groupNumber, int dayNumber) {
        
    }
    
    public void showResultsOfDay(int dayNumber) {
        // for every game in that day print scores
        // add printResults function to game class
    }
    
    public void showGroupRanking(int groupNumber) {
        
    }
    
    public void showTeamMatches(String teamName) {
        
    }
    
    public void showTheChampion() {
        System.out.println("Winner " + worldCupSimulator().getName());
    }
    
     public void setUpTeams(ArrayList<Team> teamsList) {
        Team team = new Team("USA");
        teamsList.add(team);
        team = new Team("Uruguay");
        teamsList.add(team);
        team = new Team("Germany");
        teamsList.add(team);
        team = new Team("Mexico");
        teamsList.add(team);
        team = new Team("Belgium");
        teamsList.add(team);
        team = new Team("England");
        teamsList.add(team);
        team = new Team("Italy");
        teamsList.add(team);
        team = new Team("Denmark");
        teamsList.add(team);
        team = new Team("Brazil");
        teamsList.add(team);
        team = new Team("Spain");
        teamsList.add(team);
        team = new Team("Portugal");
        teamsList.add(team);
        team = new Team("Netherlands");
        teamsList.add(team);
        team = new Team("France");
        teamsList.add(team);
        team = new Team("Croatia");
        teamsList.add(team);
        team = new Team("Switzerland");
        teamsList.add(team);
        team = new Team("Argentina");
        teamsList.add(team);


    }

    private Team worldCupSimulator(){

        Group group1 = new Group("Group 1", this.teamsList.get(0), this.teamsList.get(1), this.teamsList.get(2), this.teamsList.get(3));
        Group group2 = new Group("Group 2", this.teamsList.get(4), this.teamsList.get(5), this.teamsList.get(6), this.teamsList.get(7));
        Group group3 = new Group("Group 3", this.teamsList.get(8), this.teamsList.get(9), this.teamsList.get(10), this.teamsList.get(11));
        Group group4 = new Group("Group 4", this.teamsList.get(12), this.teamsList.get(13), this.teamsList.get(14), this.teamsList.get(15));


        // this block simulates the group stage
        ArrayList<Team> g1Winners = groupStageSim(group1);
        ArrayList<Team> g2Winners = groupStageSim(group2);
        ArrayList<Team> g3Winners = groupStageSim(group3);
        ArrayList<Team> g4Winners = groupStageSim(group4);


        // this block simulates the knockout stages for all the group stage winners
        Team k1Winner = knockoutStageSim(g1Winners);
        Team k2Winner = knockoutStageSim(g2Winners);
        Team k3Winner = knockoutStageSim(g3Winners);
        Team k4Winner = knockoutStageSim(g4Winners);

        ArrayList<Team> semi1 = new ArrayList<Team>(); // teams in first semifinal
        ArrayList<Team> semi2 = new ArrayList<Team>(); // teams in second semifinal

        semi1.add(k1Winner);
        semi1.add(k2Winner);
        semi2.add(k3Winner);
        semi2.add(k4Winner);

        // this block will simulate the semifinals
        Team finalist1 = knockoutStageSim(semi1);
        Team finalist2 = knockoutStageSim(semi2);

        ArrayList<Team> finalists = new ArrayList<Team>();
        finalists.add(finalist1);
        finalists.add(finalist2);


        // this block simulates the finals

        return knockoutStageSim(finalists);

    }

    public ArrayList<Team> groupStageSim(Group group){
        Game game1 = new Game(group.teams().get(0), group.teams().get(1));
        Game game2 = new Game(group.teams().get(2), group.teams().get(3));
        Game game3 = new Game(group.teams().get(0), group.teams().get(2));
        Game game4 = new Game(group.teams().get(1), group.teams().get(3));
        Game game5 = new Game(group.teams().get(0), group.teams().get(3));
        Game game6 = new Game(group.teams().get(1), group.teams().get(2));

        game1.playMatch();
        game2.playMatch();
        game3.playMatch();
        game4.playMatch();
        game5.playMatch();
        game6.playMatch();

        return group.calculateRanking();

    }

    public Team knockoutStageSim(ArrayList<Team> groupStageWinners){
        Game oneVsOne = new Game(groupStageWinners.get(0), groupStageWinners.get(1));
        return oneVsOne.getWinner();
    }
}

