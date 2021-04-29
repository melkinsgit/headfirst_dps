package iodecorator;

import java.io.*;

public class LowerCaseInputStream extends FilterInputStream { // FilterInputStream is an abstract decorator of super class InputStream

    public LowerCaseInputStream(InputStream inputStream) {
        super(inputStream);
    }

    public int read() throws IOException {
        int c = in.read(); // this in is not the in from the constructor
        return (c == -1 ? c : Character.toLowerCase((char)c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = in.read(b, offset, len);
        for (int i = offset; i < offset+result; i++) {
            b[i] = (byte)Character.toLowerCase((char)b[i]);
        }
        return result;
    }
}
