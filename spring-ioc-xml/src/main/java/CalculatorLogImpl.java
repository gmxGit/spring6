public class CalculatorLogImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        System.out.println("[日志]add方法开始了，参数是" + i + "," + j);
        int result = i + j;
        System.out.println("[日志]add方法结束了，结果是" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("[日志]sub方法开始了，参数是" + i + "," + j);
        int result = i - j;
        System.out.println("[日志]sub方法开始了， 结果是" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        System.out.println("[日志]mul方法开始了，参数是" + i + "," + j);
        int result = i * j;
        System.out.println("[日志]mul方法开始了， 结果是" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        System.out.println("[日志]div方法开始了，参数是" + i + "," + j);
        int result = i / j;
        System.out.println("[日志]div方法开始了， 结果是" + result);
        return result;
    }
}
