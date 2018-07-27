package cn.white.hx.service.impl;

import cn.white.hx.entity.Node;
import cn.white.hx.entity.NodeList;
import cn.white.hx.entity.Way;
import cn.white.hx.entity.WayList;
import cn.white.hx.mapper.NodeMapper;
import cn.white.hx.service.NodeService;
import cn.white.hx.util.XmlBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 18:49
 * @Description:
 * @Modify_By:
 */
@Service
public class NodeServiceImpl implements NodeService {

    private static Logger logger = LoggerFactory.getLogger(NodeServiceImpl.class);

    @Autowired
    private NodeMapper nodeMapper;

    @Override
    public List<Node> listNode() throws Exception {

        long start = System.currentTimeMillis();
        // 读取XML文件
        Resource resource = new ClassPathResource("广州.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";

        while ((line = br.readLine()) !=null) {
            buffer.append(line);
        }

        br.close();

        // XML转为Java对象
        NodeList nodeList = (NodeList) XmlBuilder.xmlStrToOject(NodeList.class, buffer.toString());
        long end = System.currentTimeMillis();
        logger.info("所用时间是："+(end-start));
        return nodeList.getNodeList();

    }

    @Override
    public void addNodes() throws Exception {
         List<Node> nodes = this.listNode();
         nodeMapper.addNodes(nodes);
    }



}
