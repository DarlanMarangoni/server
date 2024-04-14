package com.darlanmarangoni.financeapi.resource

import com.darlanmarangoni.financeapi.domain.Category
import com.darlanmarangoni.financeapi.repository.CategoryRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/categories")
class CategoryResource(
    val categoryRepository: CategoryRepository
) {

    @GetMapping
    fun findAll(): List<Category> {
        return categoryRepository.findAll()
    }
}