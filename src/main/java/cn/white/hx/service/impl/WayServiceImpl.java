package cn.white.hx.service.impl;

import cn.white.hx.entity.Way;
import cn.white.hx.entity.WayVo;
import cn.white.hx.mapper.WayMapper;
import cn.white.hx.service.WayNodeService;
import cn.white.hx.service.WayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-27 0:11
 * @Description:
 * @Modify_By:
 */
@Service
public class WayServiceImpl implements WayService {

    private static Logger logger = LoggerFactory.getLogger(WayNodeServiceImpl.class);

    @Autowired
    private WayMapper wayMapper;

    @Autowired
    private WayNodeService wayNodeService;

    @Override
    public void addWays() throws Exception {

        List<Way> wayList = wayNodeService.listWay();
        List<WayVo> wayVos = new ArrayList<>();
        for (Way way : wayList) {
            WayVo wayVo = new WayVo();
            int length = way.getTagList()==null?0:way.getTagList().size();
            if(length == 0){
                wayVo.setWayId(way.getWayId());
                wayVos.add(wayVo);
                continue;
            }
            for (int i = 0; i < length;i++) {
                wayVo.setWayId(way.getWayId());
                String key = way.getTagList().get(i).getK();
                String value = way.getTagList().get(i).getV();
                switch (key){
                    case "name":
                        wayVo.setWayName(value);
                        break;
                    case "building":
                        wayVo.setBuilding(value);
                        break;
                    case "highway":
                        wayVo.setHighway(value);
                        break;
                    case "amenity":
                        wayVo.setAmenity(value);
                        break;
                    default:break;
                }
            }
            wayVos.add(wayVo);
        }
        wayMapper.addWays(wayVos);
    }


}
