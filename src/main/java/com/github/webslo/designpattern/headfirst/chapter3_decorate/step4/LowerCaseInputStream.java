package com.github.webslo.designpattern.headfirst.chapter3_decorate.step4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 21:11
 * @description
 */
public class LowerCaseInputStream extends FilterInputStream {
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase((char) c);

    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = super.read(b, off, len);
        for (int i = off; i < off + result; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}