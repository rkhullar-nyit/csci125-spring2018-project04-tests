import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.HashMap;

class TestRunner
{

    private static final int max = 20, min = 2;
    private static final HashMap<String, Integer> penalties = new HashMap<>();

    static
    {
        penalties.put("test_equal", 2);
        penalties.put("test_not_equal", 2);
        penalties.put("test_to_string", 2);
        penalties.put("test_get_name", 2);
        penalties.put("test_get_age", 2);
        penalties.put("test_set_age", 2);
        penalties.put("test_set_name", 2);
        penalties.put("test_constructor", 2);
    }

    public static void main(String[] args)
    {
        Result calculator_result = JUnitCore.runClasses(PersonTest.class);
        Result[] results = new Result[]{calculator_result};

        int grade = max;

        for(Result result: results)
        {
            for (Failure failure : result.getFailures())
            {
                String name = failure.getTestHeader().split("[(]")[0];
                System.err.printf("failed test: %s\n", name);
                grade -= penalties.get(name);
            }
        }

        if(grade < min)
            grade = min;

        System.out.println(grade);
    }
}
