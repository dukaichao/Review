package com.dkc.io;

import java.io.File;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/8/15
 * Time:11:49
 */
public class printFile {

    public static void main(String[] args) {
        print(new File("D:"));
    }

    public static void print(File file){
        File[] isFi = file.listFiles();
        if(isFi != null){
            for(File ff : isFi){
                if(ff.isDirectory()){
                    print(ff);
                }else{
                    System.out.println(ff.getName());
                }
            }
        }
    }


}
