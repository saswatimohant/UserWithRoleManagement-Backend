package com.misboi.UserWithRoleMapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misboi.UserWithRoleMapping.Model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users,Integer> {

}
