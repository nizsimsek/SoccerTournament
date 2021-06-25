package soccertournament.Classes;

import soccertournament.GUI.FileForm;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tournament {

    private final List<Team> teams = new ArrayList<>();

    public File ReadFile(String filePath) {
        return new File(filePath);
    }

    public void GenerateTeam() throws IOException {
        String filePath = FileForm.filePath();
        Team team = new Team();
        String[] splittedTeam;
        String[] splittedPlayer;
        Scanner myReader = new Scanner(ReadFile(filePath));
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            splittedTeam = line.split("-");
            splittedPlayer = line.split(" ");
            if (splittedTeam.length == 2) {
                team = new Team();
                team.setTeamName(splittedTeam[1]);
                teams.add(team);
            }
            if (splittedPlayer.length == 3) {
                Player player = new Player(splittedPlayer[0], splittedPlayer[1], splittedPlayer[2], GenerateLevel());
                team.setPlayerList(player);
                team.setTotalLevel(player.getLevel());
            }
        }
    }

    public int GenerateLevel() {
        return (int) ((Math.random() * 10) + 1);
    }

    public List<Team> GetResultsForTable() {
        return teams;
    }

    public void StartTournament() {
        for (int i = 0; i < this.GetResultsForTable().size(); i++) {
            Team firstTeam = this.GetResultsForTable().get(i);
            firstTeam.resetTotalPoints();
            for (int j = 0; j < this.GetResultsForTable().size(); j++) {
                Team secondTeam = this.GetResultsForTable().get(j);
                if (firstTeam.getTotalLevel() > secondTeam.getTotalLevel()) {
                    firstTeam.setTotalPoints(3);
                } else if (firstTeam.getTotalLevel() == secondTeam.getTotalLevel()){
                    firstTeam.setTotalPoints(1);
                }
            }
        }
    }
}