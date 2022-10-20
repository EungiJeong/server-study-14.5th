package com.example.todo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.todo.Domain.Member;


public interface MemberRepository extends JpaRepository<Member,Long> {
	Optional<Member> findByEmail(String email);
	Optional<Member> findByName(String name);
}
