package com.fastdfs.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class FastDFSFile implements Serializable {
    private String name;
    private byte[] content;
    private String ext;
    private String md5;
    private String author;

    public FastDFSFile() {
    }

    public FastDFSFile(String fileName, byte[] content, String ext) {
        this.name = fileName;
        this.content = content;
        this.ext = ext;
    }
}
