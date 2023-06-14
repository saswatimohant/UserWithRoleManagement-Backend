package com.misboi.UserWithRoleMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misboi.UserWithRoleMapping.Model.Roles;
@Repository
public interface RolesRepo extends JpaRepository<Roles,Integer> {

}
