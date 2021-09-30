package com.dev.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.Entity.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB,Integer> {

}
