package cn.white.hx.entity;

import lombok.Data;

/**
 * @Author: white
 * @Date: create in 2018-07-27 0:25
 * @Description:
 * @Modify_By:
 */
@Data
public class WayVo {

    private Long wayId;

    private String wayName = null;

    private String highway = null;

    private String building = null;

    private String amenity = null;

}
