package com.springdb.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TaskDaoImpl implements TaskDao {
    @Autowired
    private JdbcTemplate template;

    @Override
    public int add(Task task) {
        String sql ="insert into task(id,name,status,recent_time) values (?,?,?,?)";
        Object[] args = {task.getId(),task.getName(),task.getStatus(),task.getRecenttime()};
        return template.update(sql,args);
    }

    @Override
    public int update(Task task) {
        String sql ="update task set name = ?,status=?,recent_time=? where id=?";
        Object[] args = {task.getName(),task.getStatus(),task.getRecenttime(),task.getId()};
        return template.update(sql,args);
    }

    @Override
    public int delete(int taskId) {
        String sql ="delete from task where id=?";
        return template.update(sql,taskId);
    }
}
