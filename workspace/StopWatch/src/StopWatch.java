import java.util.Date;
public class StopWatch {
	long startTime;
	long endTime;
	public long getStartTime() {
		return startTime;
	}
	public long getEndTime() {
		return endTime;
	}
	StopWatch() {
		Date now = new Date();
		startTime = now.getTime();
	}
	public void start() {
		Date now = new Date();
		startTime = now.getTime();
	}
	public void stop() {
		Date end = new Date();
		endTime = end.getTime();
	}
	public long getElapsedTime() {
		return endTime - startTime;
	}
}
