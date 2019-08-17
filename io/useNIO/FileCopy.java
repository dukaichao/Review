package com.dkc.io.useNIO;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/17
 * Time:15:05
 */
public class FileCopy {

    public static void main(String[] args) throws Exception {
        //fastCopy("e:/aa.txt","e:/aaa.txt");

    }

    public static void fastCopy(String src,String dest) throws Exception {

        //1.获取文件输入字节流
        FileInputStream fis = new FileInputStream(src);

        //获取输入字节流的文件通道
        FileChannel fcin = fis.getChannel();

        //获取目标文件输出字节流
        FileOutputStream fos = new FileOutputStream(dest);

        //获取输出字节流的文件通道
        FileChannel fout = fos.getChannel();

        //为缓冲区分配1024字节
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        int len = 0;

        while((len = fcin.read(buffer))!=-1){
            //切换读写
            buffer.flip();

            //把缓冲区内容写到输出文件
            fout.write(buffer);

            //清空缓冲区
            buffer.clear();
        }
        fcin.close();
        fout.close();
    }


}
