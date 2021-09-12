package com.yrd.domain;

import java.io.File;
import java.io.IOException;
import java.util.List;


import com.google.common.base.Splitter;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName: Mytest
 * @Description:
 * @author: Yrd
 * @date: 2021-09-08 9:10
 */
@Data
public class Mytest {

    private String name;

    private static final Logger LOGGER = LoggerFactory.getLogger(Mytest.class);
    public static void main(String[] args){

        if(LOGGER.isInfoEnabled()){
            LOGGER.info("nihao logger");
        }


        System.out.println("hello");
        System.out.println(WeekDay.Monday);

        //String fileName =  "./Hello.txt";
        //
        //File file = new File(fileName);
        //try {
        //    boolean newFile = file.createNewFile();
        //} catch (IOException e) {
        //    e.printStackTrace();
        //}
        //System.out.println("文件路径："+file.getParent()+"文件名："+file.getName());
        //
        //
        //List<String> list = Splitter.on(".").splitToList("share.xml.01");
        //System.out.println(list.get(0));
        //list.forEach(s->System.out.println(s));

    }
}
