package lab3.Visitor;

public class TimeVisitor implements Visitor{
    private int totalTime;

    @Override
    public void visit(Song song) {
        totalTime += song.getTime();
    }

    @Override
    public void visit(Movie movie) {
        totalTime += movie.getTime();
    }

    @Override
    public void visit(Book book) {
        totalTime += book.getPageNr();
    }

    public int getResult() {
        return totalTime;
    }
}
