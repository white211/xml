package cn.white.hx.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Author: white
 * @Date: create in 2018-07-26 12:37
 * @Description:
 * @Modify_By:
 */
@Data
@XmlRootElement(name = "")
public class NodeWay {

    private Long nodeId;

    private Long wayId;

}
