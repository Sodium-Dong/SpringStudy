package com.example.bankdemo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private final AccountRepository repo;

    public AccountService(AccountRepository repo) {
        this.repo = repo;
    }

    public List<Account> listAll() {
        return repo.findAll();
    }

    public Account create(Account account) {
        return repo.save(account);
    }
}
