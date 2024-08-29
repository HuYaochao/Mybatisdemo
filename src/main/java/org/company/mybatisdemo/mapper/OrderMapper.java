package org.company.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.company.mybatisdemo.dto.OrderOrderItemDTO;
import org.company.mybatisdemo.dto.OrderUserDTO;
import org.company.mybatisdemo.entity.Order;

import java.util.List;

@Mapper
public interface OrderMapper {
    List<Order> findOrdersWithUser();
    List<Order> findOrdersWithUser2();
    List<OrderUserDTO> findOrdersWithUser3();
    List<Order> find4();
    List<OrderOrderItemDTO> find5();
}
