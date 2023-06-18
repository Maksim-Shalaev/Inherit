package ru.netology;

public class Epic extends Task {

    protected String subTasks;

    public Epic(int id, String subTasks) {
        super(id);
        this.subTasks = subTasks;
    }

    public String getSubTasks() {
        return subTasks;
    }
}
