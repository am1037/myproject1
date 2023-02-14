package LifeGameByClass;

public class Main {
    public static void main(String[] args) {
        final int X = 25;
        final int Y = 35;
        int[][] map = new int[X][Y];

        lifeGame lg = new lifeGame(map);
        lg.genRanmap(31);

        Board board = new Board(lg.getMap());
    }
}
