package model_env;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameTests {

    private Entity[] entities;
    private Game game;

    @BeforeEach
    public void initialise() {
        entities = new Entity[]{
                new Entity("Zafir", "многомерное существо", ArguePositionValuesEnum.IN_EATING),
                new Entity("Zaur", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING),
                new Entity("Zubr", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING)
        };
        game = new Game("брокианского ультра-крикета",
                "забавная игра, заключающаяся в том, чтобы неожиданно ударить человека без видимой на то причины и убежать", entities);
    }

        @DisplayName("Проверка корректости работы функции установки и взятия значения Game.participants")
        @Test
        public void is_get_and_set_participants_correct(){
            Entity[] test_entities = new Entity[]
                    {new Entity("Zaur", "многомерное существо", ArguePositionValuesEnum.IN_SLEEPING)};
            game.setParticipants(null);
            if (game != null && game.getParticipants().length == test_entities.length){
                Assertions.assertArrayEquals(game.getParticipants(), test_entities);
            }else {

            }

    }

}
