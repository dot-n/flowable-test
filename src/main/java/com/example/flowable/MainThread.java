package com.example.flowable;

import cn.hutool.core.exceptions.ExceptionUtil;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


/**
 * @author dot
 * @date 2020/5/20
 */
@Log4j2
@Component
public class MainThread implements CommandLineRunner {


    @Override
    public void run(String... strings) {
        try {

        } catch (Exception e) {
            log.error("启动失败,exception:{}", ExceptionUtil.stacktraceToString(e));
        }
    }


}

