package com.canal.test;

import com.canal.mapper.PetMapper;
import com.canal.mapper.UserMapper;
import com.canal.po.Pet;
import com.canal.po.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-*.xml"})
public class MapperTest {
    @Autowired
    private SqlSession sqlSession;
    @Autowired
    private PetMapper petMapper;
    @Test
    public void text(){
       PetMapper petMapper=sqlSession.getMapper(PetMapper.class);
        for(int i=0;i<200;i++){
            Pet pet=new Pet();
            Random random = new Random();
            int hp=random.nextInt(81)+20;
            int attack=random.nextInt(81)+20;
            int defence=random.nextInt(81)+20;
            int specialAttack=random.nextInt(81)+20;
            int specialDefence=random.nextInt(81)+20;
            int speed=random.nextInt(81)+20;
            int total=hp+attack+defence+specialAttack+speed;
            String image=random.nextInt(20)+".jpg";
            pet.setHp((byte)hp);
            pet.setAttack((byte)attack);
            pet.setDefence((byte)defence);
            pet.setSpecialAttack((byte)specialAttack);
            pet.setSpecialDefence((byte)specialDefence);
            pet.setSpeed((byte)speed);
            pet.setTotal((short)total);
            pet.setImage(image);
            pet.setUserId(i+1);
            petMapper.insertSelective(pet);
        }
    }
}
