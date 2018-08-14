package com.halle;

import com.halle.core.bean.TestTb;
import com.halle.core.dao.TestTbDao;
import com.halle.core.service.TestDBService;
import com.halle.core.service.TestDBService2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * 测试类  junit + Spring 
 * @author lx
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestTbTest {

	@Autowired
	private TestTbDao testTbDao;


    @Autowired
    private TestDBService2 testDBService2;

    @Autowired
    private TestDBService testDBService;
	
	@Test
	public void testDaoInsert() throws Exception {
		TestTb testTb = new TestTb();
		testTb.setName("范冰冰2");
		testTb.setBirthday(new Date());

        testTbDao.insertTestTb(testTb);
		
		
	}


    @Test
    public void testTransctionServiceInsert() throws Exception {
        TestTb testTb = new TestTb();
        testTb.setName("范冰冰3");
        testTb.setBirthday(new Date());

        testDBService.insertTestDB(testTb);


    }

    @Test
    public void testTransctionPropagationServiceInsert() throws Exception {
        TestTb testTb = new TestTb();
        testTb.setName("范冰冰3");
        testTb.setBirthday(new Date());

        testDBService2.insertTestDB(testTb);


    }
}
