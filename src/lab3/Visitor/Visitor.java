package lab3.Visitor;

public interface Visitor {
    void visit(Song song);
    void visit(Movie movie);
    void visit(Book book);
}
