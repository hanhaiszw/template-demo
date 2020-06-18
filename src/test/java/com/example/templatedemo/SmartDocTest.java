package com.example.templatedemo;

import com.power.doc.builder.ApiDocBuilder;
import com.power.doc.model.ApiConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * create by sunzhongwei on 2020/06/17
 * Desc:
 */
@SpringBootTest
class SmartDocTest {

    @Test
    void generator(){
        ApiConfig config = new ApiConfig();
        //服务地址
        config.setServerUrl("http://localhost:8090");
        //生成到一个文档
        config.setAllInOne(true);
        //采用严格模式
        config.isStrict();
        //文档输出路径
        config.setOutPath("./md");
        // ApiDocBuilder.builderControllersApi(config);
        ApiDocBuilder.buildApiDoc(config);
        //将生成的文档输出到/Users/dujf/Downloads/md目录下，严格模式下api-doc会检测Controller的接口注释
    }
}
