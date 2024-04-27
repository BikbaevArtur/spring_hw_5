package ru.bikbaev.hw_5.spring_hw_5.model;

public enum TaskStatus {

    NOT_STARTED, IN_PROGRESS, COMPLETED;

    public static TaskStatus statusUpdate(String  status){

        return switch (status) {
            case "start" -> IN_PROGRESS;
            case "done" -> COMPLETED;
            default -> NOT_STARTED;
        };


    }
}
