package com.atguigu.gmall2019.mock.util;

/**
 * @ClassName RanOpt
 * @Description TODO
 * @Author Zhang Hongxiang
 * @Date 2020/3/2 23:58
 * @Version 1.0
 **/
public class RanOpt<T>{
    T value ;
    int weight;

    public RanOpt ( T value, int weight ){
        this.value=value ;
        this.weight=weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}
