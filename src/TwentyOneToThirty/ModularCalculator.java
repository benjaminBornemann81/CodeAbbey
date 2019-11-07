package TwentyOneToThirty;

public class ModularCalculator {
	
	public static int ModuloCalc(String str)  {
		String[] teile = str.split(" ");
		int a = Integer.parseInt(teile[0]);
		for (int i = 1; i < teile.length; i++)  {
			if (teile[i].equals("+"))  {
				a += Integer.parseInt(teile[i+1]);
			} else if (teile[i].equals("*"))  {
				a *= Integer.parseInt(teile[i+1]);
			} else if (teile[i].equals("%"))  {
				a %= Integer.parseInt(teile[i+1]);
			}
		}
		return a;
	} // ModuloCalc Ende
	
	
	//----------------------------main-------------------------------
	public static void main(String[] args) {
		String werte = "5 + 3 * 7 + 10 * 2 * 3 + 1 % 11";
		String[] teile = werte.split(" ");
		System.out.println("input data: ");
		System.out.println(teile[0]);
		for (int i = 1; i < teile.length; i += 2)  {
			System.out.println(teile[i] + " " + teile[i+1]);
		}

		System.out.println();
		
		System.out.println("answer: ");
		System.out.println(ModuloCalc(werte));
		
	} // main Ende

} // ModularCalculator Ende
