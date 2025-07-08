package Assignment09.problem_statement.ext;

import Assignment09.problem_statement.*;

public class Main {
    public static void main(String[] args) {

        Expr expr = new Multiply(
                new Add(new Constant(2), new Constant(3)),
                new Constant(4)
        );

        int result = Evaluator.eval(expr);
        System.out.println("Result is: " + result);

        //C:\Users\moham\.jdks\openjdk-24.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2025.1.1.1\lib\idea_rt.jar=51053" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath "C:\Users\moham\.jdks\openjdk-24.0.1\bin\jshell.exe;C:\Users\moham\Documents\MIU\MPP\MPP Labs\out\production\MPP Labs" Assignment9.problem_statement.ext.Main
        // Result is: 20
        // Process finished with exit code 0
    }

}
