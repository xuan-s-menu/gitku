package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileBasicClass implements FileBasicSupport {

    /* 将给定的字符串内容写入到目录文件中,返回写入的字节数 */
    @Override
    public void writeFile(String way, String content) throws IOException {
        System.out.println("创建文件"+way);
        File file = new File(way);//定义一个file对象，用来初始化FileReader
        // 准备要写入的字符串
        FileWriter fw = new FileWriter(way, true);
        // 指定写入的文件位置
        // public FileWriter(File file, boolean append) throws IOException
        // 根据给定的 File 对象构造一个 FileWriter 对象。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
        PrintWriter pw = new PrintWriter(fw);
        // 使用流把字符送到文件..
        pw.println(content);
        pw.close();
        fw.close();

    }

    @Override
    public List<String> readFile(String  way) throws IOException {
        File file = new File(way);//定义一个file对象，用来初始化FileReader
        FileReader reader = new FileReader(file);//定义一个fileReader对象，用来初始化BufferedReader
        BufferedReader bReader = new BufferedReader(reader);//new一个BufferedReader对象，将文件内容读取到缓存
        StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
        String s = "";
        List<String> list=new ArrayList<String>();
        while ((s =bReader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            sb.append(s).append("\n");//将读取的字符串添加换行符后累加存放在缓存中
            list.add(s);
        }
        bReader.close();
        return list;
    }

}
