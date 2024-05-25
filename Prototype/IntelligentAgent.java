package Prototype;

public abstract class IntelligentAgent implements Cloneable {
    public abstract IntelligentAgent duplicate();

    public abstract String processRequest(String request);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
