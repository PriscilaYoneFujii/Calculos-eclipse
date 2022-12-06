package beans;
import java.util.List;
public interface RangeJump {
	public abstract List<Integer> range(int n, int m);
	public abstract List<Integer> rangeSkip(int h, int j, int k);
	public abstract List<Integer> rangeRetro(int n, int m);
	public abstract List<Integer> rangeSkipRetro(int h, int j, int k);
}
