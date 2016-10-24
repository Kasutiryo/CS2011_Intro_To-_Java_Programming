//Atlanta, Georgia --> 33.7489954,-84.3879824
//Charlotte, North Carolina --> 35.2270869,-80.84312669999997
//Savannah, Georgia --> 32.0835407,-81.09983419999998
//Orlando, Florida --> 28.5383355,-81.37923649999999
public class HW05P02 {
	public static void main(String[] args) {
		final double AG_X = 33.7489954;
		final double AG_Y = -84.3879824;
		final double CNA_X = 35.2270869;
		final double CNA_Y = -80.84312669999997;
		final double SG_X = 32.0835407;
		final double SG_Y = -81.09983419999998;
		final double OF_X = 28.5383355;
		final double OF_Y = -81.37923649999999;
		final double RAD_OF_EARTH = 6371.01;
		double distanceAC = RAD_OF_EARTH * Math.acos((Math.sin(AG_X) * Math.sin(CNA_X)) + (Math.cos(AG_X) * Math.cos(CNA_X) * Math.cos(AG_Y - CNA_Y)));
		double distanceCS = RAD_OF_EARTH * Math.acos((Math.sin(CNA_X) * Math.sin(SG_X)) + (Math.cos(CNA_X) * Math.cos(SG_X) * Math.cos(CNA_Y - SG_Y)));
		double distanceSO = RAD_OF_EARTH * Math.acos((Math.sin(SG_X) * Math.sin(OF_X)) + (Math.cos(SG_X) * Math.cos(OF_X) * Math.cos(SG_Y - OF_Y)));
		double distanceOA = RAD_OF_EARTH * Math.acos((Math.sin(OF_X) * Math.sin(AG_X)) + (Math.cos(OF_X) * Math.cos(AG_X) * Math.cos(OF_Y - AG_Y)));
		double distanceAS = RAD_OF_EARTH * Math.acos((Math.sin(AG_X) * Math.sin(SG_X)) + (Math.cos(AG_X) * Math.cos(SG_X) * Math.cos(AG_Y - SG_Y)));
		double s = (distanceAC + distanceCS + distanceAS)/2;
		double s2 = (distanceAS + distanceSO + distanceOA)/2;
		double area = (int)(Math.sqrt(s * (s - distanceAC)*(s - distanceCS)*(s - distanceAS)) + Math.sqrt(s2 * (s2 - distanceAS)*(s2 - distanceSO)*(s2 - distanceOA)) * 10000) / 10000.0;
		System.out.println("The Area of the four cities is: " + area);
	}
}