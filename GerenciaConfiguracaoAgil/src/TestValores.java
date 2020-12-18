import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

	public class TestValores {
		private Valores valores;
		@Before
		public void setUP() throws Exception {
		valores = new Valores();
		valores.ins(5);
		valores.ins(12);
		valores.ins(1);
		valores.ins(30);
		valores.ins(152);
		valores.ins(6);
		}	
	/*	
		@Test
		public void testIns() {
		assertEquals(false, val.ins(-10));
		assertEquals(false,val.ins(0));
		val.ins(2);
		assertEquals(7,val.size());
		val.ins(3);
		assertEquals(8,val.size());
		val.ins(4);
		assertEquals(9,val.size());
		val.ins(5);
		assertEquals(10,val.size());
		assertEquals(false,val.ins(11));
		}
*/
	@Test
	public void testInsereValores() {
		Assert.assertEquals(false, valores.ins(-10));
		Assert.assertEquals(false, valores.ins(0));
		valores.ins(2);
		Assert.assertEquals(7, valores.size());
		valores.ins(3);
		Assert.assertEquals(8, valores.size());
		valores.ins(4);
		Assert.assertEquals(9, valores.size());
		valores.ins(5);
		Assert.assertEquals(10, valores.size());
		Assert.assertEquals(false, valores.ins(11));
	}
	
	
	@Test
	public void testDeletaValores() {
		Assert.assertEquals(5,valores.del(0));
		Assert.assertEquals(0,valores.del(0));
		Assert.assertEquals(12,valores.del(1));
		Assert.assertEquals(1,valores.del(2));
		Assert.assertEquals(30,valores.del(3));
		Assert.assertEquals(152,valores.del(4));
		Assert.assertEquals(6,valores.del(5));
		Assert.assertEquals(-1,valores.del(0));
		Assert.assertEquals(-1,valores.del(1));
		Assert.assertEquals(-1,valores.del(2));
		Assert.assertEquals(-1,valores.del(10));
	}

}
