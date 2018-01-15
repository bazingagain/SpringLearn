package com.leon.springlearn.dao.impl;

import com.leon.springlearn.annotation.Cold;
import com.leon.springlearn.annotation.Creamy;
import com.leon.springlearn.dao.Dessert;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created on 15/01/2018.
 *
 * @author Xiaolei-Peng
 */
@Component
//@Primary
//@Qualifier("cold")
@Cold
@Creamy
public class IceCream implements Dessert {
}
