package cn.white.hx.controller;

import cn.white.hx.service.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: white
 * @Date: create in 2018-07-27 0:08
 * @Description:
 * @Modify_By:
 */
@RestController
@RequestMapping("WayController")
public class WayController {

    @Autowired
    private WayService wayService;

    @PostMapping(value = "addWays")
    public String addWays() throws  Exception{
        wayService.addWays() ;
        return "录入数据成功";
    }


}
