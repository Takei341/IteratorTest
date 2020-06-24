public class IteratorTest {
    public static void main(String[] args) {
        GameListAggregate gameListAggregate = new GameListAggregate();
        Iterator iterator = gameListAggregate.createIterator();
        gameListAggregate.add(new Game("�݂�ȂŃS���t", 3700));
        gameListAggregate.add(new Game("�t�@�C�i���t�@���^�W�A", 7300));
        gameListAggregate.add(new Game("���P�b�g�����X�^�[", 5400));
        gameListAggregate.add(new Game("�T�C�R���̒B�l", 5200));

        iterator.first(); // �܂��T���ꏊ��擪�ʒu�ɂ��Ă��炤
        while ( ! iterator.isDone() ) { // �܂�����H �܂������I
            Game game = (Game)iterator.getItem();
            System.out.printf(game.getName());
            iterator.next();
        }
    }
}