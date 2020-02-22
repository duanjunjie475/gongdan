package cn.bdqn.service.impl;

import cn.bdqn.dao.WorkorderMapper;
import cn.bdqn.pojo.Workorder;
import cn.bdqn.service.WorkorderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("workorderService")
public class WorkorderServiceImpl implements WorkorderService {

    @Resource(name = "workorderMapper")
    private WorkorderMapper workorderMapper;

    @Override
    public List<Workorder> findWorkorderList() {
        return workorderMapper.findWorkorderList();
    }

    @Override
    public int addWorkorder(Workorder workorder) {
        try{
            return workorderMapper.addWorkorder(workorder);
        }catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
