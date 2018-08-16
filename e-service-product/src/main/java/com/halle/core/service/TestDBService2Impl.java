package com.halle.core.service;

import com.halle.core.bean.TestTb;
import com.halle.core.dao.TestTbDao;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/*@Service
@Transactional(propagation = Propagation.REQUIRED)*/
public class TestDBService2Impl implements  TestDBService2 {
    @Autowired
    private TestDBService  testDBServiceImpl;
    @Autowired
    private TestTbDao testTbDao;

    @Override
    public void insertTestDB(TestTb testTb){

        testTbDao.insertTestTb(testTb);
        try {
            TestTb testTb1 = new TestTb();
            testTb1.setName("范冰冰4");
            testTb1.setBirthday(new Date());
            testDBServiceImpl.insertTestDB(testTb);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        //throw new RuntimeException();
    }

}
