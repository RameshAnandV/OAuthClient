package com.ranand.demo.oauthclient.resources;

import com.ranand.demo.oauthclient.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ramesh Anand
 */

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping("getUser/{id}")
    public User getUserById(@PathVariable("id") String id) {
        return new User("ranand", 5);
    }
}
