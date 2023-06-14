package com.misboi.UserWithRoleMapping.Model;

import java.util.Date;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="users")
public class Users {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userid;

    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "contactno")
    private String contactno;
    
    @Column(name = "status")
    private String status;
    
    @CreationTimestamp
    @Column(name="createdat",nullable = false)
    private Date createdat;
    
    @Column(name = "createdby")
    private String createdby;
    
    @CreationTimestamp
    @Column(name="updatedat",nullable = false)
    private Date updatedat;
    
    @Column(name = "updatedby")
    private String updatedby;
    
//    @OneToMany(mappedBy = "users")
//    @JsonBackReference
//    @OneToMany(mappedBy = "users", fetch = FetchType.EAGER,
//    	    cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid",referencedColumnName = "userid")
//    private Set<UserRoleMapping> userRoleMapping=new HashSet<>();
    private List<UserRoleMapping> userRoleMapping;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedat() {
		return createdat;
	}

	public void setCreatedat(Date createdat) {
		this.createdat = createdat;
	}

	public String getCreatedby() {
		return createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getUpdatedat() {
		return updatedat;
	}

	public void setUpdatedat(Date updatedat) {
		this.updatedat = updatedat;
	}

	public String getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}

	public List<UserRoleMapping> getUserRoleMapping() {
		return userRoleMapping;
	}

	public void setUserRoleMapping(List<UserRoleMapping> userRoleMapping) {
		this.userRoleMapping = userRoleMapping;
	}
}
