package cn.white.hx.service;

import cn.white.hx.entity.Node;
import cn.white.hx.entity.Way;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 18:49
 * @Description:
 * @Modify_By:
 */
@Service(value = "NodeService")
public interface NodeService {

    List<Node> listNode() throws Exception;

    void addNodes() throws Exception;

}
