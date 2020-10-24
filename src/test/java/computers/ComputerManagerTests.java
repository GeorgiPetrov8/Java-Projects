package computers;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerManagerTests {
    private ComputerManager computerManager;
    private Computer computer;

    @Before
    public void init() {
        this.computerManager = new ComputerManager();
        this.computer = new Computer("Test", "Lenovo", 500.00);
    }

    @Test
    public void testGetComputerShouldWork() {
        this.computerManager.addComputer(computer);

        Computer actual = this.computerManager.getComputer("Test", "Lenovo");

        assertEquals(computer,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetComputerShouldThrowForNullManufacture() {
        this.computerManager.addComputer(computer);
        this.computerManager.getComputer(null,"Test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetComputerShouldThrowForNullModel() {
        this.computerManager.addComputer(computer);
        this.computerManager.getComputer("TEst",null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetComputerShouldThrowForMissingComputer() {
        this.computerManager.getComputer("Test","None");
    }

    @Test
    public void testConstructorShouldWork() {
        List<Computer> computers = this.computerManager.getComputers();
        int actualSize = this.computerManager.getCount();

        assertNotNull(computers);
        assertEquals(0, actualSize);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetComputersShouldThrow() {
        this.computerManager.getComputers().add(this.computer);
    }

    @Test
    public void testGetComputersShouldWork() {
        List<Computer> expected = new ArrayList<>();
        expected.add(this.computer);
        expected.add(new Computer("None", "Apple", 1000));

        this.computerManager.addComputer(expected.get(0));
        this.computerManager.addComputer(expected.get(1));

        List<Computer> actual = this.computerManager.getComputers();
        assertNotNull(actual);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddComputerShouldThrowForNull() {
        this.computerManager.addComputer(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddComputerShouldThrowForSameComputer() {
        this.computerManager.addComputer(this.computer);
        this.computerManager.addComputer(this.computer);
    }

    @Test
    public void testAddComputerShouldWork() {
        this.computerManager.addComputer(computer);

        Computer actual = this.computerManager.getComputer(this.computer.getManufacturer(), this.computer.getModel());

        assertEquals(this.computer.getManufacturer(), actual.getManufacturer());
        assertEquals(this.computer.getModel(), actual.getModel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveShouldThrowsForNullManufacture() {
        this.computerManager.getComputer(null, "Test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveShouldThrowsForNullModel() {
        this.computerManager.getComputer("Test", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveShouldThrowIfComputerIsMissing() {
        this.computerManager.removeComputer("Test", "Samsung");
    }

    @Test
    public void testRemoveShouldWork() {
        this.computerManager.addComputer(this.computer);
        assertEquals(1, this.computerManager.getCount());

        Computer actual = this.computerManager
                .removeComputer(this.computer.getManufacturer(), this.computer.getModel());

        assertEquals(this.computer.getManufacturer(), actual.getManufacturer());
        assertEquals(this.computer.getModel(), actual.getModel());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetComputersByManufactureShouldThrow() {
        this.computerManager.getComputersByManufacturer(null);
    }

    @Test
    public void testGetComputersByManufactureShouldWork() {
        List<Computer> expected = new ArrayList<>();
        expected.add(new Computer("None", "Samsung", 800));
        expected.add(new Computer("None", "Apple", 1000));

        this.computerManager.addComputer(expected.get(0));
        this.computerManager.addComputer(expected.get(1));

        List<Computer> actual = this.computerManager.getComputersByManufacturer("None");
        assertNotNull(actual);

        assertEquals(expected.size(), actual.size());

        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    public void testGetCountShouldWork() {
        assertEquals(0, this.computerManager.getCount());

        this.computerManager.addComputer(this.computer);

        assertEquals(1, this.computerManager.getCount());
    }
}