
package lab.pkg06;

public abstract class BaseLogger {
	String label = "Unknown label";
  
	public String getLabel() {
		return label;
	}
 
	public abstract String getLevel();
}