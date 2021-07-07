package mapper;

import bean.Emp;

/**
 * @Author: xk
 * @Date: 2021/7/6 9:49
 * @Desc:
 */
public interface EmpMapper {

    Emp selectEmpById(Integer id);
}
