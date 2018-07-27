package cn.white.hx.entity;

import lombok.Data;

import javax.xml.bind.Element;
import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * @Author: white
 * @Date: create in 2018-07-26 12:36
 * @Description:
 * @Modify_By:
 */
@Data
@XmlRootElement(name = "way")
@XmlAccessorType(XmlAccessType.FIELD)
public class Way {

    @XmlAttribute(name = "id")
    private Long wayId;

    @XmlElements(@XmlElement(name = "nd",type = ND.class))
    private List<ND> nodeList;

    @XmlElements(@XmlElement(name = "tag",type = Tag.class))
    private List<Tag> tagList;



//    @XmlElement(name = "tag")
//    @XmlAttribute
//    private String wayName;
//
//    @XmlElement(name = "tag")
//    @XmlAttribute
//    private String highway;
//
//    @XmlElement(name = "tag")
//    @XmlAttribute
//    private String amenity;
//
//    @XmlElement(name = "tag")
//    @XmlAttribute
//    private String building;

}
