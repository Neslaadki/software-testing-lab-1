package model_env;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class ArgueTests {

    private Entity entity1 = new Entity("Zafir", "многомерное существо", ArguePositionValuesEnum.IN_EATING);
    private Entity entity2 = new Entity("Zaur", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING);
    private Entity entity3 = new Entity("Zubr", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING);
    private Entity entity4 = new Entity("Zafir", "многомерное существо", ArguePositionValuesEnum.IN_EATING);
    private Entity entity5 = new Entity("Zaura", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING);
    private Entity entity6 = new Entity("Zubria", "многомерное существо", ArguePositionValuesEnum.IN_GAMING);
    private Entity entity7 = new Entity("Zair", "многомерное существо", ArguePositionValuesEnum.IN_EATING);
    private Entity entity8 = new Entity("Zar", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING);
    private Entity entity9 = new Entity("Zub", "многомерное существо", ArguePositionValuesEnum.IN_GAMING);
    private Entity entity10 = new Entity("Zir", "многомерное существо", ArguePositionValuesEnum.IN_EATING);
    private Entity entity11 = new Entity("Aur", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING);
    private Entity entity12 = new Entity("Uber_Black", "многомерное существо", ArguePositionValuesEnum.IN_GAMING);


    @DisplayName("Проверка корректости функции сортировки результатов спора, если никто не спорил")
    @Test
    public void if_array_entities_is_empty() {
        Entity[] empty_entities = new Entity[]{};
        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem, empty_entities);
        argue.do_argue();
        assertFalse(argue.getProblem().isSolving());
    }

    @DisplayName("Проверка корректости функции сортировки результатов спора, если учавствовал один человек")
    @Test
    public void if_array_entities_has_one_entity() {
        Entity[] empty_entities = new Entity[]{entity2};
        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem, empty_entities);
        argue.do_argue();
        assertEquals(problem.getSolution(), entity2.getArguePosition());
    }

    @DisplayName("Проверка корректости функции сортировки результатов спора, у в двух группах аппонентов равное количество мнений")
    @Test
    public void if_array_entities_has_two_or_more_equal_count_positions() {
        Entity[] empty_entities = new Entity[]{entity1, entity2, entity3, entity4};
        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem, empty_entities);
        argue.do_argue();
        assertFalse(problem.isSolving());
    }

    @DisplayName("Проверка корректости функции сортировки результатов спора, если у всех человек разное мнение")
    @Test
    public void if_all_in_array_entities_has_different_positions() {
        Entity[] empty_entities = new Entity[]{entity1, entity2, entity6};
        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem, empty_entities);
        argue.do_argue();
        assertFalse(problem.isSolving());
    }

    @DisplayName("Проверка корректости функции сортировки результатов спора, если у всех человек разное мнение")
    @Test
    public void full_entity_array_test() {
        Entity[] empty_entities = new Entity[]
                {entity1, entity2, entity3, entity4, entity5, entity6, entity7, entity8, entity9, entity10, entity11, entity12};
        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem, empty_entities);
        argue.do_argue();
        assertEquals(problem.getSolution(), ArguePositionValuesEnum.IN_SLEEPING.getRussianName());
    }

    @DisplayName("Проверка корректости функции установки и получения значения проблемы")
    @Test
    public void set_and_get_problem_is_correct() {
        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem, new Entity[]{entity1, entity2});
        argue.setProblem(problem);
        assertEquals(argue.getProblem(), problem);
    }

    @DisplayName("Проверка корректости функции установки и получения значения участников")
    @Test
    public void set_and_get_participants_is_correct() {
        Entity[] empty_entities = new Entity[]{entity1, entity2, entity3};
        Problem problem = new Problem("Извечный спор", "Спор существ о смысле жизни");
        Argue argue = new Argue(problem, new Entity[]{entity1, entity2});
        argue.setParticipants(empty_entities);
        assertEquals(argue.getParticipants(), empty_entities);
    }


}
