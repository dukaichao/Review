package com.dkc.io;

import java.io.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:实现文件拷贝
 * User:Mr.Du
 * Date:2019/8/16
 * Time:20:34
 */
public class FileCopy {

    public static void main(String[] args) {
        copyFile("e:/test.txt","e:/test1.txt",1);
    }

    //字节流拷贝
    public static void copyFile(String src,String tar){
        InputStream srcIs = null;
        OutputStream tarOs = null;
        try{
            srcIs = new FileInputStream(new File(src));
            tarOs = new FileOutputStream(new File(tar));
            byte[] bytes = new byte[1024];
            int len = 0;
            while((len = srcIs.read(bytes))!= -1){
                tarOs.write(bytes,0,len);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                srcIs.close();
                tarOs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //字符流拷贝
    public static void copyFile(String src,String tar,int value){
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader(src);
            fw = new FileWriter(tar);
            char[] chars = new char[1024];
            int len = 0;
            while((len = fr.read(chars))!=-1){
                fw.write(chars,0,len);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
