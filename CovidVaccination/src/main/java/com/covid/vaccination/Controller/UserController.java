package com.covid.vaccination.Controller;

import com.covid.vaccination.Entity.User;
import com.covid.vaccination.Implementation.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    public final UserServiceImpl usi;

    public UserController(UserServiceImpl usi) {
        this.usi = usi;
    }


//    Create User
    @PostMapping("/createUser")
    public String createUser(@RequestBody User user){
        usi.saveUser(user);
        return "User Has Been Added Into DataBase.";
    }

//    get User Using User_id
    @GetMapping("/User/{id}")
    public User getUserById(@PathVariable("id") Integer id) {

        return usi.getUserById(id);

    }
//    Get All Users

    @GetMapping("/Users")
    public List<User> getAllUserFromDB(){
        return usi.getAllUsers();
    }
// Delete User By Id
    @DeleteMapping("/deleteUser/{id}")
    public User deleteUserUsingId(@PathVariable("id") Integer id){
        return usi.deleteUserById(id);
    }
// Update User Using Key.
    @PutMapping("/updateUser")
    public User updateUserByUsingId(@RequestBody User user,@RequestParam String key){
        return usi.updateUser(user,key);
    }
}
