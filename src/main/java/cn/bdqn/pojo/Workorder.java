package cn.bdqn.pojo;

import java.util.Date;

public class Workorder {

    //工单编号
    private Long id;
    //项目编号
    private Long projectId;
    //执行人
    private String executor;
    //任务描述
    private String description;
    //级别 1-1级 2-2级 3-3级
    private Long orderLevel;
    //创建时间
    private Date createDate;
    //项目名称
    private String projectName;

    public Workorder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getOrderLevel() {
        return orderLevel;
    }

    public void setOrderLevel(Long orderLevel) {
        this.orderLevel = orderLevel;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Workorder{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", executor='" + executor + '\'' +
                ", description='" + description + '\'' +
                ", orderLevel=" + orderLevel +
                ", createDate=" + createDate +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
