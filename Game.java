public class Game {
    private String gameName; 
    private int Players;
    private int score;
    public Game(String nameOfGame, int playerNum) {
        Players = playerNum;
        gameName = nameOfGame;
    }
    public String getGameName() {
        return gameName;
    }
    public int getPlayers() {
        return Players;
    }
    public int getScore() {
        return score;
    }
    public void addPlayer() {
        Players++;
    }
    public void increaseScore(int increase) {
        score = score + increase;
    }
    public double averageScorePerPlayer() {
        return (double) score / (double) Players;
    }
    public boolean isGameOver() {
        return (score>=9);
    }
}