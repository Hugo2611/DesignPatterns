package Composite;


public abstract class AbstractFile {
    protected String name;
    protected int size;

    public AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void add(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    public void remove(AbstractFile file) {
        throw new UnsupportedOperationException();
    }

    public int getSize() {
        return size;
    }

    public void display(String indent) {
        throw new UnsupportedOperationException();
    }
}
