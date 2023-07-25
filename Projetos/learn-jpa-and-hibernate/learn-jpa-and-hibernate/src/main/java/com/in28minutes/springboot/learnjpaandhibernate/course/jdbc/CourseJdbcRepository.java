package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import com.in28minutes.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbctemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, author)
                values(?, ?, ?); 
            """;

    private static String DELETE_QUERY =
            """
                delete from course where id = ?
            """;

    private static String SELECT_QUERY_BY_ID =
            """
                select * from course where id = ?
            """;

    public void insert(Course course){

        springJdbctemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());

    }

    public void deleteById(long id){

        springJdbctemplate.update(DELETE_QUERY, id);

    }

    public Course findById(long id){
        //ResultSet -> Bean => Row Mapper =>
        return springJdbctemplate.queryForObject(SELECT_QUERY_BY_ID,
                new BeanPropertyRowMapper<>(Course.class), id);
    }

}