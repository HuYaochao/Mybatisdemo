package org.company.mybatisdemo.entity;

import lombok.Data;

@Data
public class OrderItem {
    private Integer id;
    private Integer orderId;
    private  Integer itemId;
    private Integer num;
}
