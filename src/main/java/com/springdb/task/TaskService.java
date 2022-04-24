package com.springdb.task;

public interface TaskService {
    int add(Task task);
    int update(Task task);
    int delete(int taskId);
}
