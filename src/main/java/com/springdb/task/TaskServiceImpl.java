package com.springdb.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao dao;

    @Override
    public int add(Task task) {
        return dao.add(task);
    }

    @Override
    public int update(Task task) {
        return dao.update(task);
    }

    @Override
    public int delete(int taskId) {
        return dao.delete(taskId);
    }
}
