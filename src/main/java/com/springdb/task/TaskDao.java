package com.springdb.task;

public interface TaskDao {
    int add(Task task);
    int update(Task task);
    int delete(int taskId);
}
