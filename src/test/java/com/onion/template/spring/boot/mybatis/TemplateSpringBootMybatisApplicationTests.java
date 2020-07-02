package com.onion.template.spring.boot.mybatis;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.onion.template.spring.boot.mybatis.entity.Apply;
import com.onion.template.spring.boot.mybatis.entity.ApprovalMain;
import com.onion.template.spring.boot.mybatis.entity.Employee;
import com.onion.template.spring.boot.mybatis.mapper.ApplyMapper;
import com.onion.template.spring.boot.mybatis.mapper.ApprovalMainMapper;
import com.onion.template.spring.boot.mybatis.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TemplateSpringBootMybatisApplication.class)
@Transactional
@Rollback
class TemplateSpringBootMybatisApplicationTests {

    @Autowired
    private ApprovalMainMapper approvalMainMapper;
    @Resource
    private ApplyMapper applyMapper;
    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    public void testInsert() {
        Apply list=applyMapper.selectByPrimaryKey("59");
        System.out.println(list.getApplyResult());

    }

    @Test
    public void test(){
        PageHelper.startPage(1,4);
        Example example=new Example(Apply.class);
        PageInfo<Apply> pageInfo=new PageInfo<>(applyMapper.selectByExample(example));
        List<Apply> list=pageInfo.getList();
        for(Apply list1:list){
            System.out.println(list1.getApplyResult()+"---"+list1.getApplyType());
        }
    }
    /*  https://blog.csdn.net/sinat_38419207/article/details/82907387
        eid birthdate employeeName employeeSex departmentId employeePhone employeeStatus employeeEmail
                                employeeIdentify employeeEducation employeeNativePlace employeeMaritalStatus entrydate roleId
         1	1999-11-01 00:46:24	凌波水月	1	1	15018239490	0	123456@qq.com	123456	本科	广东肇庆
        50	1993-04-02 16:00:00	灵境	1	1	123456	1	123456@qq.com	123456	博士	广东肇庆
        51	1992-02-04 16:00:00	吴某	1	11	123456	1	123456@qq.com	123456	本科	广东肇庆
        52	1992-03-19 16:00:00	张某某	1	1	123456	1	123456@qq.com	123456	本科	广东肇庆
        53	1991-03-14 16:00:00	超级加倍	1	1	123456	1	123456@qq.com	123456	本科	广东肇庆
        54	2019-11-03 13:59:26	小柯	1	11	123456	1	123456@qq.com	123456	本科	中国广东
        55	2019-11-04 15:44:33	张总	0	1	123213	1	gonion@foxmail.com	123456	本科	广东湛江
        56	2019-10-14 16:00:00	去去去	1	3	1101101000	1	100@163.com	456456	本科	肇庆
    */
    @Test
    public void test01() {
        Employee employee = employeeMapper.selectByPrimaryKey(1);//根据主键查询
        //System.out.println(employee.getEid()+"--"+employee.getBirthdate()+"--"+employee.getEmployeeName());

        List<Employee> employee1 = employeeMapper.selectAll();//查询所有记录
        //employee1.forEach(System.out::println);

        Employee emp = new Employee();
        emp.setEmployeeNativePlace("广东肇庆");
        List<Employee> employee2 = employeeMapper.select(emp);//根据入参的条件，进行绝对匹配筛选
        /*for(Employee em : employee2){
            System.out.println(em.getEid()+"&&"+em.getEmployeeName());
        }*/

        int count = employeeMapper.selectCount(emp);//根据入参的条件，进行绝对匹配筛选，并返回符合条件的结果总数
        //System.out.println(count);

        boolean is = employeeMapper.existsWithPrimaryKey(1);//根据主键对象，判断该主键所表示的<T>记录是否存在
        //System.out.println(is);

        int t=employeeMapper.insert(emp); //根据对象T的属性，生成插入语句，并返回影响的行数
        int t1=employeeMapper.insertSelective(emp);//根据对象T的属性，生成插入语句，并返回影响的行数
        int t2=employeeMapper.delete(emp);//根据对象T的参数，进行绝对匹配，并删除该记录返回删除的行数
        int t3=employeeMapper.deleteByPrimaryKey(1);//根据主键对象，进行删除该主键所表述的记录，并返回删除的行数
        int t4=employeeMapper.updateByPrimaryKey(emp);//根据对象T的参数的主键数据，进行更新该记录,主键数据必须存在；
        int t5=employeeMapper.updateByPrimaryKeySelective(emp);//根据对象T的参数的主键数据，进行更新该记录,主键数据必须存在；

        List<Employee> employees = new ArrayList<>();
        int list = employeeMapper.insertList(employees);//根据对象T的属性，执行批量插入语句，并返回影响的行数

        // 创建Example
        Example example = new Example(Employee.class);
        // 创建Criteria
        Example.Criteria criteria = example.createCriteria();
        // 添加条件
        criteria.andEqualTo("eid", 1);
        //criteria.andIn("employee_native_place","");
        criteria.andLike("employee_name", "%abc123%");

        List<Employee> list1 = employeeMapper.selectByExample(example);//根据Example条件对象，进行查询
        int list2 = employeeMapper.selectCountByExample(example);//根据Example条件对象，进行求符合条件的行数
        int list3 = employeeMapper.deleteByExample(example);//根据Example条件对象，进行删除记录行
        int list4 = employeeMapper.updateByExample(emp,example);//根据Example条件对象，对符合条件的数据，进行按照T属性更新
        int list5 = employeeMapper.updateByExampleSelective(employee,example);//根据Condition条件对象，对符合条件的数据，进行按照T属性更新

    }
}
