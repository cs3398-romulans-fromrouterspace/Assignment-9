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

public class CarOptions implements ICar{

	public String desc = "Base model.";		

	public CarOptions(){
		System.out.println("Abstract CarOptions Constructor - no modifications yet.");
	}

	@Override
	public String getDescription(){
		return desc;
	}

}