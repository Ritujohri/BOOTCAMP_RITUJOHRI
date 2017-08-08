package com.cdk.shop;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by johrir on 8/2/2017.
 */
public class ShoppingCartServiceTest {
    ShoppingCartService shoppingCartService = null;

    @Before
    public void init() {
        shoppingCartService = new ShoppingCartService();
    }

    @After
    public void clean() {
        shoppingCartService = null;

    }

    @Test
    public void testCountItem() {

        Assert.assertEquals(0, shoppingCartService.countItems());
        Product product = new Product(100l, "keyboard", 450.0, 1);
        shoppingCartService.addItem(product);
        Assert.assertEquals(1, shoppingCartService.countItems());
    }

    @Test(expected = ItemNotFoundException.class)
    public void testRemoveNonExistentItem() throws ItemNotFoundException {
        Product product = new Product(100l, "keyboard", 450.0, 1);
        shoppingCartService.addItem(product);
        shoppingCartService.removeItem(200l);
    }

    @Test
    public void testRemoveItem() {
        Product product = new Product(100l, "keyboard", 450.0, 1);
        shoppingCartService.addItem(product);
        try {
            shoppingCartService.removeItem(100l);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(0, shoppingCartService.countItems());
    }

    @Test
    public void testAddItem() {
        Product product = new Product(100l, "keyboard", 450.0, 1);
        int initialSize = shoppingCartService.countItems();
        shoppingCartService.addItem(product);
        int finalSize = shoppingCartService.countItems();
        Assert.assertEquals(1, finalSize - initialSize);

    }

    @Test
    public void testCorrectItemAdded() {
        Product product = new Product(100l, "keyboard", 450.0, 1);
        shoppingCartService.addItem(product);
        Collection<Product> collection = shoppingCartService.showCartDetails();
        Product product1 = collection.iterator().next();
        Assert.assertTrue(product1.getId() == 100l);
        Assert.assertTrue(product1.getName().equals("keyboard"));

    }

    @Test
    public void testAddingOfFiveItem() {
        Product product1 = new Product(100l, "keyboard", 450.0, 1);
        Product product2 = new Product(200l, "mouse", 250.0, 1);
        Product product3 = new Product(300l, "monitor", 4450.0, 1);
        shoppingCartService.addItem(product1);
        shoppingCartService.addItem(product1);
        shoppingCartService.addItem(product2);
        shoppingCartService.addItem(product3);
        shoppingCartService.addItem(product3);
        Assert.assertEquals(5, shoppingCartService.countItems());
    }

    @Test
    public void testDuplicateItem() {
        Product product = new Product(100L, "keyboard", 450.00, 1);
        int initialCartSize = shoppingCartService.countItems();
        shoppingCartService.addItem(product);
        shoppingCartService.addItem(product);
        int currentCartSize = shoppingCartService.countItems();
        Assert.assertEquals(2, (currentCartSize - initialCartSize));

    }

    @Test
    public void testEmptyCart() {
        shoppingCartService.emptyCart();
        Assert.assertEquals(0, shoppingCartService.countItems());
    }

    @Test
    public void testShowDetails() {
        Product product = new Product(100L, "keyboard", 450.00, 1);
        shoppingCartService.addItem(product);
        Collection<Product> collection = shoppingCartService.showCartDetails();
        Product next = collection.iterator().next();
        Assert.assertTrue(next.getName().equals("keyboard"));
        Assert.assertTrue(next.getId() == 100l);
        Assert.assertTrue(next.getQty() == 1);
        Assert.assertTrue(next.getPrice() == 450.0);
    }
    @Test
    public void testTotalPrice(){
        Product product = new Product(100L, "keyboard", 450.00, 1);
        Product product1 = new Product(200L, "monitor", 4400, 1);
        Product product2= new Product(300L, "mouse", 250.0, 1);
        Product product3= new Product(400L, "hard disk", 3000, 1);
shoppingCartService.addItem(product);
        shoppingCartService.addItem(product1);
        shoppingCartService.addItem(product2);
        shoppingCartService.addItem(product3);
        Assert.assertEquals((long)8100.0, (long)shoppingCartService.totalPrice());

    }
}
