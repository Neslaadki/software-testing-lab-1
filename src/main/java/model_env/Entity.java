package model_env;


public class Entity {

    private String name;
    private String description;
    private ArguePositionValuesEnum arguePosition;

    public Entity(String name, String description, ArguePositionValuesEnum arguePosition) {
        this.name = name;
        this.description = description;
        this.arguePosition = arguePosition;
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

    public String getArguePosition() {
        return arguePosition.getRussianName();
    }

    public void setArguePosition(ArguePositionValuesEnum arguePosition) {
        this.arguePosition = arguePosition;
    }
}





