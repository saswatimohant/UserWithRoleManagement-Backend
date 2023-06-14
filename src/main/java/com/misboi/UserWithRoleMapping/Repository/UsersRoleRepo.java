package com.misboi.UserWithRoleMapping.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.misboi.UserWithRoleMapping.Model.UserRoleMapping;

@Repository
public interface UsersRoleRepo extends JpaRepository<UserRoleMapping,Integer> {
	@Query("SELECT users FROM Users users where users.userid=:userid")
	  public List<UserRoleMapping>getJoinInformation(@Param ("userid") Integer userid);
	@Query("SELECT roles FROM Roles roles where roles.roleid=:roleid")
	public List<UserRoleMapping>getRolesJoinInformation(@Param ("roleid") Integer roleid);
}
