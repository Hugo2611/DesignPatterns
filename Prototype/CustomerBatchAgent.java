package Prototype;

import java.util.ArrayList;
import java.util.List;

public class CustomerBatchAgent {
    private List<IntelligentAgent> agents;

    public CustomerBatchAgent() {
        agents = new ArrayList<>();
        ReferenceBatchAgent referenceBatchAgent = ReferenceBatchAgent.getInstance();
        for (IntelligentAgent agent : referenceBatchAgent.getAgents()) {
            agents.add(agent.duplicate());
        }
    }

    public void processRequest(String request) {
        for (IntelligentAgent agent : agents) {
            System.out.println(agent.processRequest(request));
        }
    }
}
