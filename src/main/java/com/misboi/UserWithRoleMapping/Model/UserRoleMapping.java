package com.misboi.UserWithRoleMapping.Model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="UserRoleMapping")
public class UserRoleMapping {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer slno;
//	@Column(name = "slno")
//    private Integer slno;
    
    @Column(name = "status")
    private String status;
    
    @CreationTimestamp
    @Column(name="createdat",nullable = false)
    private Date createdat;
    
    @Column(name = "createdby")
    private String createdby;
    
//    @EmbeddedId
//    private UserRoleId userRoleId;
    
    @CreationTimestamp
    @Column(name="updatedat",nullable = false)
    private Date updatedat;
    
    @Column(name = "updatedby")
    private String updatedby;
    
//    @ManyToOne(fetch = FetchType.LAZY, optional = true)
//    @JoinColumn(name = "userid", nullable = false)
//   // @JsonIgnore
//    private Users users;
//    
//    @ManyToOne(fetch = FetchType.LAZY, optional = true)
//    @JoinColumn(name = "roleid", nullable = false)
//    //@JsonIgnore
//    private Roles roles;
    
    @Column(name ="userid")
    private Integer userid;

    @Column(name ="roleid")
    private Integer roleid;
    
	public Integer getSlno() {
		return slno;
	}

	public void setSlno(Integer slno) {
		this.slno = slno;
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

//	public Users getUsers() {
//		return users;
//	}
//
//	public void setUsers(Users users) {
//		this.users = users;
//	}
//
//	public Roles getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Roles roles) {
//		this.roles = roles;
//	}

//	public UserRoleId getUserRoleId() {
//		return userRoleId;
//	}
//
//	public void setUserRoleId(UserRoleId userRoleId) {
//		this.userRoleId = userRoleId;
//	}

	
    
}
