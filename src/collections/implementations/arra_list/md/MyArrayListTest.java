package collections.implementations.arra_list.md;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MyArrayListTest {

    @Test
    public void test01() {
        List<Integer> data = new MyArrayList<>();

        Assert.assertEquals(0, data.size());

        data.add(10);
        Assert.assertEquals(1, data.size());
    }

    @Test
    public void test02() {
        List<Long> data = new MyArrayList<>();

        Assert.assertEquals(0, data.size());

        data.add(10L);
        Assert.assertEquals(1, data.size());
    }

    @Test
    public void test03() {
        List<Integer> data = new MyArrayList<>();

        Assert.assertEquals(0, data.size());

        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(1000);
        Assert.assertEquals(5, data.size());
    }

    @Test
    public void test04() {
        List<Integer> data = new MyArrayList<>();
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(1000);

        data.remove(2);
        Assert.assertEquals(4, data.size());

        Assert.assertEquals(40, data.get(2).intValue());
    }

    @Test
    public void test05() {
        List<Integer> data = new MyArrayList<>();
        data.add(10);
        data.add(20);
        data.add(30);
        data.add(40);
        data.add(1000);
        Assert.assertEquals(3, data.indexOf(40));
    }
}
