
package carcraft;

public class paintColor extends CarOptions
{
        public String Color;


        public PaintedCarWithSuperCharger(String color)
        {
            System.out.println(" paintColor Constructor\n");

            Color = color;
        }

        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + Color + " color";
        }
}
