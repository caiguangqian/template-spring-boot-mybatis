package com.onion.template.spring.boot.mybatis;

import cn.smallbun.screw.core.Configuration;
import cn.smallbun.screw.core.engine.EngineConfig;
import cn.smallbun.screw.core.engine.EngineFileType;
import cn.smallbun.screw.core.engine.EngineTemplateType;
import cn.smallbun.screw.core.execute.DocumentationExecute;
import cn.smallbun.screw.core.process.ProcessConfig;
import com.onion.template.spring.boot.mybatis.common.controller.BaseController;
import com.onion.template.spring.boot.mybatis.config.DruidConfig;
import com.onion.template.spring.boot.mybatis.entity.Employee;
import com.onion.template.spring.boot.mybatis.entity.Role;
import com.onion.template.spring.boot.mybatis.mapper.EmployeeMapper;
import com.onion.template.spring.boot.mybatis.mapper.RoleMapper;
import com.onion.template.spring.boot.mybatis.util.OkHttpClientUtil;
import com.onion.template.spring.boot.mybatis.util.RedisUtil;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import okhttp3.Response;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
/**
 * @Author: onion
 * @Description:
 * @Date: 2020/7/21
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TemplateSpringBootMybatisApplication.class)
@Transactional
//@Rollback
class TemplateSpringBootMybatisApplicationTests extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(TemplateSpringBootMybatisApplication.class);
    @Resource
    private EmployeeMapper employeeMapper;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private RedisTemplate<String, Object> redisCacheTemplate;
    @Resource
    private RedisUtil redisUtil;
    @Resource
    private RoleMapper roleMapper;


   /* @Test
    public void test(){
        PageHelper.startPage(1,4);
        Example example=new Example(Apply.class);
        PageInfo<Apply> pageInfo=new PageInfo<>(applyMapper.selectByExample(example));
        List<Apply> list=pageInfo.getList();
        for(Apply list1:list){
            System.out.println(list1.getApplyResult()+"---"+list1.getApplyType());
        }
    }*/
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

    @Test
    public void get() {
        //测试线程安全
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        IntStream.range(0, 1000).forEach(i ->
                executorService.execute(() -> stringRedisTemplate.opsForValue().increment("kk", 1))
        );
        stringRedisTemplate.opsForValue().set("k1" , "v1");
        final String k1 = stringRedisTemplate.opsForValue().get("k1");
        logger.info("[字符缓存结果]-[{}]" , k1);
        // TODO 以下只演示整合，具体Redis命令可以参考官方文档，Spring Data Redis 只是改了个名字而已，Redis支持的命令它都支持
        String key = "battcn:role:1";
        redisCacheTemplate.opsForValue().set(key , new Role(111L,"role",false,"11",1L));
        final Role role = (Role) redisCacheTemplate.opsForValue().get(key);
        logger.info("[对象缓存结果] - [{}]",role.getRoleName());
    }

    @Test
    public void testRedis(){

        redisCacheTemplate.opsForValue().set("2016_token" , "2016_5314ca528e5a492eae9a1b41b9025ebf",86400, TimeUnit.SECONDS);
        long string = redisUtil.getExpire("2016_token");
        System.out.println(string);
        //String str=redisCacheTemplate.opsForValue().get("2016_token").toString();
        //str = str.substring(0,str.length());
        //System.out.println(str);
    }
    @Test
    public void testRole(){
        Role role =  roleMapper.selectByPrimaryKey(1);

        System.out.println(role.getRoleId());
        System.out.println(role.getRoleName());
        System.out.println(role.getLimitedId());
        System.out.println(role.getRoleStatus());
        System.out.println(role.getRoleRemarks());
    }

    @Test
    public void testOkHttpClient(){
        String url = "http://127.0.0.1:8081/role/1";
        OkHttpClientUtil httpClientUtil = OkHttpClientUtil.getInstance();
        Response response = httpClientUtil.getData(url,"accept_token","2016_5314ca528e5a492eae9a1b41b9025ebf");
        System.out.println(response);
    }

    @Test
    public void testPageHelper() throws Exception {
        /*int start = 1;
        int size = 5;
        PageHelper.startPage(1,5);
        List<Employee> list = employeeMapper.selectAll();
        PageInfo pageInfo = new PageInfo(list);
        System.out.println(pageInfo);*/
        //System.out.println(startPage(1,5,employeeMapper.selectAll()));
        String user = "com.onion.template.spring.boot.mybatis.entity.Role";//字符串是该类的全限定名
        try {
            Class clzz = Class.forName(user);
            Object classObj=clzz.newInstance();//将class类转换为对象
            String[] field = classObj.toString().split("");
            System.out.println(field);//
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void shouldAnswerWithTrue() {
        //数据源
        HikariConfig hikariConfig = new HikariConfig();
        //hikariConfig.setDriverClassName("com.mysql.cj.jdbc.Driver");
        //hikariConfig.setJdbcUrl("jdbc:mysql://47.93.228.28:3306/eam");
        hikariConfig.setDriverClassName("oracle.jdbc.OracleDriver");
        hikariConfig.setJdbcUrl("jdbc:oracle:thin:@121.37.17.52:1521/orcl");
        hikariConfig.setUsername("");
        hikariConfig.setPassword("");
        //设置可以获取tables remarks信息
        hikariConfig.addDataSourceProperty("useInformationSchema", "true");
        hikariConfig.setMinimumIdle(2);
        hikariConfig.setMaximumPoolSize(5);
        DataSource dataSource = new HikariDataSource(hikariConfig);
        //生成配置
        EngineConfig engineConfig = EngineConfig.builder()
                //生成文件路径
                .fileOutputDir("C:\\Users\\admin\\Desktop\\onion")
                //打开目录
                .openOutputDir(true)
                //文件类型
                .fileType(EngineFileType.HTML)
                //生成模板实现
                .produceType(EngineTemplateType.freemarker).build();

        //忽略表
        ArrayList<String> ignoreTableName = new ArrayList<>();
        ignoreTableName.add("oauth_code");
        ignoreTableName.add("oauth_refresh_token");
        ignoreTableName.add("oauth_approvals");
        //忽略表前缀
        ArrayList<String> ignorePrefix = new ArrayList<>();
        ignorePrefix.add("oauth_");
        //忽略表后缀
        ArrayList<String> ignoreSuffix = new ArrayList<>();
        ignoreSuffix.add("_test");
        ProcessConfig processConfig = ProcessConfig.builder()
                //忽略表名
                .ignoreTableName(ignoreTableName)
                //忽略表前缀
                .ignoreTablePrefix(ignorePrefix)
                //忽略表后缀
                .ignoreTableSuffix(ignoreSuffix).build();
        //配置
        Configuration config = Configuration.builder()
                //版本
                .version("1.0.0")
                //描述
                .description("数据库设计文档生成")
                //数据源
                .dataSource(dataSource)
                //生成配置
                .engineConfig(engineConfig)
                //生成配置
                .produceConfig(processConfig).build();
        //执行生成
        new DocumentationExecute(config).execute();
    }

}
