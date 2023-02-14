package LifeGame2;

public class Main {
    public static void main(String[] args) {
        final int X = 11;
        final int Y = 11;
        int[][] map = new int[X][Y];

        lifeGame lg = new lifeGame(map);
        lg.genRanmap(31);

        Board board = new Board(lg.getMap());
    }
}
