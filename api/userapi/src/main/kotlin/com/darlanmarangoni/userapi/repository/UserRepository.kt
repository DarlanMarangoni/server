package com.darlanmarangoni.userapi.repository

import com.darlanmarangoni.userapi.domain.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Long>