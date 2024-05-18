package Prototype;
import java.util.ArrayList;
import java.util.List;

public class ReferenceBatchAgent {
    private List<IntelligentAgent> agents;
    private static ReferenceBatchAgent instance;

    private ReferenceBatchAgent() {
        agents = new ArrayList<>();
    }

    public static synchronized ReferenceBatchAgent getInstance() {
        if (instance == null) {
            instance = new ReferenceBatchAgent();
        }
        return instance;
    }

    public void addAgent(IntelligentAgent agent) {
        agents.add(agent);
    }

    public void removeAgent(IntelligentAgent agent) {
        agents.remove(agent);
    }

    public List<IntelligentAgent> getAgents() {
        return new ArrayList<>(agents);
    }
}
