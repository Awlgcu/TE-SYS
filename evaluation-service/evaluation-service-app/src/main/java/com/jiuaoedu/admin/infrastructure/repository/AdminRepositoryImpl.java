package com.jiuaoedu.admin.infrastructure.repository;

import com.jiuaoedu.admin.infrastructure.repository.jpa.AdminJpaRepository;
import com.jiuaoedu.admin.pojo.dto.AdminDTO;
import com.jiuaoedu.admin.domain.aggregate.Admin;
import com.jiuaoedu.admin.domain.gateway.repository.AdminRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/4 16:25
 * @version: 1.0
 */
@Repository
public class AdminRepositoryImpl implements AdminRepository {
    @Resource
    private AdminJpaRepository jpaRepository;

    @Override
    public Optional<Admin> findById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public Admin save(Admin admin) {
        return jpaRepository.save(admin);
    }

    @Override
    public Admin saveAndFlush(Admin admin) {
        return jpaRepository.saveAndFlush(admin);
    }

    @Override
    public List<Admin> saveAll(List<Admin> admins) {
        return jpaRepository.saveAll(admins);
    }

    @Override
    public List<Admin> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public void delete(Admin admin) {
        jpaRepository.delete(admin);
    }

    @Override
    public List<Admin> findByIdIn(List<Long> ids) {
        return jpaRepository.findAllById(ids);
    }

    @Override
    public List<AdminDTO> findAllDTO() {
        return jpaRepository.findAllDTO();
    }

    @Override
    public List<Admin> findByNameLike(String name) {
        return jpaRepository.findByNameLike(name);
    }
}
