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
@Table(name="roles")
public class Roles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleid;

    @Column(name = "rolename")
    private String rolename;
    
    @Column(name = "roledescription")
    private String roledescription;
    
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
    
//    @OneToMany(cascade=mappedBy = "roles")
//    @JsonBackReference
//    @OneToMany(mappedBy = "roles", fetch = FetchType.EAGER,
//    	    cascade = CascadeType.ALL)
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleid",referencedColumnName = "roleid")
//    @JsonIgnore
//    private Set<UserRoleMapping> userRoleMapping=new HashSet<>();
    private List<UserRoleMapping> userRoleMapping;

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoledescription() {
		return roledescription;
	}

	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
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

