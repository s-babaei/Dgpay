package matrix_mul;

public class ThreadImplSum extends Thread {
    private final Integer first;
    private final Integer second;
    private Integer sum;

    public ThreadImplSum(Integer first, Integer second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void run() {
        sum = first + second;
    }

    public Integer getFirst() {
        return first;
    }

    public Integer getSecond() {
        return second;
    }

    public Integer getSum() {
        return sum;
    }
}
