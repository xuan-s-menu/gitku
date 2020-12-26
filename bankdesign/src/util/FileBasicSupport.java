package util;

import java.io.IOException;
import java.util.List;

public interface FileBasicSupport {

    /* 将给定的字符串内容写入到目录文件中,返回写入的字节数 */
    public abstract void writeFile(String way, String content) throws IOException;

     /*从文件中 读取字符串*/
    public abstract List<String> readFile(String way)throws IOException;

}
