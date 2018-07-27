package cn.white.hx.mapper;

import cn.white.hx.entity.Node;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 19:20
 * @Description:
 * @Modify_By:
 */
@Mapper
public interface NodeMapper {

    List<Node> selectAll();

    void addNodes(@Param("nodeList") List<Node> nodeList);

}
