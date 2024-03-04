package spring5;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class GreetingTest {
	private Greeting target = new Greeting();
	
	@Test
	public void getMessage_아침인사() {
		String msg = this.target.getMessage(5);
		assertThat(msg, is("좋은아침"));
	}
	@Test
	public void getMessage_평상시() {
		String msg = this.target.getMessage(11);
		assertThat(msg, is("안녕"));
	}
	@Test
	public void getMessage_밤인사() {
		String msg = this.target.getMessage(17);
		assertThat(msg, is("수고많다"));
	}
}
