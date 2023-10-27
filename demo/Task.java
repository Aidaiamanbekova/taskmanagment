package com.example.demo;

public interface Task {
    void setTask(String taskName, String taskDescription);
    void setTaskName(String taskName);
    String getTaskName();
    String getDescription();
    void setTaskDescription(String taskDescription);
    void markAsComplete();
    void setPriority(Priority priority);
    Priority getPriority();
    void setDeadline(Date date);
    Date getDeadline();
}