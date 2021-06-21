package com.ablyy.project.system.domain;

import com.ablyy.common.annotation.Excel;
import com.ablyy.common.core.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 生产报警对象 sys_alarm
 *
 * @author wxp
 * @date 2020-06-17
 */
@Data
@ToString
public class SysAlarm extends BaseEntity {

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
     * 生产报警类型:0:设备报警1:板坯吊销报警
     */
    @Excel(name = "生产报警类型:0:设备报警1:板坯吊销报警")
    private String type;

    /**
     * 生产报警状态: 0:报警,1:解除
     */
    @Excel(name = "生产报警状态: 0:报警,1:解除")
    private String status;

    /**
     * 内容
     */
    @Excel(name = "内容")
    private String contents;

    /**
     * 报警时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报警时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date alarmTime;

    /**
     * 解除报警时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "解除报警时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date acTime;

    /**
     * 公用id
     */
    @Excel(name = "公用id")
    private Long comid;

}