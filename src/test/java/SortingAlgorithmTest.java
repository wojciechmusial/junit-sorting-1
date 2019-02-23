import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmTest {


        private SortingAlgorithms classUnderTest;
        @Before
        public void setUp() throws Exception {
            classUnderTest = new SortingAlgorithms();
        }

        @Test
        public void testSortowaniaJB1() throws Exception {
            double[] toSort = {5, 1, 3, 2};
            double[] expeccted = {1, 2, 3, 5};

            classUnderTest.sort(toSort, true);
            Assert.assertArrayEquals(expeccted, toSort, 0.0001);

            //Assert.assertTrue(classUnderTest.SortingAlgorithms(kod));

        }


    }
