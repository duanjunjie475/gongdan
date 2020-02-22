package cn.bdqn.dao;

import cn.bdqn.pojo.Project;

import java.util.List;

public interface ProjectMapper {

    /**
     * 查询所有项目
     * @return
     */
    List<Project> findProjectList();
}
