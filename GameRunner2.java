public class GameRunner2 {
    public static void main(String[] args) {
        Game myGame = new Game("Monopoly", 4);
        System.out.println(myGame.getScore());
        System.out.println(myGame.getPlayers()); 
        System.out.println(myGame.isGameOver());
        System.out.println(myGame.averageScorePerPlayer());

        myGame.addPlayer();
        myGame.addPlayer();

        myGame.increaseScore(12);
        System.out.println(myGame.getScore());
        System.out.println(myGame.getPlayers()); 
        System.out.println(myGame.isGameOver());
        System.out.println(myGame.averageScorePerPlayer());

        myGame.addPlayer();
        myGame.addPlayer();
        
        myGame.increaseScore(12);
        System.out.println(myGame.getScore());
        System.out.println(myGame.getPlayers()); 
        System.out.println(myGame.isGameOver());
        System.out.println(myGame.averageScorePerPlayer());
    }
}