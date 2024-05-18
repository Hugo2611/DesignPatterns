package Prototype;

public class User {
    public static void main(String[] args) {
        ReferenceBatchAgent referenceBatchAgent = ReferenceBatchAgent.getInstance();
        referenceBatchAgent.addAgent(new MobileAgent());
        referenceBatchAgent.addAgent(new InformationAgent());
        referenceBatchAgent.addAgent(new InterfaceAgent());
        referenceBatchAgent.addAgent(new CollaborativeAgent());

        CustomerBatchAgent customerBatchAgent = new CustomerBatchAgent();
        customerBatchAgent.processRequest("Quelle est la définition de l'intelligence artificielle?");
    }
}
