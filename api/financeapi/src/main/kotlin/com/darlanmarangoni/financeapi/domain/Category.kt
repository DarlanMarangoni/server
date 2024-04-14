package com.darlanmarangoni.financeapi.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDateTime

@Entity
@Table(name = "tb_category")
class Category(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    var id: Long? = null,
    @Column(name = "name", nullable = false)
    val name: String,
    @UpdateTimestamp
    @Column(name = "updated_date")
    @JsonIgnore
    val updatedDate: LocalDateTime = LocalDateTime.now(),
    @CreationTimestamp
    @Column(name = "created_date")
    @JsonIgnore
    val createdDate: LocalDateTime = LocalDateTime.now()
)