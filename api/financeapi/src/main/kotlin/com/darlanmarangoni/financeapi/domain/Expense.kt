package com.darlanmarangoni.financeapi.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.LocalDate
import java.time.LocalDateTime
@Entity
@Table(name = "tb_expense")
class Expense (
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    val id: Long? = null,
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "description")
    val description: String,
    @Column(name = "due_date")
    val dueDate: LocalDate,
    @Column(name = "pay_day")
    val payDay: LocalDate,
    @Column(name = "note")
    val notes: String,
    @UpdateTimestamp
    @Column(name = "updated_date")
    @JsonIgnore
    val updatedDate: LocalDateTime = LocalDateTime.now(),
    @CreationTimestamp
    @Column(name = "created_date")
    @JsonIgnore
    val createdDate: LocalDateTime = LocalDateTime.now(),
)