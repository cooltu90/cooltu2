package com.codingtu.cooltu.cryption.encode;

import com.codingtu.cooltu.cryption.tools.CryptionFile;
import com.codingtu.cooltu.cryption.tools.CryptionListener;
import com.codingtu.cooltu.cryption.tools.CryptionTools;
import com.codingtu.cooltu.cryption.tools.CryptionTypes;
import com.codingtu.cooltu.lib4j.tools.MD5;
import com.codingtu.cooltu.lib4j.tools.StringTool;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncodeFile extends CryptionFile {

    private String newFilePath;

    public EncodeFile(File file, byte[] pswBytes) {
        super(file, pswBytes);
    }

    @Override
    protected void startWithException() throws IOException {

        ipt = new FileInputStream(file);
        byte[] bytes = new byte[CryptionTools.MAX_READ_LEN];
        //第一次读取
        int len = ipt.read(bytes);

        byte[] signBytes = encode(CryptionTools.signBytes());

        if (CryptionTools.isEncode(signBytes, bytes)) {
            System.out.println("此文件是已加密文件：" + file.getAbsolutePath());
            return;
        }

        //未加密
        System.out.println("正在加密：" + file.getAbsolutePath());
        System.out.println("[10% 20% 30% 40% 50% 60% 70% 80% 90% 100%]");
        System.out.print("[");

        File newFile = getFile(this.file);
        newFilePath = newFile.getAbsolutePath();
        opt = new FileOutputStream(newFile);
        //写入标记
        opt.write(signBytes);
        //写入类型
        opt.write(CryptionTypes.lastType());

        type = CryptionTypes.getLastType();

        //写入最后更新时间
        opt.write(encode(CryptionTools.lastModifyBytes(this.file)));

        byte[] nameBytes = encode(file.getName().getBytes(CryptionTools.CHARSET));

        //写入名字长度
        opt.write(nameBytes.length);
        //写入名字
        opt.write(nameBytes);

        long readLen = CryptionTools.getInfosLen() + nameBytes.length;

        long totalLen = this.file.length() + readLen;

        //写入文件实体
        do {
            if (len > 0) {
                opt.write(encode(bytes, len), 0, len);
                readLen += len;
            }
            percent(readLen, totalLen);
        }
        while ((len = ipt.read(bytes)) > 0);

        System.out.println("]");

    }

    @Override
    protected void finish() {
        super.finish();
        //验证
        if (StringTool.isBlank(newFilePath)) {
            return;
        }
        File newFile = new File(newFilePath);
        try {
            ipt = new FileInputStream(newFile);
            byte[] bytes = new byte[CryptionTools.MAX_READ_LEN];
            //获取标志
            ipt.read(bytes, 0, CryptionTools.signLen());
            byte[] signBytes = encode(CryptionTools.signBytes());
            if (!CryptionTools.isEncode(signBytes, bytes)) {
                throw new RuntimeException("加密失败");
            } else {
                //获取类型
                type = CryptionTypes.getType(ipt.read());
                //获取最后修改时间
                long lastModify = Long.parseLong(read(bytes, CryptionTools.lastModifyLen()));
                //获取名字长度
                int nameLen = ipt.read();
                //获取名字
                String name = read(bytes, nameLen);
                if (file.getName().equals(name)) {
                    this.file.delete();
                } else {
                    throw new RuntimeException("加密失败");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("加密失败");
            newFile.delete();
        } finally {
            if (ipt != null) {
                try {
                    ipt.close();
                } catch (IOException e) {
                }
                ipt = null;
            }
        }

    }

    private static File getFile(File file) {
        String name = file.getName();
        int times = 2;
        while (true) {
            if (times > 10) {
                throw new RuntimeException("重名文件");
            }
            File newFile = new File(file.getParentFile().getAbsolutePath(), MD5.md5(name, times++));
            if (!newFile.exists()) {
                return newFile;
            }
        }
    }

}
