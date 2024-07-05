import com.npru.se65.id65001.Bmilndexer;
import com.npru.se65.id65001.HumanBeing;
import com.npru.se65.id65001.HealthAnalyzer;

public class TestDrive {
	
	public static void main(String[] args) {
		HumanBeing hb = new HumanBeing();
		hb.setHeight(175);
		hb.setWeight(60);
		hb.calculateBMI();
		System.out.println("BMI : "+hb.getBmi);
		System.out.println(hb.analyzeBmi);
	}
}
