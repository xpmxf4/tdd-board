package com.study.tddboard.common.entity;

import java.util.*;

public enum Role {
    USER("일반 사용자"),
    ADMIN("관리자"),
    SUDO("슈퍼 관리자");

    private String roleName;
    private static final Map<String, Role> roleMap = new HashMap<>();

    static {
        // 모든 Role Enum 상수에 대해 Map에 넣음
        Arrays.stream(Role.values()).forEach(
                role -> roleMap.put(role.roleName, role)
        );
    }

    Role(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public static Role getRoleByRoleName(String roleName) {
        return roleMap.get(roleName);
    }
}
