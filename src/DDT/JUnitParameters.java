package DDT;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value=Parameterized.class)
public class JUnitParameters {
	String email;
	String password;
	@Test
	public void RunnerTest() {
		System.out.println(email + " " +password);
	}
	@Parameters
	public static List<String[]> getData(){
		return CSV.get("C:\\Bhuvana\\files\\Users.csv");
	}
	public JUnitParameters(String email,String password){
		this.email=email;
		this.password=password;
	}
}
