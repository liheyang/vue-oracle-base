package com.ablyy.common.annotation;

import com.ablyy.common.enums.TodoType;

import java.lang.annotation.*;

/**
 * 待办事宜AOP
 * @author ly
 * @date 2020/7/20 9:45
 */
@Target({ ElementType.PARAMETER, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TodoList {

    /**
     * 待办事宜类型：0：待审核订单，1：待审核计划，2：设备点检， 3：排班提醒
     * @return
     */
    public TodoType toDoType() default TodoType.TOCHECKORDER;

    /**
     * 待办事宜title
     * @return
     */
    public String  title() default "";

    /**
     * 待办事宜content
     * @return
     */
    public String content() default "";

    /**
     * 待办事宜roleName
     * @return
     */
    public String roleName() default "";

}