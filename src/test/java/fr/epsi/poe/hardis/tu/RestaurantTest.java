package fr.epsi.poe.hardis.tu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/* import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*; */

/**
 * Created by medda on 28/02/2017.
 */
public class RestaurantTest {


    public static final String STRING_N = "00336123456789";

    public RestaurantTest() {
    }

    @Test
    public void testThatRestaurantIsOpenByDefault() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        boolean verifie = restaurant.isOuvert();
        // Assert
        Assert.assertTrue(verifie);
    }

 /*   @Test
    public  void conflit () {
    }*/


    @Test
    public void testThatValidPhoneNumberIsCorrectlySaved() {
        Restaurant restaurant = new Restaurant();
        String number = STRING_N;
        restaurant.setNumeroDeTelephone(number);
        Assert.assertEquals("",number, restaurant.getNumeroDeTelephone());
    }

    @Test
    public void testThatInValidPhoneNumberIsNotSaved() {
        Restaurant restaurant = new Restaurant();
        String number = "0061234556789";
        restaurant.setNumeroDeTelephone(number);
        Assert.assertNotEquals("",number, restaurant.getNumeroDeTelephone());
    }

   /* @Test
    public void testThatRestaurantIsNotOpen() {
        // Arrange
        Restaurant restaurant = new Restaurant();
        // Act
        boolean verifie = restaurant.isOuvert();
        // Assert
        Assert.assertFalse(verifie);
    }*/
}