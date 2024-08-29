package org.company.mybatisdemo;

import com.mysql.cj.MysqlxSession;
import org.company.mybatisdemo.dto.OrderOrderItemDTO;
import org.company.mybatisdemo.dto.OrderUserDTO;
import org.company.mybatisdemo.entity.Order;
import org.company.mybatisdemo.entity.Person;
import org.company.mybatisdemo.mapper.OrderMapper;

import org.company.mybatisdemo.mapper.PersonMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class MybatisdemoApplicationTests {

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Test
    void  test1(){



//        List<OrderOrderItemDTO> orderMapper1  = orderMapper.find5();
//        for(OrderOrderItemDTO order:orderMapper1){
//            System.out.println(order);
//        }

//        List<OrderUserDTO> orderMapper1  = orderMapper.findOrdersWithUser3();
//        for(OrderUserDTO order:orderMapper1){
//            System.out.println(order);
//        }
    }

    @Test
    void contextLoads() {


//        Person person = new Person(6,"zs",23,"色");
//        boolean b = personMapper.updateById(person);
//        System.out.println(b);


//        List<Integer> list = Arrays.asList(7,8);
//        boolean b =personMapper.deleteByIds(list);
//        System.out.println(b);

//        personMapper.deleteByIds(new Integer[]{6,7});

//                List<Person> byPerson = personMapper.find();
//        System.out.println(byPerson);



//        boolean b = personMapper.deleteById(1);
//        System.out.println(b);

//        Person person = new Person(1,"asd",23,"色");
//        boolean b = personMapper.updateById(person);
//        System.out.println(b);



//        Person person = new Person(null,"asd",null,"色");
//        boolean standard = personMapper.insert1(21, person);
//        System.out.println(standard);


//        long total = personMapper.total();
//        System.out.println(total);
//        Person byPerson = personMapper.findById(1);
//        System.out.println(byPerson);

//        List<Person> byPerson = personMapper.find();
//        System.out.println(byPerson);


//        List<Person> byPerson = personMapper.find1("person");
//        System.out.println(byPerson);


//        Person person = new Person(null,null,null,"色");
//        List<Person> byPerson = personMapper.findByPerson(person);
//        System.out.println(byPerson);


//        List<Person> people = personMapper.find2();
//        for(Person person:people){
//            System.out.println(person);
//        }
    }

}
