package cn.white.hx.controller;

import cn.white.hx.entity.Way;
import cn.white.hx.service.WayNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 23:29
 * @Description:
 * @Modify_By:
 */
@RestController
@RequestMapping(value = "WayNodeController")
public class WayNodeController {

    @Autowired
    private WayNodeService wayNodeService;

    @GetMapping(value = "wayList")
    public List<Way> getWayList() throws Exception{
        return wayNodeService.listWay();
    }

    @PostMapping(value = "addWayNodes")
    public String addWayNodes() throws Exception{
        wayNodeService.addWayNodes();
        return "录入成功";
    }


}
