package com.halle.core.service;

import com.halle.core.bean.TestTb;
import com.halle.core.dao.TestTbDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation =  Propagation.NESTED)
public class TestDBServiceImpl implements TestDBService{
    @Autowired
    private TestTbDao testTbDao;

    @Override
    public void insertTestDB(TestTb testTb){

        testTbDao.insertTestTb(testTb);

        throw new RuntimeException();
    }

}
