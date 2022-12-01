package com.inusun.springboot.modules.polling.shouqianba;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.scheduling.Trigger;

@Data
@Accessors(chain = true)
public class Task {
    private String taskName;
    private Trigger trigger;
    private Runnable task;
}
