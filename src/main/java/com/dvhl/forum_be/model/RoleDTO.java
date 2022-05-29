package com.dvhl.forum_be.model;

public class RoleDTO {

    private long id;

    private String rolename;

    public RoleDTO() {
    }

    public RoleDTO(long id, String rolename) {
        this.id = id;
        this.rolename = rolename;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

}
