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
@Table(name = "post")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String content;

    @Column(columnDefinition = "bigint default 0")
    private long view;

    @Column(nullable = false)
    private boolean isdeleted;

    @Column(nullable = false)
    private boolean isapproved;

    @ManyToOne(targetEntity = Topic.class)
    @JoinColumn(name = "topic_id", referencedColumnName = "id")
    private Topic topic;

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

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "approved_acc", referencedColumnName = "id")
    @JsonIgnore
    private User approvedacc;

    @JsonIgnore
    @Column(name = "approved_at")
    private Timestamp approvedat;

    public boolean isIsapproved() {
        return isapproved;
    }

    public void setIsapproved(boolean isapproved) {
        this.isapproved = isapproved;
    }

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

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
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

    public User getApprovedacc() {
        return approvedacc;
    }

    public void setApprovedacc(User approvedacc) {
        this.approvedacc = approvedacc;
    }

    public Timestamp getApprovedat() {
        return approvedat;
    }

    public void setApprovedat(Timestamp approvedat) {
        this.approvedat = approvedat;
    }

}
