package model_env;

public class Problem {
    private String name;
    private String description;
    private boolean isSolving;
    private String solution;

    public Problem(String name, String description) {
        this.name = name;
        this.description = description;
        this.isSolving = false;
        this.solution = "";
    }

    public boolean isSolving() {
        return isSolving;
    }

    public void setSolving(boolean solving) {
        isSolving = solving;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
