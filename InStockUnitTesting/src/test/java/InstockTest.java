import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class InstockTest {

    private static final String PRODUCT_LABEL = "test_label";

    private ProductStock stock;
    private Product testProduct;
    private Product[] products;

    @Before
    public void setUp() {
        this.stock = new Instock();
        this.testProduct = new Product(PRODUCT_LABEL,10,1);
    }

    @Test
    public void Test_addShouldSaveNewProductInTheStock() {
        this.stock.add(testProduct);

        assertTrue(this.stock.contains(testProduct));
    }

    @Test
    public void Test_containsShouldWorkProperty() {
        assertFalse(this.stock.contains(testProduct));

        this.stock.add(testProduct);

        assertTrue(this.stock.contains(testProduct));
    }

    @Test
    public void Test_countReturnCurrentSizeOfTheStock() {
        this.stock.add(testProduct);
        int expectedCount = 1;

        assertEquals(expectedCount,this.stock.getCount());
    }

    @Test
    public void Test_findReturnFirstAddedProducts() {
        addProducts(5);

        String expectedLabel = products[0].getLabel();
        String actualLabel = stock.find(0).getLabel();

        assertEquals(expectedLabel,actualLabel);
    }

    @Test
    public void Test_findReturnLastAddedProduct() {
        addProducts(5);

        String expectedLabel = products[products.length - 1].getLabel();
        String actualLabel = stock.find(stock.getCount() - 1).getLabel();

        assertEquals(expectedLabel,actualLabel);
    }

    @Test
    public void Test_findReturnMiddleProduct() {
        addProducts(5);

        String expectedLabel = products[products.length / 2].getLabel();
        String actualLabel = stock.find(stock.getCount() / 2).getLabel();

        assertEquals(expectedLabel,actualLabel);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void Test_findThrowIfGivenIndexIsInvalid() {
        addProducts(5);
        this.stock.find(5);
    }


    @Test
    public void Test_changeQuantityOfTheProductWithThisLabel() {
        this.stock.add(testProduct);
        int expectedQuantity = 2;
        stock.changeQuantity(testProduct.getLabel(), expectedQuantity);
        int actualQuantity = testProduct.getQuantity();

        assertEquals(expectedQuantity,actualQuantity);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_changeQuantityThrowsExceptionIfLabelIsNotINTheStock() {
        this.stock.changeQuantity(testProduct.getLabel(),12);
    }

    @Test
    public void Test_findByLabelReturnProductWithThisLabel() {
        this.stock.add(testProduct);
        this.stock.add(new Product("second",12,2));

       String actualLabel = this.stock.findByLabel(testProduct.getLabel()).getLabel();
       String expectedLabel = testProduct.getLabel();

       assertEquals(expectedLabel,actualLabel);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_findByLabelThrowsIfLabelNotExist() {
        this.stock.findByLabel("NoneExistLabel");
    }

    @Test
    public void Test_findFirstByAlphabeticalOrderReturnCollectionWithProducts() {
        addProducts(10);

        List<Product> expected = Arrays.stream(products)
                .sorted(Comparator.comparing(Product::getLabel))
                .limit(5)
                .collect(Collectors.toList());

        Iterable<Product> iterable = stock.findFirstByAlphabeticalOrder(5);

        assertNotNull(iterable);

        List<Product> actual = new ArrayList<>();
        getListFromIterable(iterable, actual);

        assertEquals(expected.size(),actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertProductsAreEqual(expected.get(i),actual.get(i));
        }
    }

    @Test
    public void Test_findFirstByAlphabeticalOrderReturnEmptyCollectionIfArgumentIsOutOfRange() {
        addProducts(5);

        Iterable<Product> iterable = stock.findFirstByAlphabeticalOrder(6);
        assertNotNull(iterable);

        AtomicInteger actualCount = new AtomicInteger();
        iterable.forEach(p -> actualCount.getAndIncrement());

        assertEquals(0,actualCount.get());
    }

    @Test
    public void Test_findAllInPriceRangeReturnsAllProductsInGivenPriceRange() {
        addProducts(20);
        double lo = 9.0;
        double hi = 15.0;

        List<Product> expected = Arrays.stream(products)
                .filter(p -> p.getPrice() > lo && p.getPrice() <= hi)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList());

        Iterable<Product> iterable = this.stock.findAllInRange(lo, hi);
        assertNotNull(iterable);

        List<Product> actual = new ArrayList<>();
        getListFromIterable(iterable, actual);

        assertListAreEqual(expected, actual);
    }

    @Test
    public void Test_findAllInPriceRangeReturnEmptyCollectionIfThereIsNoSuchProducts() {
        addProducts(10);

        Iterable<Product> iterable = this.stock.findAllInRange(10.0, 14.0);
        AtomicInteger count = new AtomicInteger();
        iterable.forEach(p -> count.incrementAndGet());

        assertEquals(0,count.get());
    }

    @Test
    public void Test_findAllByPriceReturnsAllProductsWithGivenPrice() {
        addProducts(10);
        double price = 7.0;

        List<Product> expected = Arrays.stream(products)
                .filter(p -> p.getPrice() == price)
                .collect(Collectors.toList());

        Iterable<Product> iterable = this.stock.findAllByPrice(price);
        assertNotNull(iterable);

        List<Product> actual = new ArrayList<>();
        getListFromIterable(iterable, actual);

        assertListAreEqual(expected, actual);
    }

    @Test
    public void Test_findAllByPriceReturnEmptyCollectionIfThereIsNoProductsWithGivenPrice() {
        addProducts(5);
        double price = 6;

        Iterable<Product> iterable = this.stock.findAllByPrice(price);
        assertNotNull(iterable);

        AtomicInteger count = new AtomicInteger();
        iterable.forEach(p -> count.getAndIncrement());

        assertEquals(0,count.get());
    }

    @Test
    public void Test_findFirstMostExpensiveProductsReturnFirstProductsWithHighestPrice() {
        addProducts(20);
        int count = 5;

        List<Product> expected = Arrays.stream(products)
                .sorted(Comparator.comparing(Product::getPrice))
                .limit(count)
                .collect(Collectors.toList());

        Iterable<Product> iterable = this.stock.findFirstMostExpensiveProducts(count);
        assertNotNull(iterable);

        List<Product> actual = new ArrayList<>();
        getListFromIterable(iterable, actual);

        assertListAreEqual(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void Test_findFirstMostExpensiveProductsThrowExceptionIfLessThanCountsExist() {
        addProducts(5);
        this.stock.findFirstMostExpensiveProducts(6);
    }

    @Test
    public void Test_findAllByQuantityReturnAllProductWithGivenQuantity() {
        addProducts(10);

        List<Product> expected = new ArrayList<>();

        for (int i = 5; i < 9 ; i++) {
            products[i].setQuantity(48);
            expected.add(products[i]);
        }

        Iterable<Product> iterable = stock.findAllByQuantity(48);
        assertNotNull(iterable);

        List<Product> actual = new ArrayList<>();
        getListFromIterable(iterable, actual);

        assertListAreEqual(expected, actual);
    }

    @Test
    public void Test_findAllByQuantityReturnEmptyCollectionIfThereIsNotSuchProductsWithThisQuantity() {
        addProducts(10);

        Iterable<Product> iterable = this.stock.findAllByQuantity(22);
        assertNotNull(iterable);

        List<Product> actual = new ArrayList<>();
        getListFromIterable(iterable,actual);

        assertTrue(actual.isEmpty());
    }

    @Test
    public void Test_IteratorShouldWorkProperty() {
        addProducts(10);

        List<Product> expected = Arrays.asList(this.products);

        Iterator<Product> iterator = this.stock.iterator();

        List<Product> actual = new ArrayList<>();

        while (iterator.hasNext()) {
            actual.add(iterator.next());
        }

        assertListAreEqual(expected,actual);
    }

    @Test
    public void Test_IteratorShouldReturnEmptyIterator() {
        Iterator<Product> iterator = this.stock.iterator();
        assertFalse(iterator.hasNext());
    }

    private void assertListAreEqual(List<Product> expected, List<Product> actual) {
        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }


    private void assertProductsAreEqual(Product expected, Product actual) {
        assertEquals(expected.getLabel(),actual.getLabel());
        assertEquals(expected.getPrice(),actual.getPrice(),0.00);
        assertEquals(expected.getQuantity(),actual.getQuantity());
    }


    private void addProducts(int count) {
        this.products = new Product[count];
        for (int i = 0; i < count; i++) {
            this.products[i] = new Product("",1 + i,10 + i);
            this.stock.add(products[i]);
        }
    }

    private void getListFromIterable(Iterable<Product> iterable, List<Product> actual) {
        iterable.forEach(actual::add);
    }


}