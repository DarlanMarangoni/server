package com.darlanmarangoni.financeapi.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
@Table(name = "tb_bank_statement")
class BankStatement(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    val id: Long? = null,
    @Column(name = "name", nullable = false)
    val name: String,
    @Column(name = "description", nullable = false)
    val description: String,
    @Column(name = "value", nullable = false)
    val value: BigDecimal,
    @UpdateTimestamp
    @Column(name = "updated_date")
    @JsonIgnore
    val updatedDate: LocalDateTime = LocalDateTime.now(),
    @CreationTimestamp
    @Column(name = "created_date")
    @JsonIgnore
    val createdDate: LocalDateTime = LocalDateTime.now(),
    @ManyToOne
    @JoinColumn(name = "category_id")
    val category: Category
)