package com.wpc.guns.generator.config;

import com.wpc.guns.generator.modular.controller.CodeController;
import cn.stylefeng.roses.core.db.DbInitializer;
import com.wpc.guns.generator.db.DbInfoInitializer;
import com.wpc.guns.generator.modular.service.TableService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 代码生成器的自动配置
 *
 * @author fengshuonan
 * @date 2018-10-09-下午3:27
 */
@Configuration
public class GeneratorAutoConfiguration {

    @Bean
    public CodeController codeController() {
        return new CodeController();
    }

    @Bean
    public TableService tableService() {
        return new TableService();
    }

    @Bean
    public DbInitializer dbInitializer() {
        return new DbInfoInitializer();
    }
}
