package cn.white.hx.service.impl;

import cn.white.hx.entity.NodeWay;
import cn.white.hx.entity.Way;
import cn.white.hx.entity.WayList;
import cn.white.hx.mapper.WayNodeMapper;
import cn.white.hx.service.WayNodeService;
import cn.white.hx.util.XmlBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 23:17
 * @Description:
 * @Modify_By:
 */
@Service
public class WayNodeServiceImpl implements WayNodeService{

    private static Logger logger = LoggerFactory.getLogger(WayNodeServiceImpl.class);

    @Autowired
    private WayNodeMapper wayNodeMapper;

    @Override
    public void addWayNodes() throws Exception{
       List<Way> wayList = this.listWay();
       List<NodeWay> nodeWayList = new ArrayList<>();
       for(Way way : wayList){
           for(int i = 0;i<way.getNodeList().size();i++){
               NodeWay nodeWay = new NodeWay();
               nodeWay.setWayId(way.getWayId());
               nodeWay.setNodeId(Long.parseLong(way.getNodeList().get(i).getRef()));
               nodeWayList.add(nodeWay);
           }
       }
       wayNodeMapper.addWayNodes(nodeWayList);
    }

    @Override
    public List<Way> listWay() throws Exception {

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
        WayList wayList = (WayList) XmlBuilder.xmlStrToOject(WayList.class, buffer.toString());
        long end = System.currentTimeMillis();
        logger.info("所用时间是："+(end-start));
        return wayList.getWayList();
    }

}
