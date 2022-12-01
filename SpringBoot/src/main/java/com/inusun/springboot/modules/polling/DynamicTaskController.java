package com.inusun.springboot.modules.polling;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dynamicTask")
public class DynamicTaskController {

    private final DynamicTaskService dynamicTask;

    public DynamicTaskController(DynamicTaskService dynamicTask) {
        this.dynamicTask = dynamicTask;
    }

    /**
     * 查看已开启但还未执行的动态任务
     *
     * @return
     */
    @GetMapping
    public List<String> getStartingDynamicTask() {
        return dynamicTask.getTaskList();
    }


    /**
     * 开启一个动态任务
     *
     * @param task
     * @return
     */
    @PostMapping("/dynamic")
    public String startDynamicTask(@RequestBody Task task) {
        // 将这个添加到动态定时任务中去
        dynamicTask.add(task);
        return "动态任务:" + task.getName() + " 已开启";
    }


    /**
     * 根据名称 停止一个动态任务
     *
     * @param name
     * @return
     */
    @DeleteMapping("/{name}")
    public String stopDynamicTask(@PathVariable("name") String name) {
        // 将这个添加到动态定时任务中去
        if (!dynamicTask.stop(name)) {
            return "停止失败,任务已在进行中.";
        }
        return "任务已停止";
    }

}
