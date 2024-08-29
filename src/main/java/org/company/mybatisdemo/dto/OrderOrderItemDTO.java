package org.company.mybatisdemo.dto;

import lombok.Data;

import java.util.Date;


@Data
public class OrderOrderItemDTO {
    private Integer orderId;
    private Date createTime;
    private Integer userId;
    private Integer orderItemId;
    private Integer itemId;
    private Integer num;
}
