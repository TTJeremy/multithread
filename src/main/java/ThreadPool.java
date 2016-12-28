/**
 * Created by tangtao18555 on 2016/12/28.
 */
public interface ThreadPool<Job extends Runnable> {

    void execute(Job job);
    void shotdown();
    void addWorkers(int num);
    void removeWorkers(int num);
    int getJobSize();
}
