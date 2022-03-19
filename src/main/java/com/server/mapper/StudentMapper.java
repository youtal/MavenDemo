package com.server.mapper;

import com.server.obj.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {
    @Select("select * from student where sex = #{sex}")
    public List<Student> getStudentBySex(String sex);

    @Select("select * from student where sid = #{id}")
    public Student getStudentById(int id);
}
