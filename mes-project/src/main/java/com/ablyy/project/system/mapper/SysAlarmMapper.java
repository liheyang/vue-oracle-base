package com.ablyy.project.system.mapper;

import com.ablyy.project.system.domain.SysAlarm;

import java.util.List;

/**
 * 生产报警Mapper接口
 *
 * @author wxp
 * @date 2020-06-17
 */
public interface SysAlarmMapper {

    /**
     * 查询生产报警
     *
     * @param id 生产报警ID
     * @return 生产报警
     */
    public SysAlarm selectSysAlarmById(Long id);

    /**
     * 查询生产报警列表
     *
     * @param sysAlarm 生产报警
     * @return 生产报警集合
     */
    public List<SysAlarm> selectSysAlarmList(SysAlarm sysAlarm);

    /**
     * 新增生产报警
     *
     * @param sysAlarm 生产报警
     * @return 结果
     */
    public int insertSysAlarm(SysAlarm sysAlarm);

    /**
     * 修改生产报警
     *
     * @param sysAlarm 生产报警
     * @return 结果
     */
    public int updateSysAlarm(SysAlarm sysAlarm);

    /**
     * 删除生产报警
     *
     * @param id 生产报警ID
     * @return 结果
     */
    public int deleteSysAlarmById(Long id);

    /**
     * 批量删除生产报警
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysAlarmByIds(Long[] ids);

}