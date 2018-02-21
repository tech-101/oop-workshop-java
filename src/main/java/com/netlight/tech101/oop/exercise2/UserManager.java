package com.netlight.tech101.oop.exercise2;

import java.math.BigDecimal;

public interface UserManager {

    boolean existsUser(String username);

    BigDecimal getBalance(String username);

    String getUserNameForDeviceId(String deviceId);

}
