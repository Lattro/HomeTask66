public class Sum <T extends Number> {
    private T[] array;

    public Sum(T[] array) {
        this.array = array;
    }

    public void getSum()
    {
        double sum = 0.00;
        for (T val : array)
        {
            sum+=val.doubleValue();
        }
        System.out.println(array.getClass().getName().substring(12).replace(';',' ') + "sum = "+sum);
    }
}
