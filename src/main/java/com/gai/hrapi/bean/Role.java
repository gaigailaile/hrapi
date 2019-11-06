package com.gai.hrapi.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by gaigaicoming on 2019/11/5.
 */
@Data
public class Role implements Serializable{
    private Long id;
    private String name;
    private String nameZh;
}
