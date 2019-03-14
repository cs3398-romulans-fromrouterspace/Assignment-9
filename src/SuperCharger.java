
package carcraft;

public class SuperCharger extends CarOptions
{
        public String SuperCharger;


        public SuperCharger()
        {
            System.out.println(" Super Charger Constructor\n");
            SuperCharger = "Super Charged!";
        }

        @Override
        public String GetDescription()
        {
            return super.GetDescription() + " with " + SuperCharger + " color";
        }
}
