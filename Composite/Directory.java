package Composite;
import java.util.ArrayList;
import java.util.List;


public class Directory extends AbstractFile {
    private List<AbstractFile> children = new ArrayList<>();

    public Directory(String name) {
        super(name, 0);
    }

    @Override
    public void add(AbstractFile file) {
        children.add(file);
        size += file.getSize();
    }

    @Override
    public void remove(AbstractFile file) {
        children.remove(file);
        size -= file.getSize();
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Directory: " + name);
        for (AbstractFile file : children) {
            file.display(indent + "  ");
        }
        System.out.println(indent + "Taille du dossier " + name + ": " + size + " Ko");
    }
}
