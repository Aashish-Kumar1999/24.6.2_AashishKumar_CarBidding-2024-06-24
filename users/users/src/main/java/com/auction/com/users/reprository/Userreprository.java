package com.auction.com.users.reprository;


import com.auction.com.users.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userreprository  extends JpaRepository<UsersEntity, Long> {
}
