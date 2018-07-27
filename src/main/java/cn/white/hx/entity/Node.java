package cn.white.hx.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * @Author: white
 * @Date: create in 2018-07-26 12:36
 * @Description:
 * @Modify_By:
 */
@Data
@XmlRootElement(name = "node")
@XmlAccessorType(XmlAccessType.FIELD)
public class Node implements Serializable{

    @XmlAttribute(name = "id")
    private Long nodeId;
    @XmlAttribute(name = "lat")
    private double nodeLat;
    @XmlAttribute(name = "lon")
    private double nodeLon;

}



