package com.cjglib.crud.test;

import javax.sound.midi.VoiceStatus;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cjglib.crud.bean.Department;
import com.cjglib.crud.dao.DepartmentMapper;

/**
 * 测试DAO层的工作
 * @author 13402
 *利用Spring 的单元测试，可以自动注入我们所需要的组件
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	
	
	/**
	 * 测试部门
	 */
	@Test
	public void testCRDU(){
		//1.创建Spring 容器  2.从容器中取出Mapper 
		 
		System.out.print(departmentMapper);
    		
	}
	

}
