package com.devcolibri.dataexam.service;

import com.devcolibri.dataexam.entity.Bank;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface BankService {
    Bank add(Bank bank);
    Bank getByName(String name);
    List<Bank> getAll();
    Bank edit(Bank bank);
    void delete(long id);



}
