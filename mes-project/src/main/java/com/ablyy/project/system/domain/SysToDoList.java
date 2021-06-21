package com.ablyy.project.system.domain;

import com.ablyy.common.annotation.Excel;
import com.ablyy.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 待办事宜对象 sys_to_do_list
 *
 * @author wxp
 * @date 2020-06-17
 */
@Data
@ToString
public class SysToDoList extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 标题
     */
    @Excel(name = "标题")
    private String title;

    /**
     * 待办事宜类型：0：待审核订单，1：待审核计划，2：设备点检
     */
    @Excel(name = "待办事宜类型：0：待审核订单，1：待审核计划，2：设备点检")
    private String type;

    /**
     * 待办事宜状态：0：待处理，1：已处理
     */
    @Excel(name = "待办事宜状态：0：待处理，1：已处理")
    private String status;

    /**
     * 内容
     */
    @Excel(name = "内容")
    private String contants;

    /**
     * 最迟处理时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最迟处理时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date todoTime;

    /**
     * 用户角色ID
     */
    @Excel(name = "用户角色ID")
    private Long userRoleId;

    /**
     * 公用id
     */
    @Excel(name = "公用id")
    private Long comid;

}