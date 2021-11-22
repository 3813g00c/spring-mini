package com.ywxiang.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiangyaowei
 * @date 2021/11/16
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
