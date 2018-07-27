package cn.white.hx.service;

import cn.white.hx.mapper.WayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: white
 * @Date: create in 2018-07-27 0:11
 * @Description:
 * @Modify_By:
 */
@Service(value = "WayService")
public interface WayService  {

     void addWays() throws Exception;

}
