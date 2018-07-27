package cn.white.hx.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @Author: white
 * @Date: create in 2018-07-26 22:52
 * @Description:
 * @Modify_By:
 */
@Data
@XmlRootElement(name = "way")
@XmlAccessorType(XmlAccessType.FIELD)
public class NdList {

    @XmlElement(name = "nd")
    private List<ND> ndList;

}
