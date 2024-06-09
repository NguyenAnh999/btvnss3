package rikkei.btth.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rikkei.btth.model.User;
import rikkei.btth.service.UserService;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(userService.Getalusers())
        ;
    }

    @PostMapping(value = "/add")
    public ResponseEntity<User> addUser( @RequestBody User user)
    {
       return ResponseEntity.ok(userService.Insertuser(user));
    }
    @PutMapping (value = "/update")
    public  ResponseEntity<User> update(@Valid User user){

        return ResponseEntity.ok(userService.Updateuser(user));
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity<?> delete(@Valid @RequestBody User user)
    {
        userService.Delete(user);

    return ResponseEntity.noContent().build();}

    @GetMapping("/getlistByName")
    public ResponseEntity<List<User>> getListByName(@RequestParam String name)
    {
       return ResponseEntity.ok(userService.GetusersbyfullName(name));

    }

    @GetMapping("/getlistByUserName")
    public ResponseEntity<List<User>> getListByUserName(@RequestParam String name)
    {
        return ResponseEntity.ok(userService.Getuserbyusername(name));

    }


}
