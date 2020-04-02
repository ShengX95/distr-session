package com.sx.pojo;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author shengx
 * @date 2020/3/15 22:34
 */
@Entity
@Table(name = "t_article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    @Lob
    private String content;
    @Column(name = "created")
    private Date created;
    @Column(name = "modified")
    private Date modified;
    @Column(name = "categories")
    private String categories;
    @Column(name = "tags")
    private String tags;
    @Column(name = "allow_comment")
    private boolean allow_comment;
    @Column(name = "thumbnail")
    private String thumbnail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public boolean isAllow_comment() {
        return allow_comment;
    }

    public void setAllow_comment(boolean allow_comment) {
        this.allow_comment = allow_comment;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created='" + created + '\'' +
                ", modified='" + modified + '\'' +
                ", categories='" + categories + '\'' +
                ", tags='" + tags + '\'' +
                ", allow_comment=" + allow_comment +
                ", thumbnail='" + thumbnail + '\'' +
                '}';
    }
}
