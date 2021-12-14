package javaMiniProjects;

public class Droid {
    String droid;
    double batteryLevel;
    boolean charged;
    public Droid(String droidsName) {
        droid = droidsName;
        batteryLevel = 100;
        charged = true;
    }
    @Override
    public String toString() {
        return "Hello, I'm the droid: " + droid;
    }

    public void perfomTask(String task){
        System.out.println(droid + "is perfoming task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport(){
        double battery = batteryLevel;
        System.out.println("I'm running in: " + battery + "%");
    }
    public boolean energyTransfer(boolean chargeMe){
        if (batteryLevel >= 30.0){
            return chargeMe;
        } else {
            return !chargeMe;
        }
    }
    public static void main(String[] args){
        Droid droidsName = new Droid("Codey");
        System.out.println(droidsName);
        droidsName.perfomTask("Dance");
        droidsName.energyReport();
        System.out.println(droidsName.energyTransfer(droidsName.charged));


    }


}
