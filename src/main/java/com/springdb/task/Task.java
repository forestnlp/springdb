package com.springdb.task;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    private int id;
    private String name;
    private int status;
    private Date recenttime;
}
