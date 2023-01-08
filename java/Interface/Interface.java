package Interface;     // 100% absract in nature

public interface Interface 
{
	int a=10;        // public, static, final
	
    void Ashpak();   // public, abstract  	
	
	void Shaikh();   // public, abstract
	
static void velocity() // Jdk 1.3 & Jdk 1.4
  {
	System.out.println("Static method of interface");
  } 
	
default void pune()    // Jdk 1.8
  {
	System.out.println("default kayword method of interface");
  }
}
