package oop_lab9;

public class Job {
    private String position;
    private double salay;
    //con

    public Job(String position, double salay) {
        this.position = position;
        this.salay = salay;
    }
    //get and set

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalay() {
        return salay;
    }

    public void setSalay(double salay) {
        this.salay = salay;
    }
    //to

    @Override
    public String toString() {
        return "Job{" +
                "position='" + position + '\'' +
                ", salay=" + salay +
                '}';
    }
}
