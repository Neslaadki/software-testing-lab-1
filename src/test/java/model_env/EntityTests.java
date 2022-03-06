package model_env;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class EntityTests {

    private Entity entity;

    @BeforeEach
    public void initialise(){
        entity = new Entity("Zafir", "многомерное существо", ArguePositionValuesEnum.IN_EATING);
    }

    @DisplayName("Проверка корректости работы функции установки и взятия значения Entity.description")
    @Test
    public void is_get_and_set_description_methods_correct(){
        String test_description = "человек прямоногий";
        entity.setDescription(test_description);
        Assertions.assertEquals(entity.getDescription(),test_description);
    }

    @DisplayName("Проверка корректости работы функции установки и взятия значения Entity.name")
    @Test
    public void is_get_and_set_name_methods_correct(){
        String test_name = "Джигурда";
        entity.setName(test_name);
        Assertions.assertEquals(entity.getName(),test_name);
    }

}
