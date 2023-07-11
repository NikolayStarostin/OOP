package Lesson_3.Task_3.Game.GameVersion;

import java.util.ArrayList;
import java.util.List;

public class EnGame extends AbstractGame {

    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }
}