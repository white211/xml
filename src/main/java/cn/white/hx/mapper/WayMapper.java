package cn.white.hx.mapper;

import cn.white.hx.entity.Way;
import cn.white.hx.entity.WayVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-27 0:12
 * @Description:
 * @Modify_By:
 */
@Mapper
public interface WayMapper {

   void addWays(@Param("wayList") List<WayVo> wayList);

}
