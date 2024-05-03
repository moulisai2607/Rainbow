
public class Verifytitleofhomepage {
	@Test
	public void TC() {
		String et="vtiger";
		 String ht=driver.getTitle();
		 Assert.assertEquals(et,ht,"Both are not matching");
		System.out.println("TC is pass");
		
	}

}
