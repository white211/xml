package cn.white.hx.controller;

import cn.white.hx.entity.Node;
import cn.white.hx.entity.Way;
import cn.white.hx.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 18:58
 * @Description:
 * @Modify_By:
 */
@RestController
@RequestMapping(value = "nodeController")
public class NodeController {

    @Autowired
    private NodeService nodeService;

    @GetMapping(value = "nodeList")
    public List<Node> getNodeList() throws Exception{
        return nodeService.listNode();
    }

    @PostMapping(value="addNodeList")
    public String addNodeList() throws Exception{
        nodeService.addNodes();
        return "插入成功";
    }




}



