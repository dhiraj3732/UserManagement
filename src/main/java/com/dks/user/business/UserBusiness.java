package com.dks.user.business;

import com.dks.user.Repository.UserRepository;
import com.dks.user.vo.UserVo;
import com.dks.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBusiness {
    @Autowired
    private UserRepository userRepository;

    public UserVo getUser(int id) {
        User user = userRepository.findById(id).get();
        return new UserVo(user.getId(), user.getName(), user.getEmail());
    }

}
