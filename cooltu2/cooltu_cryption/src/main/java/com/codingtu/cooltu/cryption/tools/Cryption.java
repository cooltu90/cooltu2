package com.codingtu.cooltu.cryption.tools;

import com.codingtu.cooltu.cryption.decode.DecodeFile;
import com.codingtu.cooltu.cryption.encode.EncodeFile;
import com.codingtu.cooltu.lib4j.file.list.FileLister;
import com.codingtu.cooltu.lib4j.file.list.ListFile;

import java.io.File;

public class Cryption {

    private boolean isEncode;
    private File file;
    private byte[] pswBytes;


    public static Cryption encode() {
        Cryption cryption = new Cryption();
        cryption.isEncode = true;
        return cryption;
    }

    public static Cryption decode() {
        return new Cryption();
    }

    public Cryption file(File file) {
        this.file = file;
        return this;
    }

    public Cryption password(String password) {
        this.pswBytes = password.getBytes();
        return this;
    }

    public void start() {
        if (file.isDirectory()) {
            FileLister.dir(file)
                    .list(new ListFile() {
                        @Override
                        public void list(File file) {
                            start(file);
                        }
                    });
        } else {
            start(file);
        }
    }

    private void start(File file) {
        (isEncode ? new EncodeFile(file, pswBytes) : new DecodeFile(file, pswBytes)).start();
    }

}
