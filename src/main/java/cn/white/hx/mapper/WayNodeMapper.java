package cn.white.hx.mapper;

import cn.white.hx.entity.NodeWay;
import cn.white.hx.entity.NodeWayList;
import cn.white.hx.entity.Way;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 23:18
 * @Description:
 * @Modify_By:
 */
@Mapper
public interface WayNodeMapper {

   void addWayNodes(@Param("nodeWayLists") List<NodeWay> nodeWayLists);

}
