package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class UserUnitTest {

    @Test
    void given123Password_whenPasswordIsNotValid_thenIsFalse() {
        User user = new CommonUser("Test", "123");

        assertThat(user.passwordIsValid()).isFalse();
    }
}
