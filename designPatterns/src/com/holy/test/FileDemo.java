package com.holy.test;

import java.io.*;

/**
 * Created by houlin.jiang on 16-6-8.
 */
public class FileDemo {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\temp\\534389625\\FileRecv\\MobileFile\\28797.txt");
            File fileout = new File("E:\\temp\\534389625\\FileRecv\\MobileFile\\2.txt");
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
            String line = "";
            FileOutputStream out = new FileOutputStream(fileout, true);
            while ((line = br.readLine()) != null) {
                out.write(line.toString().getBytes("UTF-8"));
            }
            out.close();

        } catch (Exception e) {

        }
    }
}
