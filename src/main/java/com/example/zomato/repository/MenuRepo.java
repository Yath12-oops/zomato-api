package com.example.zomato.repository;

import com.example.zomato.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu,Integer> {
}
