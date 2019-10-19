package me.test.datatest;

import me.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseDataTest extends BaseTest {

    @Autowired
    public me.marmoo.data.mapper.mallAddressMapper mapper;

    @Test
    public void Test1(){
        mapper.getOneByPK(1L);
    }
}
