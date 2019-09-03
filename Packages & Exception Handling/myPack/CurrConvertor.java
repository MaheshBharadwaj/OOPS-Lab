package myPack;


class CurrConvertor{
	private class Currency{
		private float value;
		private String currency;
		private float ratio;
		public Currency(float value,char currency){
			this.value = value;
			this.currency = currency;
			if(currency.equals("Euro"))
				ratio = 90.0f;
			else if(currency.equals("Dollar"))
				ratio = 70.0f;
			else if(currency.equals("Yen"))
				ratio = 20.0f;
			else ratio = 1.0f;
		} 

		public float getValue(){return value;}
		public char getCurrency(){return currency;}
		public float getRation(){return ratio;}
	}
	public Currency curr1,curr2;

	

