package com.darlanmarangoni.userapi.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "TB_USER")
class User (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,
    val name: String,
    val age: Int
)
