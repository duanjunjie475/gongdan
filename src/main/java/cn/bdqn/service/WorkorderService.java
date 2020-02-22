package cn.bdqn.service;

import cn.bdqn.pojo.Workorder;

import java.util.List;

public interface WorkorderService {

    /**
     * 查询所有工单
     * @return
     */
    List<Workorder> findWorkorderList();

    /**
     * 新增工单
     * @param workorder
     * @return
     */
    int addWorkorder(Workorder workorder);
}
