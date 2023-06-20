package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class TaskTest {

    @Test
    public void shouldContainedTextTask1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");
        boolean expected = true;
        boolean actual = simpleTask.matches("родителям");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldContainedTextTask2() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        boolean expected = true;
        boolean actual = epic.matches("оло");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldContainedTextTask3() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3ей версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
                );
        boolean expected = true;
        boolean actual = meeting.matches("Нето");
        Assertions.assertEquals(expected, actual);
    }
}
