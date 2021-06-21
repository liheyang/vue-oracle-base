package com.ablyy.project.system.service.impl;

import com.ablyy.common.utils.DateUtils;
import com.ablyy.common.utils.SecurityUtils;
import com.ablyy.project.system.domain.SysAlarm;
import com.ablyy.project.system.mapper.SysAlarmMapper;
import com.ablyy.project.system.service.ISysAlarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 生产报警Service业务层处理
 *
 * @author wxp
 * @date 2020-06-17
 */
@Service
public class SysAlarmServiceImpl implements ISysAlarmService {

    @Autowired
    private SysAlarmMapper sysAlarmMapper;

    /**
     * 查询生产报警
     *
     * @param id 生产报警ID
     * @return 生产报警
     */
    @Override
    public SysAlarm selectSysAlarmById(Long id) {
        return sysAlarmMapper.selectSysAlarmById(id);
    }

    /**
     * 查询生产报警列表
     *
     * @param sysAlarm 生产报警
     * @return 生产报警
     */
    @Override
    public List<SysAlarm> selectSysAlarmList(SysAlarm sysAlarm) {
        return sysAlarmMapper.selectSysAlarmList(sysAlarm);
    }

    /**
     * 新增生产报警
     *
     * @param sysAlarm 生产报警
     * @return 结果
     */
    @Override
    public int insertSysAlarm(SysAlarm sysAlarm) {
        sysAlarm.setCreateTime(DateUtils.getNowDate());
        sysAlarm.setCreateBy(SecurityUtils.getUsername());
        return sysAlarmMapper.insertSysAlarm(sysAlarm);
    }

    /**
     * 修改生产报警
     *
     * @param sysAlarm 生产报警
     * @return 结果
     */
    @Override
    public int updateSysAlarm(SysAlarm sysAlarm) {
        sysAlarm.setUpdateTime(DateUtils.getNowDate());
        sysAlarm.setUpdateBy(SecurityUtils.getUsername());
        return sysAlarmMapper.updateSysAlarm(sysAlarm);
    }

    /**
     * 批量删除生产报警
     *
     * @param ids 需要删除的生产报警ID
     * @return 结果
     */
    @Override
    public int deleteSysAlarmByIds(Long[] ids) {
        return sysAlarmMapper.deleteSysAlarmByIds(ids);
    }

    /**
     * 删除生产报警信息
     *
     * @param id 生产报警ID
     * @return 结果
     */
    @Override
    public int deleteSysAlarmById(Long id) {
        return sysAlarmMapper.deleteSysAlarmById(id);
    }

}