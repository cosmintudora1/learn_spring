package com.cosmin.springcourse.SpringCourse.repositories;

import com.cosmin.springcourse.SpringCourse.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
