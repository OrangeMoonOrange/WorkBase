package test;

import bean.Emp;
import mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @Author: xk
 * @Date: 2021/7/6 10:08
 * @Desc:
 */
public class test01 {

    SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void before() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testselectEmpById() throws Exception {
        SqlSession session = sqlSessionFactory.openSession();
        EmpMapper mapper = session.getMapper(EmpMapper.class);
        Emp emp = mapper.selectEmpById(1);
        System.out.println(emp);
        session.close();

    }


}
