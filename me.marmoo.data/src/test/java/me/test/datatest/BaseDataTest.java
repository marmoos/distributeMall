package me.test.datatest;

import me.marmoo.common.domain.T_MALL_USER;
import me.test.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.redis.core.RedisTemplate;

public class BaseDataTest extends BaseTest {

    @Autowired
    public me.marmoo.data.mapper.mallAddressMapper mapper;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void Test1(){
        mapper.getOneByPK(1L);
    }

    @Test
    public void test2(){
        System.out.println(redisTemplate.opsForValue().get("a"));
    }
    @Test
    public void test3(){
        redisTemplate.opsForValue().set("a","001");
    }
    @Test
    public void test4(){
        mongoTemplate.insert(T_MALL_USER.builder().yh_mch("sad").yh_nch("ggds").yh_mm("dfds").yh_shjh("dsvds").yh_tx("Dsv").yh_xm("DSv").yh_yx("dfvdf").build());
    }

}
