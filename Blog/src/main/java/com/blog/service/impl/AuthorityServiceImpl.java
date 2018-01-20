package com.blog.service.impl;

import com.blog.domain.Authority;
import com.blog.repository.AuthorityRepository;
import com.blog.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public Authority findAuthorityById(Long id) {
        return authorityRepository.findOne(id);
    }
}
