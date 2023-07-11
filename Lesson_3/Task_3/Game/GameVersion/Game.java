package Lesson_3.Task_3.Game.GameVersion;

import Lesson_3.Task_3.Game.Answer;
import Lesson_3.Task_3.Game.GameStatus;

public interface Game {
    void start(int lengthWord, int countTry);

    Answer inputValue(String value);

    GameStatus getGameStatus();
}
