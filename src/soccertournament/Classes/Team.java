package soccertournament.Classes;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private final List<Player> playerList = new ArrayList<>();
    private int totalLevel;
    private int totalPoints = 0;

    public Team() {
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", playerList=" + playerList +
                ", totalLevel=" + totalLevel +
                ", points=" + totalPoints +
                '}';
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public int getTotalLevel() {
        return totalLevel;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPlayerList(Player playerList) {
        this.playerList.add(playerList);
    }

    public void setTotalLevel(int totalLevel) {
        this.totalLevel = totalLevel;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints += totalPoints;
    }

    public void resetTotalPoints() {
        this.totalPoints = 0;
    }
}