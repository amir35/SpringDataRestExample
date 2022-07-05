package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.ConsumerEntity;

public interface ConsumerRepository extends JpaRepository<ConsumerEntity, Long> {

}
