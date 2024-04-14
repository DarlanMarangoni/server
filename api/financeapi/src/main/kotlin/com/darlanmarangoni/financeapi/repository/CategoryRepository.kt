package com.darlanmarangoni.financeapi.repository

import com.darlanmarangoni.financeapi.domain.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository: JpaRepository<Category, Long>