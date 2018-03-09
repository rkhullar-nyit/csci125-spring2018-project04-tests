import org.junit.Test;


import static org.junit.Assert.*;

public class PersonTest
{

    @Test
    public void test_equal()
    {
        Person p1 = new Person("Mary", 20);
        Person p2 = new Person("Mary", 20);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void test_not_equal()
    {
        Person p1 = new Person("Mary", 20);
        Person p2 = new Person("Joseph", 21);
        assertFalse(p1.equals(p2));
    }

    @Test
    public void test_to_string()
    {
        Person p = new Person("Joseph", 20);
        String s = p.toString();
        assertEquals("Person(name=Joseph, age=20)", s);
    }

    @Test
    public void test_get_name()
    {
        Person p = new Person("Joseph", 20);
        assertEquals("Joseph", p.getName());
    }

    @Test
    public void test_get_age()
    {
        Person p = new Person("Joseph", 20);
        assertEquals(20, p.getAge());
    }

    @Test
    public void test_set_age()
    {
        Person p = new Person("Joseph", 20);
        p.setAge(40);
        assertEquals(40, p.getAge());
    }

    @Test
    public void test_set_name()
    {
        Person p = new Person("Joseph", 20);
        p.setName("Peter");
        assertEquals("Peter", p.getName());
    }

    @Test
    public void test_constructor()
    {
        Person p = new Person("Mary", 20);
        assertNotNull(p);
    }
}