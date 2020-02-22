package cn.bdqn.service;

import cn.bdqn.pojo.Project;

import java.util.List;

public interface ProjectService {

    /**
     * 查询所有项目
     * @return
     */
    List<Project> findProjectList();
}
