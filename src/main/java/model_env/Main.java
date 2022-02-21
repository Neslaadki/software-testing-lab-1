package model_env;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Entity entity1 = new Entity("Zafir", "многомерное существо", ArguePositionValuesEnum.IN_EATING);
        Entity entity2 = new Entity("Zaur", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING);
        Entity entity3 = new Entity("Zubr", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING);

        Entity[] entities = new Entity[] {entity1, entity2,entity3};

        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem,entities, new Date());

        Game game = new Game("брокианского ультра-крикета",
                "забавная игра, заключающаяся в том, чтобы неожиданно ударить человека без видимой на то причины и убежать",entities);
        argue.do_argue();
        if (problem.isSolving()) game.doGame();
        System.out.println(problem.getSolution() + " " + problem.isSolving());
    }
}
