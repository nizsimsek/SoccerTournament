package soccertournament.Classes;

public class Player {
    private String name;
    private String surname;
    private String number;
    private int level;

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", number=" + number +
                ", level=" + level +
                '}';
    }

    public Player(Object name, Object surname, Object number, int level) {
        this.name = (String) name;
        this.surname = (String) surname;
        this.number = (String) number;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return number;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
