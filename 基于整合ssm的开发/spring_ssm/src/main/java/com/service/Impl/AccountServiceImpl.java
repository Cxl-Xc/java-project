package com.service.Impl;

import com.domain.Account;
import com.mapper.AccountMapper;
import com.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void save(Account account) {
        accountMapper.save(account);

    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }

    @Override
    public List<Account> findById(int id) {
        return accountMapper.findById(id);
    }

    @Override
    public void updateById(Account account) {
        accountMapper.updateById(account);

    }

    @Override
    public void deleteById(int id) {
        accountMapper.deleteById(id);
    }


}
