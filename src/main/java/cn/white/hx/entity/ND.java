package cn.white.hx.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Author: white
 * @Date: create in 2018-07-26 22:42
 * @Description:
 * @Modify_By:
 */
@Data
@XmlRootElement(name = "nd")
@XmlAccessorType(XmlAccessType.FIELD)
public class ND {

    @XmlAttribute(name = "ref")
    private String ref;
}
