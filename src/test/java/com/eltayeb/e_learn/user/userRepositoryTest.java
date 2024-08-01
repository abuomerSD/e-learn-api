package com.eltayeb.e_learn.user;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase
public class userRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void userRepository_save_ReturnsSavedUser() {
        // Arrange
        User user = User.builder()
                .username("Ahmed")
                .password("pass elewekl")
                .role("teacher")
                .build();

        // Act
        User savedUser = userRepository.save(user);

        // Assert

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isNotNull();
    }

    @Test
    public void userRepository_findById_ReturnsUser() {
        // Arrange
        User user = User.builder()
                .username("Username")
                .password("password")
                .role("role")
                .build();

        User savedUser = userRepository.save(user);

        // Act
        User userReturn = userRepository.findById(savedUser.getId()).get();

        // Assert
        Assertions.assertThat(userReturn).isNotNull();
    }

    @Test
    public void userRepository_findAll_returnsUsersList() {
        // Arrange
        User user1 = User.builder()
                .username("User1")
                .password("password1")
                .role("role1")
                .build();

        User user2 = User.builder()
                .username("User2")
                .password("password2")
                .role("role2")
                .build();

        userRepository.save(user1);
        userRepository.save(user2);

        // Act
        List<User> list = userRepository.findAll();

        // Assert
        Assertions.assertThat(list).isNotNull();
        Assertions.assertThat(list.size()).isEqualTo(2);
    }

    @Test
    public void userRepository_updateUser_mustUpdateUserDetails() {
        // Arrange
        User user = User.builder()
                .username("user")
                .password("password")
                .role("role")
                .build();

        User user1 = userRepository.save(user);

        User userSaved = userRepository.findById(user1.getId()).get();

        userSaved.setUsername("user updated");
        userSaved.setPassword("password updated");
        userSaved.setRole("role updated");

        // Act
        User userUpdated = userRepository.save(userSaved);

        // Assert
        Assertions.assertThat(userUpdated).isNotNull();
        Assertions.assertThat(userUpdated.getUsername()).isEqualTo("user updated");
        Assertions.assertThat(userUpdated.getPassword()).isEqualTo("password updated");
        Assertions.assertThat(userUpdated.getRole()).isEqualTo("role updated");
    }

    @Test
    public void userRepository_deleteUser_mustDeleteUser() {
        // Arrange
        User user = User.builder()
                .username("username")
                .password("password")
                .role("role")
                .build();

        User userSaved = userRepository.save(user);

        // Act
        userRepository.deleteById(userSaved.getId());
        Optional<User> userReturn = userRepository.findById(userSaved.getId());

        // Assert
        Assertions.assertThat(userReturn).isEmpty();
    }


}
