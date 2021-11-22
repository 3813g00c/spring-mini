package com.ywxiang.core.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 */
public class UrlResource implements Resource{
    private final URL url;

    public UrlResource(URL url) {
        this.url = url;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection connection = this.url.openConnection();
        try {
            return connection.getInputStream();
        } catch (IOException e) {
            throw e;
        }
    }
}
