package cn.white.hx.entity;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 22:53
 * @Description:
 * @Modify_By:
 */
@Data
@XmlRootElement(name = "way")
@XmlAccessorType(XmlAccessType.FIELD)
public class TagList {


    @XmlElement(name = "tag")
    private List<Tag> tagList;

}
