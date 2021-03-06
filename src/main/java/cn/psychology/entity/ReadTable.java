package cn.psychology.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Document(collection = "readtable")
public class ReadTable {
    @Id
    // 主键
    private String id;
    @Field("readId")
    // 读物ID
    private String readId;
    @Field("readType")
    // 读物类型
    private int readType;
    @Field("readTitle")
    // 读物题目
    private String readTitle;
    @Field("readAuthor")
    // 读物作者
    private String readAuthor;
    @Field("readImage")
    // 读物图片
    private String readImage;
    @Field("readContext")
    // 读物内容
    private String readContext;

    public String getReadId() {
        return readId;
    }

    public void setReadId(String readId) {
        this.readId = readId;
    }

    public String getReadTitle() {
        return readTitle;
    }

    public void setReadTitle(String readTitle) {
        this.readTitle = readTitle;
    }

    public String getReadAuthor() {
        return readAuthor;
    }

    public void setReadAuthor(String readAuthor) {
        this.readAuthor = readAuthor;
    }

    public String getReadImage() {
        return readImage;
    }

    public void setReadImage(String readImage) {
        this.readImage = readImage;
    }

    public String getReadContext() {
        return readContext;
    }

    public void setReadContext(String readContext) {
        this.readContext = readContext;
    }

    public int getReadType() {
        return readType;
    }

    public void setReadType(int readType) {
        this.readType = readType;
    }
}
