/*
Kendra Maggiore

My code and the teams code follows single responsibility principle becuase we only gave each class one part of the car
to handle. My class is only responsible for the painting of the cars

My code and the teams code follows open/close becuase we extened on ICar and BasicCar, we were closed to modification, but
open to extending with other classes. My code is also closed to modification on existing classes but we could create a new class

My code and the teams code follows Liskov Substitution Principle becase our super class could be replaced with its
subclasses without breaking the code. My code uses the super class for GetDescription without breaking the code

The teams code follows Interface Segregation Principle because we have the ICar interface Segregated from
everthing else because ever class uses it. My code uses the interface ICar to be able to use GetDescription

My code and the teams code follows Dependency Inversion Principle becuase changes to the small classes don't
affect the bigger class CarOptions. My code paintColor does not change CarOptions at all

*/

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
