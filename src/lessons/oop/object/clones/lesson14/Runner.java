package lessons.oop.object.clones.lesson14;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Agent agent = new Agent("Mr. Smith");
        Agent[] agents = make1000Agents(agent);
        for (Agent clone : agents) {
            System.out.println(clone.getName());
        }


    }

    public static Agent[] make1000Agents(Agent agent) throws CloneNotSupportedException {
        Agent[] agents = new Agent[1000];
        for (int i = 0; i < 1000; i++) {
            agents[i] = (Agent) agent.clone();
        }
        return agents;
    }
}
