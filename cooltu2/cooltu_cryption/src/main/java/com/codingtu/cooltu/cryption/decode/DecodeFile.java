package com.codingtu.cooltu.cryption.decode;


import com.codingtu.cooltu.cryption.tools.CryptionFile;
import com.codingtu.cooltu.cryption.tools.CryptionListener;
import com.codingtu.cooltu.cryption.tools.CryptionTools;
import com.codingtu.cooltu.cryption.tools.CryptionTypes;
import com.codingtu.cooltu.lib4j.file.FileTool;
import com.codingtu.cooltu.lib4j.file.bean.FileInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecodeFile extends CryptionFile {

    public DecodeFile(File file, byte[] pswBytes) {
        super(file, pswBytes);
    }

    @Override
    protected void startWithException() throws IOException {
        ipt = new FileInputStream(file);
        byte[] bytes = new byte[CryptionTools.MAX_READ_LEN];
        //获取标志
        ipt.read(bytes, 0, CryptionTools.signLen());
        byte[] signBytes = encode(CryptionTools.signBytes());
        if (!CryptionTools.isEncode(signBytes, bytes)) {
            System.out.println("此文件为未加密文件：" + file.getAbsolutePath());
            return;
        }

        System.out.println("正在解密：" + file.getAbsolutePath());
        System.out.println("[10% 20% 30% 40% 50% 60% 70% 80% 90% 100%]");
        System.out.print("[");

        //获取类型
        type = CryptionTypes.getType(ipt.read());
        //获取最后修改时间
        long lastModify = Long.parseLong(read(bytes, CryptionTools.lastModifyLen()));
        //获取名字长度
        int nameLen = ipt.read();
        //获取名字
        String name = read(bytes, nameLen);

        //获取文件实体
        File newFile = new File(this.file.getParentFile(), name);
        FileInfo fileInfo = FileTool.toFileInfo(newFile);
        try {
            opt = new FileOutputStream(newFile);
        } catch (Exception e) {
            newFile = new File(this.file.getParentFile(), file.getName() + "." + fileInfo.type);
            opt = new FileOutputStream(newFile);
        }

        long readLen = CryptionTools.getInfosLen() + nameLen;
        long totalLen = this.file.length();

        int len = 0;
        while ((len = ipt.read(bytes)) > 0) {
            opt.write(encode(bytes, len), 0, len);
            readLen += len;
            percent(readLen, totalLen);
        }
        newFile.setLastModified(lastModify);
        System.out.println("]");
    }

    @Override
    protected void finish() {
        super.finish();
        this.file.delete();
    }
}
