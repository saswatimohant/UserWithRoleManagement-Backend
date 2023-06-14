package com.misboi.UserWithRoleMapping.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.misboi.UserWithRoleMapping.Exception.ResourceNotFoundException;
import com.misboi.UserWithRoleMapping.Model.Roles;
import com.misboi.UserWithRoleMapping.Model.UserRoleMapping;
import com.misboi.UserWithRoleMapping.Model.Users;
import com.misboi.UserWithRoleMapping.Repository.RolesRepo;
import com.misboi.UserWithRoleMapping.Repository.UsersRepo;
import com.misboi.UserWithRoleMapping.Repository.UsersRoleRepo;

@RestController
@CrossOrigin("*")
@EnableJpaAuditing
public class UserWithRoleMappingController {
	@Autowired
    private UsersRepo usersRepo;
	@Autowired
    private RolesRepo rolesRepo;
	@Autowired
    private UsersRoleRepo usersRolesRepo;
    // api to create a new student
    @PostMapping("/createUsers")
    @CrossOrigin(origins="http://localhost:4200")
    public Users createUsers(@RequestBody Users users) {
    	
        return usersRepo.save(users);
    }
    @PostMapping("/createRoles")
    @CrossOrigin(origins="http://localhost:4200")
    public Roles createRoles(@RequestBody Roles roles) {
        return rolesRepo.save(roles);
    }
    @PostMapping("/createUserRolesMapping")
    @CrossOrigin(origins="http://localhost:4200")
    public UserRoleMapping createUserRolesMapping(@RequestBody UserRoleMapping userRoleMapping) {
        return usersRolesRepo.save(userRoleMapping);
    }
    @GetMapping("/listAllUsers")
    @CrossOrigin(origins="http://localhost:4200")
    public List<Users> getAllUsers(){
        return (List<Users>) usersRepo.findAll();
    }
    @GetMapping("/listAllRoles")
    @CrossOrigin(origins="http://localhost:4200")
    public List<Roles> getAllRoles(){
        return (List<Roles>) rolesRepo.findAll();
    }
    @GetMapping("/listAllUsersRoles")
    @CrossOrigin(origins="http://localhost:4200")
    public List<UserRoleMapping> getAllUsersRoles(){
        return (List<UserRoleMapping>) usersRolesRepo.findAll();
    }
    
    @DeleteMapping("/deleteUser/{userid}")
    public ResponseEntity<Map<String, Boolean>> deleteUser(@PathVariable Integer userid){
        Users users = usersRepo.findById(userid).orElseThrow(() -> new ResourceNotFoundException("User not found!"));
        usersRepo.delete(users);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/deleteRole/{roleid}")
    public ResponseEntity<Map<String, Boolean>> deleteRole(@PathVariable Integer roleid){
        Roles roles = rolesRepo.findById(roleid).orElseThrow(() -> new ResourceNotFoundException("Role not found!"));
        rolesRepo.delete(roles);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
