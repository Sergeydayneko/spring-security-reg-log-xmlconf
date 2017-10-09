package ru.dayneko.security.dao;

import ru.dayneko.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
