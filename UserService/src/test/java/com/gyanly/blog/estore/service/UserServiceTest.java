package com.gyanly.blog.estore.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {
    @InjectMocks
    UserServiceImpl userService;

    @Mock
    UsersRepository usersRepository;
    String firstName;
    String lastName;
    String email ;
    String password;
    String repeatPassword;
@BeforeEach
void init(){
//    userService = new UserServiceImpl(usersRepository);
    firstName = "Chetan";
    lastName = "Phogat";
    email = "gyancv@gmail.com";
    password = "123456";
    repeatPassword = "123456";
}

    @Test
    void testCreateUser_whenUserDetailsProvided_returnsUserObject(){
//    Arrange
        Mockito.when(usersRepository.save(Mockito.any(User.class))).thenReturn(true);
    //        Act
    User user = userService.createUser(firstName,lastName,email,password,repeatPassword);
//        Assert
        assertNotNull(user, "The createUser() should not have returned NULL");
        assertEquals(firstName,user.getFirstName(),"user don't have first name");
        assertEquals(lastName,user.getLastName(),"User's Last name is incorrect");
//        assertEquals(email,user.getEmail(),"User's email is incorrect");
        assertNotNull(user.getId(),"User Id is missing");
    }

    @DisplayName("Empty first name causes correct exception")
    @Test
    void testCreateUser_whenFirstNameIsEmpty_throwsIllegalArgumentException(){
//        Arrange
        String firstName = "";
        String expectedExceptionMessage = "User's First name is empty";

//        Act & Assert
         IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,()->{
            userService.createUser(firstName,lastName,email,password,repeatPassword);
        },"Empty first name should have cause an Illegal Argument Exception");

//        Assert
        assertEquals(expectedExceptionMessage,thrown.getMessage());
    }
}
