/**
 * @Author: jackl 1471122902@qq.com
 * @Date: 2024-10-06 04:26:14
 * @LastEditors: jackl 1471122902@qq.com
 * @LastEditTime: 2024-10-06 04:33:53
 * @FilePath: Jacklinclub-subject/subject-starter/src/main/java/com/jacklin/subject/SubjectApplication.java
 * @Description: 启动类
 */
package com.jacklin.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * @Author: jackl 1471122902@qq.com
 * @Date: 2024-10-06 04:26:14
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.jacklin"})
public class SubjectApplication {
    public static void main(String[] args) {
         SpringApplication.run(SubjectApplication.class);
    }
}
