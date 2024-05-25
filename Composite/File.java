package Composite;

public class File extends AbstractFile {
    public File(String name, int size) {
        super(name, size);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "File: " + name + " (" + size + " Ko)");
    }
}
