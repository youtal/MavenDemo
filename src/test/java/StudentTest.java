import com.server.Main;
import com.server.mapper.StudentMapper;
import com.server.obj.SqlSessionGenerator;
import com.server.obj.Student;
import lombok.extern.java.Log;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@Log
public class StudentTest {
    @Test
    public void t1(){
        Student s = new Student()
                .setId(25)
                .setName("John")
                .setAge(20)
                .setSex("M")
                .setTid(23);
        System.out.println(s);
    }

    @DisplayName("StudentMapperTest")
    @RepeatedTest(2)
    public void StudentMapperTest(){
        SqlSession session = SqlSessionGenerator.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student s = mapper.getStudentById(10035);
        System.out.println(s);
        System.out.println(mapper.getStudentBySex("male"));
    }

    public void MainTest(){
    }
}
