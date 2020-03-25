package com.org.spring.mvc.Jsp.controller;

import com.org.spring.mvc.Jsp.model.OrderProduct;
import com.org.spring.mvc.Jsp.repository.OrderProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderProductControllerTest {

    @InjectMocks
    private OrderProductController orderProductController;

    @Mock
    private OrderProductRepository orderProductRepository;


    @Test
    public void addProductToDb_OrderProduct_success() {
        OrderProduct orderProduct = new OrderProduct();
        orderProduct.setDeliveryDate("sdhasb");
        orderProduct.setDispatch("UHGUQG");
        orderProduct.setPrice("q8622838638");
        orderProduct.setProductName("hsdgsgy");
        orderProduct.setProduct(364546);
        orderProductController.addProductToDb(orderProduct);
        Mockito.verify(orderProductRepository, Mockito.times(1)).save(orderProduct);
    }
}
