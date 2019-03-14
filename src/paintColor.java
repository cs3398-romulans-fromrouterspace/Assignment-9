
package carcraft;

public class paintColor extends CarOptions
{
        public String Color;


        public paintColor()
        {
            System.out.println("paintColor Constructor\n");

            Color = "whatever color makes you happy";
        }

        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + Color;
        }
}
