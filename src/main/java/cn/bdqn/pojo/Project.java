package cn.bdqn.pojo;

public class Project {

    //项目编号
    private Long id;
    //项目名称
    private String projectName;

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "ProjectService{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
