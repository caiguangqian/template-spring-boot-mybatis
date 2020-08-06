package com.onion.template.spring.boot.mybatis;

import cn.smallbun.screw.core.Configuration;
import cn.smallbun.screw.core.engine.EngineConfig;
import cn.smallbun.screw.core.engine.EngineFileType;
import cn.smallbun.screw.core.engine.EngineTemplateType;
import cn.smallbun.screw.core.execute.DocumentationExecute;
import cn.smallbun.screw.core.process.ProcessConfig;
import com.onion.template.spring.boot.mybatis.common.controller.BaseController;
import com.onion.template.spring.boot.mybatis.config.DruidConfig;
import com.onion.template.spring.boot.mybatis.config.elasticsearch.IndexService;
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
import org.springframework.test.annotation.Rollback;
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
@Rollback
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
    @Autowired
    private IndexService indexService;

    /*@Test
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
    }*/

}
