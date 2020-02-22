package cn.bdqn.service.impl;

import cn.bdqn.dao.ProjectMapper;
import cn.bdqn.pojo.Project;
import cn.bdqn.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

    @Resource(name="projectMapper")
    private ProjectMapper projectMapper;

    @Override
    public List<Project> findProjectList() {
        return projectMapper.findProjectList();
    }
}
