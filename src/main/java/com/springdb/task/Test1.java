package com.springdb.task;

import com.springdb.img.Image;
import com.springdb.img.ImageService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * @Author: Ma HaiYang
 * @Description: MircoMessage:Mark_7001
 */
public class Test1 {
    @Test
    public void testTaskService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TaskService service = context.getBean(TaskService.class);

//        int res = service.add(new Task(1,"抓取",0,new Date()));
//        System.out.println(res);

//        service.update(new Task(1,"任务2",1,new Date()));

        service.delete(1);

        // 查询员工个数
        /*int empCount = empService.findEmpCount();
        System.out.println(empCount);*/
        // 根据员工编号查询员工对象
       /* Emp byEmpno = empService.findByEmpno(7521);
        System.out.println(byEmpno);*/
        /*根据部门编号查询多个员工对象集合*/
        /*List<Emp> emps = empService.findByDeptno(20);
        emps.forEach(System.out::println);*/
        /*增加员工信息*/
        /*int rows = empService.addEmp(new Emp(null, "TOM", "SALESMAN", 7521, new Date(), 2000.0, 100.0, 10));
        System.out.println(rows);*/
        /*根据员工编号修改员工信息*/
        /*int rows = empService.updateEmp(new Emp(7939, "JERRY", "MANAGER", 7839, new Date(), 3000.0, 0.0, 20));
        System.out.println(rows);*/
        /*根据员工编号删除员工信息*/
        /*int rows = empService.deleteEmp(7939);
        System.out.println(rows);*/
    }
}
