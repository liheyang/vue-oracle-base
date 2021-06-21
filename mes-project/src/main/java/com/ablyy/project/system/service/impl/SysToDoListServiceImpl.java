package com.ablyy.project.system.service.impl;

import com.ablyy.common.utils.DateUtils;
import com.ablyy.common.utils.SecurityUtils;
import com.ablyy.project.system.domain.SysToDoList;
import com.ablyy.project.system.mapper.SysToDoListMapper;
import com.ablyy.project.system.mapper.SysUserRoleMapper;
import com.ablyy.project.system.service.ISysToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 待办事宜Service业务层处理
 *
 * @author wxp
 * @date 2020-06-17
 */
@Service
public class SysToDoListServiceImpl implements ISysToDoListService {

    @Autowired
    private SysToDoListMapper sysToDoListMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    /**
     * 查询待办事宜
     *
     * @param id 待办事宜ID
     * @return 待办事宜
     */
    @Override
    public SysToDoList selectSysToDoListById(Long id) {
        return sysToDoListMapper.selectSysToDoListById(id);
    }

    /**
     * 查询待办事宜列表
     *
     * @param sysToDoList 待办事宜
     * @return 待办事宜
     */
    @Override
    public List<SysToDoList> selectSysToDoListList(SysToDoList sysToDoList) {
        List<Long> roles = sysUserRoleMapper.selectUserRolesByUserId(SecurityUtils.getLoginUser().getUser().getUserId());
        Map<String, Object> map = new HashMap<>(16);
        map.put("status", sysToDoList.getStatus());
        map.put("roleList", roles);
        return sysToDoListMapper.selectToDoList(map);
    }

    /**
     * 新增待办事宜
     *
     * @param sysToDoList 待办事宜
     * @return 结果
     */
    @Override
    public int insertSysToDoList(SysToDoList sysToDoList) {
        sysToDoList.setCreateTime(DateUtils.getNowDate());
        sysToDoList.setCreateBy(SecurityUtils.getUsername());
        return sysToDoListMapper.insertSysToDoList(sysToDoList);
    }

    /**
     * 修改待办事宜
     *
     * @param sysToDoList 待办事宜
     * @return 结果
     */
    @Override
    public int updateSysToDoList(SysToDoList sysToDoList) {
        sysToDoList.setUpdateTime(DateUtils.getNowDate());
        sysToDoList.setUpdateBy(SecurityUtils.getUsername());
        return sysToDoListMapper.updateSysToDoList(sysToDoList);
    }

    /**
     * 批量删除待办事宜
     *
     * @param ids 需要删除的待办事宜ID
     * @return 结果
     */
    @Override
    public int deleteSysToDoListByIds(Long[] ids) {
        return sysToDoListMapper.deleteSysToDoListByIds(ids);
    }

    /**
     * 删除待办事宜信息
     *
     * @param id 待办事宜ID
     * @return 结果
     */
    @Override
    public int deleteSysToDoListById(Long id) {
        return sysToDoListMapper.deleteSysToDoListById(id);
    }

}