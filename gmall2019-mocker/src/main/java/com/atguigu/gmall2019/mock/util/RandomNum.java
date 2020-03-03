package com.atguigu.gmall2019.mock.util;

/**
 * @ClassName RandomNum
 * @Description TODO
 * @Author Zhang Hongxiang
 * @Date 2020/3/2 23:59
 * @Version 1.0
 **/
import java.util.Random;

public class RandomNum {
    public static final  int getRandInt(int fromNum,int toNum){
        return   fromNum+ new Random().nextInt(toNum-fromNum+1);
    }
}
