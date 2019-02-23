import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.Random;
public class SortingAlgorithmTest {
    private SortingAlgorithms classUnderTest;

    @Before

    public void setUp() throws Exception {
        classUnderTest = new SortingAlgorithms();
    }


    @Test
    public void testSortowaniaMN1() {
        double[] toSort = {5, 1, 3, 2};

        double[] expected = {1, 2, 3, 5};

        classUnderTest.sort(toSort, true);

        Assert.assertArrayEquals(expected, toSort, 0.001);

    }


    @Test
    public void testSortowaniaJB1() throws Exception {
        double[] toSort = {5, 1, 3, 2};
        double[] expected = {1, 2, 3, 5};

        classUnderTest.sort(toSort, true);
        Assert.assertArrayEquals(expected, toSort, 0.0001);

    }

    @Test
    public void testSortowaniaJB2() throws Exception {
        double[] toSort = {5, 1, 3, 2};
        double[] expected = {5, 3, 2, 1};

        classUnderTest.sort(toSort, false);
        Assert.assertArrayEquals(expected, toSort, 0.0001);

    }

    @Test
    public void testSortowaniaJB3() throws Exception {
        double[] toSort = {5, 1, 3, 2};
        double[] expected = {5, 3, 2, 1};

        classUnderTest.sort(toSort, false);
        Assert.assertArrayEquals(expected, toSort, 0.0001);

    }


    @Test
    public void testSortowaniaJB4() throws Exception {
        double[] toSort = {5, 1, 3, 2, 6};
        double[] expected = {6, 5, 3, 2, 1};

        classUnderTest.sort(toSort, false);
        Assert.assertArrayEquals(expected, toSort, 0.0001);

    }

    @Test
    public void testSortowaniaJB9() throws Exception {
        double[] toSort = {5, 8, 1, 3, 2, 7, 6};
        double[] expeccted = {8, 7, 6, 5, 3, 2, 1};

        classUnderTest.sort(toSort, false);
        Assert.assertArrayEquals(expeccted, toSort, 0.0001);
    }

    @Test
    public void testSortowaniaJB9() throws Exception {
        double[] toSort = new double[10000];
        Random r = new Random();
        for (int i = 0; i < toSort.length; i++)
            toSort[i] = r.nextDouble();
        classUnderTest.sort(toSort, true);
        for (int i = 0; i < toSort.length - 1; i++) {
            Assert.assertTrue(toSort[i] <= toSort[i + 1]);
        }
    }

}

