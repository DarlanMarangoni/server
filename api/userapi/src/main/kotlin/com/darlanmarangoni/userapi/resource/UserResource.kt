package com.darlanmarangoni.userapi.resource

import com.darlanmarangoni.userapi.domain.entity.User
import com.darlanmarangoni.userapi.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource(
    val userRepository: UserRepository
) {

    @GetMapping
    fun listAll(): List<User> {
        return userRepository.findAll();
    }

}