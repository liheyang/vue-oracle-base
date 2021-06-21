package com.ablyy.project.system.mapper;

import com.ablyy.project.system.domain.SysToDoList;

import java.util.List;
import java.util.Map;

/**
 * 待办事宜Mapper接口
 *
 * @author wxp
 * @date 2020-06-17
 */
public interface SysToDoListMapper {

    /**
     * 查询待办事宜
     *
     * @param id 待办事宜ID
     * @return 待办事宜
     */
    public SysToDoList selectSysToDoListById(Long id);

    /**
     * 查询待办事宜列表
     *
     * @param sysToDoList 待办事宜
     * @return 待办事宜集合
     */
    public List<SysToDoList> selectSysToDoListList(SysToDoList sysToDoList);

    /**
     * 新增待办事宜
     *
     * @param sysToDoList 待办事宜
     * @return 结果
     */
    public int insertSysToDoList(SysToDoList sysToDoList);

    /**
     * 修改待办事宜
     *
     * @param sysToDoList 待办事宜
     * @return 结果
     */
    public int updateSysToDoList(SysToDoList sysToDoList);

    /**
     * 删除待办事宜
     *
     * @param id 待办事宜ID
     * @return 结果
     */
    public int deleteSysToDoListById(Long id);

    /**
     * 批量删除待办事宜
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysToDoListByIds(Long[] ids);

    /**
     * 查询待办事宜列表（依据待办事宜状态和角色列表）
     *
     * @param map
     * @return
     */
    public List<SysToDoList> selectToDoList(Map<String, Object> map);

}