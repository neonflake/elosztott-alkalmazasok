package hu.gdf;

/**
 * Elosztott alkalmazások beadandó feladat
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class ElosztottAlkalmazasok {

    public static void main(String[] args) {
        GameDemo game = new GameDemo();
        game.showActors();
        game.doSomeAction();
        game.showActors();
    }
}
