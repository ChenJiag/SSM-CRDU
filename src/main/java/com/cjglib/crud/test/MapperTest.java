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
 * ����DAO��Ĺ���
 * @author 13402
 *����Spring �ĵ�Ԫ���ԣ������Զ�ע����������Ҫ�����
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	
	
	/**
	 * ���Բ���
	 */
	@Test
	public void testCRDU(){
		//1.����Spring ����  2.��������ȡ��Mapper 
		 
		System.out.print(departmentMapper);
    		
	}
	

}
