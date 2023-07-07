package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    private JdbcTemplate springJdbctemplate;

    private static String INSERT_QUERY =
            """
                insert into course (id, name, autor)
                values(1, 'Learn AWS', 'in28minutes'); 
            """;

    public void insert(){

        springJdbctemplate.update("");

    }

}
