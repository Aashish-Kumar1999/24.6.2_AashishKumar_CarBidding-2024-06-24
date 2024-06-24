package com.auction.com.users.service;

import com.auction.com.users.entity.UsersEntity;
import com.auction.com.users.reprository.Userreprository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Userservice {

    private Userreprository userreprository;

    public RestTemplate restTemplate;

    public UsersEntity save(UsersEntity user) {
        return  userreprository.save(user);
    }

    public void updateuser(Long UserId, UsersEntity user) {
        userreprository.save(user);

    }
    public void deleteUser(Long UserId) {
        userreprository.deleteById(UserId);

    }
    public List<UsersEntity> getallUsers() {
        List<UsersEntity> list = (List<UsersEntity>) this.userreprository.findAll();
        return list;
    }


}
