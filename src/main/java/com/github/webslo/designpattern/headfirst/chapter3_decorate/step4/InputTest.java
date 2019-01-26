package com.github.webslo.designpattern.headfirst.chapter3_decorate.step4;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 21:16
 * @description
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/wen/github/Design-Pattern/src/main/resources/test.txt")));
        while ((c = in.read()) > 0) {
            System.out.print((char) c);
        }
        in.close();
    }
}
