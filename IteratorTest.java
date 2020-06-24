public class IteratorTest {
    public static void main(String[] args) {
        GameListAggregate gameListAggregate = new GameListAggregate();
        Iterator iterator = gameListAggregate.createIterator();
        gameListAggregate.add(new Game("みんなでゴルフ", 3700));
        gameListAggregate.add(new Game("ファイナルファンタジア", 7300));
        gameListAggregate.add(new Game("ロケットモンスター", 5400));
        gameListAggregate.add(new Game("サイコロの達人", 5200));

        iterator.first(); // まず探す場所を先頭位置にしてもらう
        while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
            Game game = (Game)iterator.getItem();
            System.out.printf(game.getName());
            iterator.next();
        }
    }
}