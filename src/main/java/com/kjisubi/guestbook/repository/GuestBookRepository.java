package com.kjisubi.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kjisubi.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
