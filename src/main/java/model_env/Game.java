package model_env;

import java.util.Date;


public class Game {
    private String name;
    private String description;
    private Entity[] participants;

    public Game(String name, String description, Entity[] participants) {
        this.name = name;
        this.description = description;
        this.participants = participants;
    }

    public void doGame() {}{
        System.out.println("Игра началась (╯°□°)--︻╦╤─ - - - ");
        System.out.println(
                "⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                        "⡇⠄⣤⣤⣤⣄⢀⡄⠄⢀⡄⢠⣤⣤⣤⡀⠄⣀⣤⣤⡀⠄⠄⢸\n" +
                        "⡇⠄⣿⣤⣤⡄⢸⡇⠄⢸⡇⢸⣇⣀⣨⡷⢰⡏⠄⠈⢻⡆⠄⢸\n" +
                        "⡇⠄⣿⣤⣤⣄⠘⢧⣀⣼⠃⢸⡏⠉⢿⣄⣈⣓⣀⣠⡾⠁⠄⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠉⠉⠁⠄⠄⠄⢸\n" +
                        "⡇⠄⣴⠟⠻⣦⠄⣴⠞⠛⢶⡄⢀⡶⠛⢳⣆⢀⣴⢶⡆⠄⠄⢸\n" +
                        "⡇⠄⠄⢀⣠⡿⠄⣿⠄⠄⢸⡇⠄⠄⢀⣴⠟⠄⠄⢸⡇⠄⠄⢸\n" +
                        "⡇⠄⣾⣋⣁⣀⠄⢿⣀⢀⣸⠇⢰⣟⣉⣁⡀⠄⠄⢸⡇⠄⠄⢸\n" +
                        "⡇⠄⠉⠉⠉⠉⠄⠄⠉⠉⠁⠄⠈⠉⠉⠉⠉⠄⠄⠈⠁⠄⠄⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⢀⣤⡴⢶⣿⣿⣿⣿⣷⣦⣤⡀⠄⠄⠄⠄⠄⢸\n" +
                        "⡇⠄⠄⠄⣠⡾⠋⠁⠄⠄⢸⡟⠉⠉⠉⠹⣦⡙⠷⣄⠄⠄⠄⢸\n" +
                        "⡇⠄⠄⣴⡏⠄⠄⠄⠄⢀⡾⠄⠄⠄⠄⠄⠈⠻⣄⡙⢧⡀⠄⢸\n" +
                        "⡇⠄⣼⡟⢦⣄⢀⣤⣶⣿⣷⡀⠄⠄⠄⠄⠄⢠⣿⣿⣿⣷⠄⢸\n" +
                        "⡇⢠⡟⠄⠄⢸⣿⣿⣿⣿⣿⣿⣦⣤⣤⠴⠶⢿⣿⣿⣿⣿⡇⢸\n" +
                        "⡇⢸⡇⠄⠄⠄⣿⣿⣿⣿⣿⣿⠃⠄⠄⠄⠄⠈⢿⣿⣿⣿⡇⢸\n" +
                        "⡇⠈⣷⠄⠄⣠⡟⠻⠿⠿⣿⡁⠄⠄⠄⠄⠄⠄⣠⡟⠉⣸⠃⢸\n" +
                        "⡇⠄⠹⣷⣴⠏⠄⠄⠄⠄⠈⢳⡄⠄⠄⠄⠄⣠⡏⠄⢰⠟⠄⢸\n" +
                        "⡇⠄⠄⠙⣿⣧⠄⠄⠄⠄⠄⠄⣻⣤⣤⣤⣶⡏⢀⣴⠏⠄⠄⢸\n" +
                        "⡇⠄⠄⠄⠈⠙⢷⣶⡦⢤⣤⣴⣿⣿⣿⣿⣿⡿⠟⠁⠄⠄⠄⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠈⠙⠛⠓⠿⠿⠟⠛⠋⠉⠄⠄⠄⠄⠄⠄⢸\n" +
                        "⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸\n" +
                        "⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉"
        );
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

    public Entity[] getParticipants() {
        return participants;
    }

    public void setParticipants(Entity[] participants) {
        this.participants = participants;
    }
}
