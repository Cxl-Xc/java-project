package com.mapper;

import com.domain.Account;

import java.util.List;

public interface AccountMapper {

    //保存操作
    public void save(Account account);

    //查询操作
    public List<Account> findAll();

    //查询单个
    public  List<Account> findById(int id);

    //更新操作
    public void updateById(Account account);

    void deleteById(int id);
}
