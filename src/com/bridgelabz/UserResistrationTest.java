
	package com.bridgelabz;

	import org.junit.Test;
	import org.junit.Assert;
	/***
	 * 
	 * @author Admin
	 *
	 */
	public class UserResistrationTest {
		UserResistration junit = new UserResistration();

		@Test
		public void happyTestFirstName()
		{
			boolean result = junit.firstName("Shrikant");
			Assert.assertEquals(true, result);
		}
		@Test
		public void sadTestFirstName()
		{
			boolean result = junit.firstName("kant");
			Assert.assertEquals(false, result);
		}
		
		 
		@Test
		public void happyTestLastName() {
			boolean result =junit.lastName("Sollapure");
			Assert.assertEquals(true, result);
		}
		@Test
		public void sadTestLastNmae() {
			boolean result =junit.lastName("sollapure");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void happyTestEmailId() {
			boolean result = junit .emailId("abc.xyz@bl.co.in");
			Assert.assertEquals(true, result);
		}
		@Test
		public void sadTestEmailId() {
			boolean result = junit.emailId("Abc.1xy@.bl.src.in");
			Assert.assertEquals(false, result);
		}
		
		@Test
		public void happyTestMobileNumber() {
			boolean result = junit.mobileNumber("91 9668786785");
			Assert.assertEquals(true, result);
		}
		@Test
		public void sadTestMobileNumber() {
			boolean result = junit.mobileNumber("91 4113264303");
			Assert.assertEquals(false, result);
	   }
		
		@Test
	    public void happyTestPassword(){
		 boolean result = junit.passWord("Ratanr@13");
		 Assert.assertEquals(true, result);
	    }
		@Test
	 	public void sadTestPassword(){
			boolean result = junit.passWord("Ratanr12");
			Assert.assertEquals(false, result);
		}


}
