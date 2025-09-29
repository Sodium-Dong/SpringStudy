package com.example.bankdemo.account;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/accounts")
public class AccountController {
    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    public String list(Model model) {
        List<Account> accounts = service.listAll();
        model.addAttribute("accounts", accounts);
        return "accounts";
    }

    @PostMapping
    public String create(@RequestParam String owner, @RequestParam Double balance) {
        service.create(Account.builder().owner(owner).balance(balance).build());
        return "redirect:/accounts";
    }
}
