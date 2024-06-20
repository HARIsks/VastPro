package oops;

public class Professor extends Person {
    private int booksPublished;

    public Professor() {
        super();
        this.booksPublished = 0;
    }

    public Professor(String name, int booksPublished) {
        super(name);
        this.booksPublished = booksPublished;
    }

    public void print() {
        System.out.println("Professor Name: " + getName());
        System.out.println("Books Published: " + booksPublished);
    }

    @Override
    public boolean isOutstanding() {
        return booksPublished > 4;
    }
}

