package org.company.mybatisdemo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderUserDTO {
    private Integer orderId;
    private Date createTime;
    private Integer userId;
    private  String username;
    private  String password;
}
