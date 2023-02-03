package com.onion.template.spring.boot.mybatis.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

/**
 * @ClassName UserDataListener
 * @Description: TODO
 * @Author onion
 * @Date 2020/8/6
 * @Version V1.0
 **/
public class UserDataListener extends AnalysisEventListener<User> {
    @Override
    public void invoke(User user, AnalysisContext analysisContext) {
        System.out.println(user.getId()+"||"+user.getName()+"||"+user.getCreateTime()+"||"+user.getDescription());
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("读取完成！！！");
    }
}
