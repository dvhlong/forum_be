package com.dvhl.forum_be.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(targetEntity = Post.class)
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    private Post post;

    private String content;

    @Column(nullable = false)
    private boolean isdeleted;

    @ManyToOne(targetEntity = Comment.class)
    @JoinColumn(name = "replied_cmt", referencedColumnName = "id")
    private Comment repliedcmt;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "created_acc", referencedColumnName = "id")
    private User createdacc;

    @Column(name = "created_at")
    private Timestamp createdat;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "updated_acc", referencedColumnName = "id")
    @JsonIgnore
    private User updatedacc;

    @Column(name = "updated_at")
    private Timestamp updatedat;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "deleted_acc", referencedColumnName = "id")
    @JsonIgnore
    private User deletedacc;

    @Column(name = "deleted_at")
    private Timestamp deletedat;

    public boolean isIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(boolean isdeleted) {
        this.isdeleted = isdeleted;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Comment getRepliedcmt() {
        return repliedcmt;
    }

    public void setRepliedcmt(Comment repliedcmt) {
        this.repliedcmt = repliedcmt;
    }

    public User getCreatedacc() {
        return createdacc;
    }

    public void setCreatedacc(User createdacc) {
        this.createdacc = createdacc;
    }

    public Timestamp getCreatedat() {
        return createdat;
    }

    public void setCreatedat(Timestamp createdat) {
        this.createdat = createdat;
    }

    public User getUpdatedacc() {
        return updatedacc;
    }

    public void setUpdatedacc(User updatedacc) {
        this.updatedacc = updatedacc;
    }

    public Timestamp getUpdatedat() {
        return updatedat;
    }

    public void setUpdatedat(Timestamp updatedat) {
        this.updatedat = updatedat;
    }

    public User getDeletedacc() {
        return deletedacc;
    }

    public void setDeletedacc(User deletedacc) {
        this.deletedacc = deletedacc;
    }

    public Timestamp getDeletedat() {
        return deletedat;
    }

    public void setDeletedat(Timestamp deletedat) {
        this.deletedat = deletedat;
    }

}
