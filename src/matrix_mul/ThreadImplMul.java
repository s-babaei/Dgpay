package matrix_mul;

public class ThreadImplMul extends Thread {
    private final Integer first;
    private final Integer second;
    private Integer multiplication;

    @Override
    public void run() {
        multiplication = first * second;
    }

    public ThreadImplMul(Integer first , Integer second){
        this.first = first;
        this.second=second;
    }

    public Integer getFirst() {
        return first;
    }

    public Integer getSecond() {
        return second;
    }

    public Integer getMultiplication() {
        return multiplication;
    }
}
