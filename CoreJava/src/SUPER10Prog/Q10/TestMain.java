package SUPER10Prog.Q10;

public class TestMain
{
	public static void main(String[] args) 
	{
       
        VolumeCalculator vo = new VolumeCalculator();

        
        double cylinderVolume = vo.calculateVolume(5.0, 10.0);
        System.out.println("Volume of the cylinder (radius 5.0, height 10.0): " + cylinderVolume);

        
        double cuboidVolume = vo.calculateVolume(2, 3, 4);
        System.out.println("Volume of the cuboid (length 2, breadth 3, height 4): " + cuboidVolume);
    }
	
}
