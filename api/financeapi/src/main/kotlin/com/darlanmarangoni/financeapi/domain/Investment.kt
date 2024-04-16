package com.darlanmarangoni.financeapi.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

class Investment (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    val id: Long? = null,
    @Column(name = "code", nullable = false)
    val code: String,
    @Column(name = "amount", nullable = false)
    val amount: Int,
    val name: String,
    @UpdateTimestamp
    @Column(name = "updated_date")
    @JsonIgnore
    val updatedDate: LocalDateTime = LocalDateTime.now(),
    @CreationTimestamp
    @Column(name = "created_date")
    @JsonIgnore
    val createdDate: LocalDateTime = LocalDateTime.now(),
)