import static org.junit.jupiter.api.Assertions.*;
import java.lang.Cloneable;
import java.lang.String;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testing {
	
	public static void main(String[] args) {
		//Declaring method of Geometric method to test with
		GeometricObject x = new Square(4);
		
		
		System.out.println(x);

		

}
	@Test
	public Object clone(Short expected, Short result) {
		//testing clone of square
		try {
		return super.clone();
	} catch (Exception e) {
		return null;
	}
	
		
	}
}
