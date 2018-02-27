package com.netlight.tech101.oop.exercise2.support;

import java.math.BigDecimal;

public interface UserManager {

    boolean existsUser(String username);

    BigDecimal getBalance(String username);

}
