package com.run.api.global.dao;

import com.run.api.global.dto.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {
    List<Account> getUserList();
}
