package com.ywxiang.core.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 */
public class ClassPathResource implements Resource{
    private final String path;

    public ClassPathResource(String path) {
        this.path = path;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(this.path);
        if (null == is) {
            throw new FileNotFoundException(this.path + " cannot be opened because it does not exist");
        }
        return is;
    }
}
