
package carcraft;

public class paintColor extends CarOptions
{
        public String Color;


        public paintColor()
        {
            System.out.println("paintColor Constructor\n");

            Color = "Whatever Color makes you happy";
        }

        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + Color + " color";
        }
}
