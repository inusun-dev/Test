package com.inusun.springboot.modules.polling;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true) // 方便链式编写 习惯所然
public class Task {
    /**
     * 动态任务名称
     */
    private String name;

    /**
     * 设定动态任务开始时间
     */
    private LocalDateTime start;
}
