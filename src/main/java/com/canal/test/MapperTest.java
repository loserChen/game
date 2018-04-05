package com.canal.test;

import com.canal.mapper.UserMapper;
import com.canal.po.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-*.xml"})
public class MapperTest {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SqlSession sqlSession;
    @Test
    public void text(){
       UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        for(int i=0;i<100;i++){
            User user=new User();
            user.setGold(0);
            user.setPassword("123456");
            String uid= UUID.randomUUID().toString().substring(0,5)+i;
            user.setUsername(uid+i);
            userMapper.insertSelective(user);
        }
        System.out.println(userMapper);
    }
}
