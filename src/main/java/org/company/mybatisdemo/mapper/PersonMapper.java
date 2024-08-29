package org.company.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.company.mybatisdemo.entity.Person;

import java.util.List;

@Mapper
public interface PersonMapper {

    boolean deleteByIds(List<Integer> list);

    boolean deleteById(Integer id);



    boolean updateById(Person person);


    boolean insert1(@Param("age") Integer age,
                    @Param("person") Person person);

    boolean insert(@Param("age") Integer age,
                   @Param("name")  String name);

    long total();

    List<Person> findByPerson(Person person);

//    Person findById(Integer id);
    List<Person> find2();

    List<Person> find1(String tableName);
    List<Person> find();

    Person findById(Integer id);

}
