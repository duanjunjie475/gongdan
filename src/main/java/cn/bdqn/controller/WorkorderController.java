package cn.bdqn.controller;

import cn.bdqn.pojo.Workorder;
import cn.bdqn.service.ProjectService;
import cn.bdqn.service.WorkorderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Date;

@Controller("workorderController")
@RequestMapping("/workorder")
public class WorkorderController {

    @Resource(name = "projectService")
    private ProjectService projectService;
    @Resource(name = "workorderService")
    private WorkorderService workorderService;

    /**
     * 首页
     * @param model
     * @return
     */
    @RequestMapping("/index.html")
    public String index(Model model){
        model.addAttribute("projectes",projectService.findProjectList());
        return "index";
    }

    @RequestMapping("/add.html")
    public String add(Model model,Long projectId){
        model.addAttribute("projectId",projectId);
        return "add";
    }

    /**
     * 处理添加的方法
     * @param model
     * @param workorder
     * @return
     */
    @RequestMapping(value = "/add.html",method = RequestMethod.POST)
    public String addDo(Model model, Workorder workorder){
        workorder.setCreateDate(new Date());
        int result=workorderService.addWorkorder(workorder);
        if(result>0){
            model.addAttribute("workorders",workorderService.findWorkorderList());
            return "list";
        }
        return "add";
    }

}
