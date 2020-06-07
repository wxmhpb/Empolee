package com.atguigu.crud.test;

import com.atguigu.crud.bean.Department;
import com.atguigu.crud.dao.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations ={"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class MapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;
    @Test
    public void test(){

        System.out.println(departmentMapper);

        departmentMapper.insertSelective(new Department(null,"产品管理"));
    }
}
