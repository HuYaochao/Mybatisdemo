package org.company.mybatisdemo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer id;
    private Date createTime;
    private Integer userId;
    private User user;
}
