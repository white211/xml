package cn.white.hx.service;

import cn.white.hx.entity.Way;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 23:17
 * @Description:
 * @Modify_By:
 */
@Service(value = "WayNodeService")
public interface WayNodeService {

    void addWayNodes() throws Exception;

    List<Way> listWay() throws Exception;

}
