package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class AddressBookMainTest {
    @Test
    void givenPersonDetails_WhenChecked_ShouldReturnTrue() {
        AddressBookMain addressBookService = new AddressBookMain();
        boolean result = addressBookService.validateName("Sachin");
        Assertions.assertTrue(result);
    }
}
