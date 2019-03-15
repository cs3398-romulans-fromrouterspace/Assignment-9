/*	This is the default decorator class.
 *
 *	With no changes from subclasses which extend this class, the car is a
 *	base model.  Any request for descriptions return base model.  Once
 *	changes have been made by subclasses, the returnDescription() method
 *	will yield the changes.
 *
 *	Anne Leach
 *	v.1 - 3/11/19
 */

package carcraft;

abstract class CarOptions implements ICar{

	protected ICar carMod;

	public CarOptions(ICar carMod){
		this.carMod = carMod;
	}

	public String GetDescription(){
		return carMod.GetDescription();
	}
}
